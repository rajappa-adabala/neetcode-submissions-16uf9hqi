class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        map = {')': '(', ']': '[', '}': '{'}
        
        for char in s:
            if char in map:  # If it's a closing bracket
                top = stack.pop() if stack else '#'
                if top != map[char]:
                    return False
            else:  # It's an opening bracket
                stack.append(char)
                
        return not stack
