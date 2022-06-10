package array01;

public class Sqrt69 {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int left=1;
        int right=x/2;
        while(left<=right){
            int mid=(left+right)>>1;
            if(x/mid==mid){
                return mid;
            }else if(x/mid<mid){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return right;
    }

}
