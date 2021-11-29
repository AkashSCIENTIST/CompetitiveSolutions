import collections

class Solution(object):
    def accountsMerge(self, accounts):
        email2ind = {}
        email2name = {}
        for account in accounts:
            name = account[0]
            for email in account[1:]:
                if email not in email2ind:
                    email2ind[email] = len(email2ind)
                    email2name[email] = name
        parent = list(range(len(email2ind)))
        
        def union(x, y):
            parent[find(y)] = find(x)

        def find(x):
            if parent[x] != x:
                parent[x] = find(parent[x])
            return parent[x]

        for account in accounts:
            for email in account[2:]:
                union(email2ind[account[1]], email2ind[email])
        ind2email = collections.defaultdict(list)
        for email, ind in email2ind.items():
            ind2email[find(ind)].append(email)
        ans = []
        for emails in ind2email.values():
            ans.append([email2name[emails[0]]] + sorted(emails))
        return ans
