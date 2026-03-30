# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import heapq
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __lt__(self, other):  # Needed for heapq
        return self.val < other.val

class Solution:    
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        minhp=[]
        for node in lists:
            if node:
                heapq.heappush(minhp,node)
        dummy=ListNode(0)
        curr=dummy
        while minhp:
            node=heapq.heappop(minhp)
            curr.next=node
            curr=curr.next
            if node.next:
                heapq.heappush(minhp,node.next)
        return dummy.next

            

        