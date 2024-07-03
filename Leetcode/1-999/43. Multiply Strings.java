class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n1 = num1.length(), n2 = num2.length();
        int res[] = new int[n1+n2];
        String arr1[] = num1.split("");
        String arr2[] = num2.split("");

        for(int i=0;i<arr1.length/2;i++){
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }

        for(int i=0;i<arr2.length/2;i++){
            String temp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = temp;
        }

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                res[i+j] += Integer.valueOf(arr1[i]) * Integer.valueOf(arr2[j]);
                res[i+j+1] += res[i+j] / 10;
                res[i+j] %= 10;
            }
        }

        for(int i=0;i<(n1+n2)/2;i++){
            int temp = res[i];
            res[i] = res[n1 + n2 - 1 - i];
            res[n1 + n2 - 1 - i] = temp;
        }
        
        int startIndex = 0;
        while (startIndex < res.length) {
            if (res[startIndex] != 0) {
                break;
            }
            startIndex++;
        }

        StringBuilder buildResponse = new StringBuilder();
        for (int i = startIndex; i < res.length; i++) {
            buildResponse.append(res[i]);
        }

        return buildResponse.toString();
    }
}
