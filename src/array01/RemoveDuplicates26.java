package array01;

/**
 * 删除重复元素，但至少保留一个。
 */
public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int res = new RemoveDuplicates26().removeDuplicates(nums);
        System.out.println(res);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

//    我是不是道德感（？道德的帽子）太高了，不要道德感太高，道德高也不能拿来约束别人。搞得别人不轻松。
//    没有什么大不了的；不管我怎么搞，这世界也不会垮掉。hhh
//    接受全部的自己，接受自己的阴暗面，这才是真实的你，这才是全部的你。

//    对自己好点，把自己放在第一位！

//    稍微变通一下，这样才可以！！！
    public int removeDuplicates(int[] nums) {
        int slowIndex=0;
        for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
            if(nums[slowIndex]!=nums[fastIndex]){
//                这个真的绝了啊，厉害了！
                nums[++slowIndex]=nums[fastIndex];
            }
        }
//        这里重要，因为slowIndex是索引，但要返回的是长度！
        return slowIndex+1;
    }

//    我想朱润泽了，想到他又能影响我。他多自信善良啊。我想念我室友了，朱润泽、仲陆祎、潘奥启，我想你们。那么好的时光，可是再也回不去了！
//    你要做个大人了，往前看了。
//    假的东西从来都不存在。真的东西不会消亡，假的东西从来就不存在。
//    暴力法
//    public int removeDuplicates(int[] nums) {
//        int len=nums.length;
//        for(int i=0;i<len-1;i++){
//            if(nums[i]==nums[i+1]){
//                for(int j=i;j<len-1;j++){
//                    nums[j]=nums[j+1];
//                }
//                // TODO: 2022/5/21 非常重要的一步，i--。因为还没有检测的i换到上一个元素了，所以i要到上一个重新检测，否则会出错。
//                i--;
//                len--;
//            }
//        }
//        return len;
//    }
}
