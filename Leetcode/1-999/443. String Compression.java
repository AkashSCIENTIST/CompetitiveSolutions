class Solution {
    public int compress(char[] chars) {
        StringBuilder list = new StringBuilder();
        int count = 1;
        char c = chars[0];
        
        for(int i=1;i<chars.length;i++){
            if(c == chars[i]) count++;
            else{
                list.append(c);
                if(count != 1) list.append(count);
                count = 1;
                c = chars[i];
            }
        }
        list.append(c);
        if(count != 1) list.append(count);

        int i = 0;
        for(char x : list.toString().toCharArray()){
            chars[i++] = x;
        }
        return i;
    }
}
