public class FindMinimumKDivided {
        public static int findLowK(int []arr,int s){
            int low=1;
            int high=Math.MIN_VALUE;
            for(int i=0;i<arr.length;i++)
                high=Math.max(arr[i], high);
            high=+1;
            int ans=high;
            while(low<=high){
                int mid=low+(high-low)/2;
                int auxSum=0;
                for(int i=0;i<arr.length;i++)
                    auxSum+=(arr[i]/mid);

                if(auxSum<=sum)
                {
                    ans=mid;
                    mid=high-1;
                }
                else low=mid+1;
            }
            return ans;
        }
}
