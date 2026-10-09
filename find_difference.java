class Solution {
    public char findTheDifference(String s, String t) {
        int asciiSum =0;
        for(int i =0;i<t.length();i++){
            asciiSum += t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            asciiSum -= s.charAt(i);
        }
        return (char)asciiSum;
    }
}
