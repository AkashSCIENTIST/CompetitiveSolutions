class Solution {
    public String makeFancyString(String s) {
        int n = s.length();
        if(n <= 2) return s;
        char[] arr = s.toCharArray();
        int left = 0, right = 1;

        while(left<=right && right<n){
            if(arr[left] != arr[right]) {
                if(right-left == 1) {
                    left++; right++;
                }
                else{
                    while(right-left > 2) {
                        arr[left++] = '\0';
                    }
                    left = right-1;
                }
            }
            else if(arr[left] == arr[right]) {
                right++;
            }
        }
        while(right-left > 2) {
            arr[left++] = '\0';
        }

        StringBuilder sb = new StringBuilder();
        for(char c : arr) if(c != '\0') sb.append(c);
        return sb.toString();
    }
}
