/* Same Code; it passes randomly. It may or may not pass in 1st attempt */

class Solution {
    public void findSecretWord(String[] words, Master master) {
        Random rand = new Random();

        for(int i=0;i<10;i++){
            String gussedWord = words[rand.nextInt(words.length)];
            int count = master.guess(gussedWord);
            List<String> list = new ArrayList<>();

            for(String word : words){
                if(matchCount(gussedWord, word) == count) list.add(word);
            }

            words = list.toArray(new String[0]);
        }
    }

    public int matchCount(String a, String b){
        int match = 0;
        for(int i=0;i<6;i++){
            if(a.charAt(i) == b.charAt(i)) match++;
        }
        return match;
    }
}
