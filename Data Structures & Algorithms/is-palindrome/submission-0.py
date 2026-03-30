class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned=[char.lower() for char in s if char.isalnum()]
        return cleaned[::-1]==cleaned
        