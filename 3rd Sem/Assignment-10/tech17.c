/*
The program will recieve 3 English words inputs from STDIN
These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by %
The second word should be changed like all consonants should be replaced by #
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them
Other than these concatenated word, no other characters/string should or message should be written to STDOUT
For example if you print how are you then output should be h%wa#eYOU.
You can assume that input of each word will not exceed more than 5 chars 
*/

#include<stdio.h>
#include<string.h>
void main(){
    char word1[15],word2[5],word3[5];
    int j,k=0;
    printf("Enter the three words : ");
    scanf("%s%s%s",word1,word2,word3);
    for(int i=0;word1[i]!='\0';i++){
        if(word1[i]=='a'||word1[i]=='e'||word1[i]=='i'||word1[i]=='o'||word1[i]=='u'){
            word1[i]='%';
        }
    }
    for(int i=0;word2[i]!='\0';i++){
        if(word2[i]!='a'&&word2[i]!='e'&&word2[i]!='i'&&word2[i]!='o'&&word2[i]!='u'){
            word2[i]='#';
        }
    }
    for(int i=0;word3[i]!='\0';i++){
        word3[i]=word3[i]-32;
    }
    strcat(word1,strcat(word2,word3));
    printf("%s",word1);
}
