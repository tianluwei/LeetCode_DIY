package array01;

/**
 * 为什么时间复杂度是O(n)。
 * 不要以为for里放一个while就以为是O(n^2)啊， 主要是看每一个元素被操作的次数，每个元素在滑动窗后进来操作一次，
 * 出去操作一次，每个元素都是被操作两次，所以时间复杂度是 2 × n 也就是O(n)。
 */

//最恐怖的是比你聪明的人还比你努力。这个差距就越来越大。
public class MinSubArrayLen209 {
    public static void main(String[] args) {

    }
    public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口  就很棒！很帅！
//        其实我感觉滑动窗口和双指针差不多！
//        还是快指针（走在前面的那个指针）作为for循环每次走过的index，找到一个符合条件的快指针就停下来，让慢指针往前走看看有没有其他符合条件的。

//        两个for循环暴力法是从左往右找，滑动窗口是从右往左找。

        int i=0;
        int len=Integer.MAX_VALUE;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                len=Math.min(len,j-i+1);
                sum-=nums[i++];
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
//    public int minSubArrayLen(int target, int[] nums) {
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<nums.length;i++){
//            int sum=0;
//            for(int j=i;j<nums.length;j++){
//                sum+=nums[j];
//                if(sum>=target){
//                    min=Math.min(min,j-i+1);
//                    break;
//                }
//            }
//        }
//        return min==Integer.MAX_VALUE?0:min;
//    }
}
