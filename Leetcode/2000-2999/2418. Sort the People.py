class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        temp = [(i,j) for (i,j) in zip(names, heights)]
        temp = sorted(temp, key=lambda x : -x[1])
        return [i[0] for i in temp]
