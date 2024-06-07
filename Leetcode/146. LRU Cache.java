class Node {
    int key;
    int value;
    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer, Node> map; //maps key to node
    LinkedHashSet<Node> set; //stores nodes in queue form

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        set = new LinkedHashSet<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        set.remove(node);
        set.add(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.get(key).value = value;
            get(key);
            return;
        }

        if(set.size() == capacity){
            Node last = set.iterator().next();
            set.remove(last);
            map.remove(last.key);
        }

        Node newNode = new Node(key, value);
        set.add(newNode);
        map.put(key, newNode);
    }
}
