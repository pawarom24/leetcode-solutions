class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) {
            return;
        }
        int a =0;
        int b = s.length -1;
        while(a<b){
            char temp = s[a];
            s[a]=s[b];
            s[s.length-1-a] = temp;
            a++;
            b--;
        }
    }
}
