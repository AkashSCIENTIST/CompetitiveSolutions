class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        HashSet<String> dup = new HashSet<>();

        for(String s : arr) {
            if(dup.contains(s)) continue;
            else if(set.contains(s)) {dup.add(s); set.remove(s);}
            else set.add(s);
        }

        if(k > set.size()) return "";
        List<String> list = new ArrayList<>(set);
        return list.get(k-1);
    }
}
