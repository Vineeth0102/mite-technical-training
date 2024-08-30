"""Have the function PalindromeTwo(str) take the str parameter being passed and
return the string true if the parameter is a palindrome, (the string is the same forward as it is
backward) otherwise return the string false. The parameter entered may have punctuation and
symbols but they should not affect whether the string is in fact a palindrome. For example:
“Anne, I vote more cars race Rome-to-Vienna” should return true."""


def PalindromeTwo(String) -> bool :
    ref = ""
    String = String.lower()
    for i in String:
        if i.isalnum():
            ref += i
    if ref == ref[::-1]:
        return True
    else :
        return False



String = input("Enter the String : ")
res = PalindromeTwo(String)
if res == True :
    print("They are palindrome")
else :
    print("They are not a palindrome")
