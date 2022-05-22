package array;

public class BackspaceCompare844 {
    public static void main(String[] args) {
        String backspace = new BackspaceCompare844().backspace("bxj##tw");
        String backspace1 = new BackspaceCompare844().backspace("bxj###tw");
        System.out.println(backspace);
        System.out.println(backspace1);
    }


//    自己写的，nice！！时间有点慢
    public boolean backspaceCompare(String s, String t) {
        String s_res=backspace(s);
        String t_res=backspace(t);
        return s_res.equals(t_res);
    }
    private String backspace(String s){
        char[] chars=s.toCharArray();
        int i=chars.length-1;
        int count=0;
        String res="";
        while(i>=0){
            if(chars[i]=='#'){
                count++;
                i--;
            }else{
                if(count>0){
                    count--;
                    i--;
                }else {
                    res+=chars[i--];
                }
            }
        }
        return res;
    }
}
