class Solution:
    def rankTeams(self, votes: List[str]) -> str:
        d = {}
        count = len(votes[0])
        if count == 0:
            return votes[0]
        for i in votes:
            for j,val in enumerate(i):
                temp = d.get(val, {})
                temp['total'] = temp.get('total', 0) + 1
                temp[j+1] = temp.get(j+1, 0) + 1
                d[val] = temp
        stats = [(i,d[i]) for i in d]
        fun = lambda x : [x[1]['total']] + [x[1].get(i, 0) for i in range(1,count+1)] + [-ord(x[0])]
        stats = sorted(stats, key=fun, reverse=True)
        # print(stats)
        return "".join((i[0] for i in stats))
