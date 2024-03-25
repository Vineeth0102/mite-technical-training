#include <ctype.h>
#include <stdio.h>
#include <string.h>

// Morse code mapping
const char *morseCode[] = {
    ".-",     "-...",   "-.-.",   "-..",    ".",      "..-.",   "--.",
    "....",   "..",     ".---",   "-.-",    ".-..",   "--",     "-.",
    "---",    ".--.",   "--.-",   ".-.",    "...",    "-",      "..-",
    "...-",   ".--",    "-..-",   "-.--",   "--..",   "-----",  ".----",
    "..---",  "...--",  "....-",  ".....",  "-....",  "--...",  "---..",
    "----.",  ".-.-.-", "--..--", "..--..", "-....-", "-..-.",  ".--.-.",
    "-.--.",  "-...-",  ".----.", "-.-.--", "-.--.",  ".-..-.", "---...",
    "-.-.-.", "-....-", "..--.-", ".-.-.",  "-.--.-", "-...-",  ".-.-",
    "-..-",   "..--.-"};

// Function to convert text to Morse code
void textToMorse(const char *text) {
  for (int i = 0; text[i]; i++) {
    char c = toupper(text[i]);
    if (c >= 'A' && c <= 'Z') {
      printf("%s ", morseCode[c - 'A']);
    } else if (c >= '0' && c <= '9') {
      printf("%s ", morseCode[c - '0' + 26]);
    } else if (c == ' ') {
      printf("   "); // 3 spaces for word separation
    }
  }
  printf("\n");
}

// Function to convert Morse code to text
void morseToText(const char *morse) {
  char *token = strtok((char *)morse, " ");
  while (token != NULL) {
    int found = 0;
    for (int i = 0; i < 36; i++) {
      if (strcmp(token, morseCode[i]) == 0) {
        if (i < 26) {
          printf("%c", 'A' + i);
        } else if (i < 36) {
          printf("%c", '0' + i - 26);
        }
        found = 1;
        break;
      }
    }
    if (!found && strcmp(token, " ") == 0) {
      printf(" "); // Word separation
    }
    token = strtok(NULL, " ");
  }
  printf("\n");
}

// Function to display letters with Morse symbols
void displayMorseSymbols() {
  for (int i = 0; i < 36; i++) {
    printf("%c: %s\n", (i < 26) ? ('A' + i) : ('0' + i - 26), morseCode[i]);
  }
}

int main() {
  int choice;
  char input[100];

  printf("%c[4;3;35m\t\t\t\t\tWelcome to Morse Code Converter\n%c[0m", 27, 27);
  do {
    printf("\n\t%c[4mMenu\n%c[0m\n", 27, 27);
    printf("1. Text to Morse\n");
    printf("2. Morse to Text\n");
    printf("3. Display Letters with Morse Symbols\n");
    printf("4. Exit\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
    case 1:
      printf("Enter text: ");
      scanf(" %[^\n]", input);
      textToMorse(input);
      break;
    case 2:
      printf("Enter Morse code (separate letters with spaces): ");
      scanf(" %[^\n]", input);
      morseToText(input);
      break;
    case 3:
      displayMorseSymbols();
      break;
    case 4:
      printf("%c[4;3;35m\t\t\tThank you for using our code, Hope to see you "
             "again soon :)\n%c[0m",
             27, 27);
      break;
    default:
      printf("%c[4;3;35m\t\t\t Invalid choice :( \n%c[0m", 27, 27);
    }
  } while (choice != 4);

  return 0;
}
