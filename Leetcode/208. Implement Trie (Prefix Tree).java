class Trie {

    class Node {
        private char value;
        private boolean isWord;
        private Node[] children;
        public Node(char val) {
            this.value = val;
            this.isWord = false;
            this.children = new Node[26];
        }
    }

    Node root;

    public Trie() {
        root = new Node('\0');
    }
    
    public void insert(String word) {
        Node curr = root;
        for(char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null) curr.children[x - 'a'] = new Node(x);
            curr = curr.children[x - 'a'];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null) return false;
            curr = curr.children[x - 'a'];
        }
        return curr.isWord;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(char x : prefix.toCharArray()){
            if(curr.children[x - 'a'] == null) return false;
            curr = curr.children[x - 'a'];
        }
        return true;
    }
}
