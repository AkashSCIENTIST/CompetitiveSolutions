from collections import defaultdict 

class DetectSquares:

    def __init__(self):
        self.pointCount = defaultdict(int)
        self.points = list()
        

    def add(self, point: List[int]) -> None:
        self.points.append(point)
        self.pointCount[(point[0], point[1])] += 1
        

    def count(self, point: List[int]) -> int:
        res = 0
        px, py = point

        for (x,y) in self.points:
            if (abs(px-x) != abs(py-y)) or (x == px) or (y == py):
                continue;
            else:
                res += self.pointCount[(x, py)] * self.pointCount[(px, y)]

        return res
        


# Your DetectSquares object will be instantiated and called as such:
# obj = DetectSquares()
# obj.add(point)
# param_2 = obj.count(point)
