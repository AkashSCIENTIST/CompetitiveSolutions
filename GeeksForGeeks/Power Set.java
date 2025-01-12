class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> a = new LinkedList<>();
        int n = s.length();
        helper(a, "", s, 0, n);
        Collections.sort(a);
        return a;
    }
    
    void helper(List<String> a, String f, String s, int idx, int n) {
        if(idx == n) {
            if(f.length() != 0) a.add(f);
            return;
        }
        
        helper(a, f, s, idx+1, n);
        helper(a, f+s.charAt(idx), s, idx+1, n);
    }
}
