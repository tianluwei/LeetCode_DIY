package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MinWindow76 {
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        String s1 = new MinWindow76().minWindow(s, t);
        System.out.println(s1);
    }

//    自己写的，过了，奈斯啊。这个双指针属实是被我玩转了，拿捏哈哈哈！！！
    public String minWindow(String s,String t){
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int i=0;
        int len=Integer.MAX_VALUE;
        String res="";
        for(int j=0;j<s.length();j++){
            map2.put(s.charAt(j),map2.getOrDefault(s.charAt(j),0)+1);
            while(isContain(map1,map2)){
                if(j-i+1<len){
                    len=j-i+1;
                    res=s.substring(i,j+1);
                }
                map2.put(s.charAt(i),map2.get(s.charAt(i))-1);
                if(map2.get(s.charAt(i))==0){
                    map2.remove(s.charAt(i));
                }
                i++;
            }
        }
        return res;
    }
    private boolean isContain(Map<Character,Integer> map1, Map<Character,Integer> map2){
        Set<Character> set = map1.keySet();
        for(Character i:set){
            if(map2.get(i)==null || map1.get(i)>map2.get(i)){
                return false;
            }
        }
        return true;
    }
}
