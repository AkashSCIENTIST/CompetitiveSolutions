class Solution:
    def capitalizeTitle(self, title: str) -> str:
        titles = (i for i in title.lower().split())
        return " ".join((i if len(i)<=2 else i.capitalize() for i in titles))
