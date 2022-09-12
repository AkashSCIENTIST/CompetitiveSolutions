class Solution:
    def rankTeams(self, votes: List[str]) -> str:
        d = {}
        count = len(votes[0])
        for i in votes[0]:
            d[i] = [0]*count
        for i in votes:
            for index,val in enumerate(i):
                d[val][index] += 1
        
        stats = (tuple([sum(d[i])]+d[i]+[-ord(i)+65]) for i in d)
        fun = lambda x : x
        stats = sorted(stats, key=fun, reverse=True)
        # print(stats)
        return "".join(chr(65+ -i[-1]) for i in stats)
