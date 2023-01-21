class Solution {
    List<String> res;
    public List<String> restoreIpAddresses(String s) {
        res = new ArrayList<String>();
        solve(s, "", 0, 0);
        return res;
    }
    public void solve(String s, String output, int idx, int dot){
        
        if(dot == 3){
            if(isValid(s.substring(idx))){
                String temp = output + s.substring(idx);
                res.add(temp);
            }
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(isValid(s.substring(idx, i+1))){
                output += s.charAt(i) + ".";
                solve(s, output, i+1, dot+1);
                output = output.substring(0, output.length() - 1);
            }
        }
    }
    public boolean isValid(String val){
        if(val.length()>3 || val.length()==0) return false;
        if(val.length()>1 && val.charAt(0)=='0') return false;
        if(val.length()>0 && Integer.parseInt(val)>255) return false;
        return true;
    }
}
