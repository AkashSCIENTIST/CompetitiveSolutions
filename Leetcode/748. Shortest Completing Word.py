from collections import Counter
class Solution:
    def shortestCompletingWord(self, licensePlate: str, words: List[str]) -> str:
        reduced = ((i.lower() for i in licensePlate if i.isalpha()))
        master = Counter(reduced)
        word = []
        # print(master)
        for idx,i in enumerate(words):
            temp = Counter(i)
            bits = [master[i]<=temp.get(i,0) for i in master]
            # print(i, temp, bits)
            if bits.count(True) == len(bits):
                word.append({
                    "word" : i,
                    "len" : len(i),
                    "pos" : idx
                })
               
        fun = lambda x : (x["len"], x["pos"])
        if word == []:
            return ""
        word = sorted(word, key=fun)
        # print(word)
        return word[0]["word"]
                
        
        
