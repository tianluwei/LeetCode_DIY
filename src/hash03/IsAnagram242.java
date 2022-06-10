package hash03;

import java.util.HashMap;

public class IsAnagram242 {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        boolean anagram = new IsAnagram242().isAnagram(s, t);
        System.out.println(anagram);
    }
//    更秒的一种写法，用数组来一一对应字母计数，nice的。
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
//    public boolean isAnagram(String s, String t) {
////        自己的写法，可以的！！！
//        if(s.length()!=t.length()){
//            return false;
//        }
//        HashMap<Character,Integer> smap=new HashMap();
//
//        for(int i=0;i<s.length();i++){
//            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
//        }
//
//        for(int i=0;i<t.length();i++){
//            smap.put(t.charAt(i),smap.getOrDefault(t.charAt(i),0)-1);
//            if(smap.get(t.charAt(i))<0){
//                return false;
//            }
//        }
//
//        return true;
//    }
}
