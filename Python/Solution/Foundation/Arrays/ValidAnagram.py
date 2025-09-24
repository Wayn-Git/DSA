""""Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different."""

s = "racecar"
t = "carrace"

def valid_anagram(s,t):
        if sorted(s) == sorted(t):
            return True
        else:
            return False
 

print(valid_anagram(s,t))