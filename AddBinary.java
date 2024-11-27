class Solution {
    public String addBinary(String a, String b) {
        StringBuilder string = new StringBuilder();
        int carried = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carried == 1) {
            if (i >= 0) {carried += a.charAt(i--) - '0';}
            if (j >= 0) {carried += b.charAt(j--) - '0';}
            string.append(carried % 2);
            carried /= 2;
        }
        
        return string.reverse().toString();
    }
}
