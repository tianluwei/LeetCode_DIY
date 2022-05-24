package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TotalFruit904 {
    public static void main(String[] args) {
//        int[] fruits={3,3,3,1,2,1,1,2,3,3,4};
        int[] fruits={1,0,3,4,3};
        int i = new TotalFruit904().totalFruit(fruits);
        System.out.println(i);
    }
//    真正的双指针
//    双指针，可以，这个挺帅的！
    public int totalFruit(int[] fruits){
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int len=0;
        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>=3){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i])==0){
                    map.remove(fruits[i]);
                }
                i++;
            }
            len=Math.max(len,j-i+1);
        }
        return len;
    }


//    两个for循环不行，会超出时间限制。
//    自己写的这个可以，但这个有点暴力了，重新开始算，感觉没有很好的利用双指针？？我疑惑是否还有进步空间？
//    public int totalFruit(int[] fruits) {
//        Set<Integer> set=new HashSet();
//        int trees=Integer.MIN_VALUE;
//        int i=0;
//        for(int j=0;j<fruits.length;j++){
//            if(set.size()<2){
//                set.add(fruits[j]);
//                trees=(j-i+1)>trees?(j-i+1):trees;
//            }else if(set.size()==2 && set.contains(fruits[j])){
//                set.add(fruits[j]);
//                trees=(j-i+1)>trees?(j-i+1):trees;
//            }else{
//                i++;
//    相当于分块，然后换一个新的块继续往前试。
//    这种方法可以，但还是没有双指针效率高。这种的时间复杂度大概是：
//                while(i<fruits.length-1 && fruits[i]==fruits[i-1]){
//                    i++;
//                }
////                每次有j的位置变动的，都要往前挪一位（因为下一次会把j++一次，所以j要-1），到重新开始走的地方走。
//                j=i-1;
//                set.clear();
//            }
//        }
//        return trees;
//    }
}
