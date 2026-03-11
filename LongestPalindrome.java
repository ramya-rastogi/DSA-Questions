public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "babad";
        String res="";
        for(int i=0;i<s.length();i++){
            res = expand(s,i,i,res);
            res = expand(s,i,i+1,res);
        }
        System.out.println(res);
    }
    static String expand(String s,int l,int r,String res){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){ l--; r++; }
        String sub=s.substring(l+1,r);
        return sub.length()>res.length()?sub:res;
    }
}