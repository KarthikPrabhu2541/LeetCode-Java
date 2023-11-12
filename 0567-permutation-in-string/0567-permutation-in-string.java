class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Set<Character> s=new HashSet<>();
        int n1=s1.length();
        int n2=s2.length();
        for(int i=0;i<n1;i++)
            s.add(s1.charAt(i));
        char perm[]=s1.toCharArray();
        Arrays.sort(perm);
        for(int i=0;i<n2;i++){
            if(s.contains(s2.charAt(i))){
                int x=i+n1;
                if(x<=n2){
                    char sub[]=(s2.substring(i,x)).toCharArray();
                    Arrays.sort(sub);
                    if(Arrays.equals(sub,perm))
                        return true;
                }
            }
        }
        return false;
    }
}