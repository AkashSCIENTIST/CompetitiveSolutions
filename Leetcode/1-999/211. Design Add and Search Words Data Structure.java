class WordDictionary {

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

    public WordDictionary() {
        root = new Node('\0');
    }
    
    public void addWord(String word) {
        Node curr = root;
        for(char x : word.toCharArray()){
            if(curr.children[x - 'a'] == null) curr.children[x - 'a'] = new Node(x);
            curr = curr.children[x - 'a'];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        return search(word, root, 0);
    }

    public boolean search(String word, Node curr, int index) {
        for(int i=index; i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == '.'){
                for(Node node : curr.children){
                    if(node != null && search(word, node, i+1) == true) return true;
                }
                return false;
            }
            if(curr.children[ch - 'a'] == null) return false;
            curr = curr.children[ch - 'a'];
        }
        return curr.isWord;
    }
}
