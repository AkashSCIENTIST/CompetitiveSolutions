class TrieNode {
    TrieNode children[];

    TrieNode() {
        children = new TrieNode[10];
    }
}

class Trie {
    TrieNode root = new TrieNode();

    void insert(String s) {
        TrieNode node = root;
        char[] chars = s.toCharArray();

        for(char c : chars) {
            int i = c - '0';
            if(node.children[i] == null) node.children[i] = new TrieNode();
            node = node.children[i];
        }
    }

    int search(String s) {
        TrieNode node = root;
        char[] chars = s.toCharArray();
        int count = 0;

        for(char c : chars) {
            int i = c - '0';
            if(node.children[i] == null) break;
            node = node.children[i];
            count++;
        }

        return count;
    }
}

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        int count = 0;

        for(int i : arr1) trie.insert(""+i);
        for(int i : arr2) count = Math.max(count, trie.search(""+i));

        return count;
    }
}
