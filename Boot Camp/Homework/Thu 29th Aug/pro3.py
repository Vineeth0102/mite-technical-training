"""You are given a
string.  If the string has some “#”, in
it you have to move all the hashes to the front of the string and return the
whole string back

Input - Move#From#Here#ToStart
output  - ###MoveFromHereToStart"""

String = input("Enter the String : ")
hash_count = String.count('#')
s_without_hashes = String.replace('#', '')
result = '#' * hash_count + s_without_hashes
print(result)
