class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map=Counter(nums)
        buckets = [[] for _ in range(len(nums) + 1)]
        for num, freq in freq_map.items():
            buckets[freq].append(num)
        result = []
        for i in range(len(buckets) - 1, 0, -1):  # from high freq to low
            for num in buckets[i]:
                result.append(num)
                if len(result) == k:
                    return result

        
        