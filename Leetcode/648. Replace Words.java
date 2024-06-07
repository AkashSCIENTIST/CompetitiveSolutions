class TrieNode {
  TrieNode[] children = new TrieNode[26];
  String word;
}

class Solution {
    private TrieNode root;
    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");

        for(String word : dictionary) insert(word);
        for(String word : words) sb.append(" ").append(search(word));

        return sb.substring(1).toString();
    }

    public void insert(String word){
        char[] arr = word.toCharArray();
        TrieNode node = root;

        for(char c : arr){
            int i = c-'a';
            if(node.children[i] == null) node.children[i] = new TrieNode();
            node = node.children[i];
        }

        node.word = word;
    }

    public String search(String word){
        char[] arr = word.toCharArray();
        TrieNode node = root;

        for(char c : arr){
            if(node.word != null) return node.word;
            int i = c-'a';
            if(node.children[i] == null) return word;
            node = node.children[i];
        }

        return word;
    }
}
