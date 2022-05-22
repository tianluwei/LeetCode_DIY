package array;

public class RemoveElement27 {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 2, 3};
        int[] nums={0,1,2,2,3,0,4,2};
        int len = new RemoveElement27().removeElement(nums, 2);
        System.out.println(len);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

//    在这我想用双指针法做。
//    快慢指针，牛逼的！！！
    public int removeElement(int[] nums, int val) {
        int slowIndex=0;
        for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=val){
//                nums[slowIndex++]=nums[fastIndex];
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }


//    public int removeElement(int[] nums, int val) {
//        int len=nums.length;
//        for(int i=0;i<len;i++){
//            if(nums[i]==val){
//                for(int j=i;j<len-1;j++){
//                    nums[j]=nums[j+1];
//                }
//                i--;
//                len--;
//            }
//        }
//        return len;
//    }


}
