"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return None
        curr=head
        while curr:
            nn=Node(curr.val,curr.next)
            curr.next=nn
            curr=nn.next
        curr=head
        while curr:
            if curr.random:
                curr.next.random=curr.random.next
            curr=curr.next.next
        curr=head
        chead=head.next
        cc=chead
        while curr:
            curr.next=curr.next.next
            if cc.next:
                cc.next=cc.next.next
            curr=curr.next
            cc=cc.next
        return chead




        