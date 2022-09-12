class Solution:
    def capitalizeTitle(self, title: str) -> str:
        titles = title.lower().strip().split()
        for i,word in enumerate(titles):
            if len(word) > 2:
                titles[i] = word[0].upper() + word[1:]
        return " ".join(titles)
        
