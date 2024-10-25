class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> list = new LinkedList<>();
        String prev = "";
        int n = folder.length;

        for(String f : folder) {
            if(!prev.isEmpty() && f.startsWith(prev) && f.charAt(prev.length())=='/')
            continue;
            list.add(f);
            prev = f;
        }

        return list;
    }
}
