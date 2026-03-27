1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        char A[] = s.toCharArray();
5        char B[] = t.toCharArray();
6
7        Arrays.sort(A);
8        Arrays.sort(B);
9
10        String C = new String(A);
11        String D = new String(B);
12
13        return C.equals(D);
14       
15    }
16}