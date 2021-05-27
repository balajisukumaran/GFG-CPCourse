import java.util.Arrays;

public class AggressiveCow {
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left=1;
        int right=position[position.length-1]-position[0];
        int ans=1;
        while(left<=right){
            int mid=left+((right-left)/2);
            int prevBucket=position[0];
            int totalBucket=1;
            for(int i=1;i<position.length;i++){
                if(position[i]-prevBucket>=mid){
                    prevBucket=position[i];
                    totalBucket+=1;
                }
            }
            
            if(totalBucket>=m){
                //potential answer
                ans=mid;
                left=mid+1;
            }
            
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(AggressiveCow.maxDistance(arr,4)); 
    }
}