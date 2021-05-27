package SlidingWindow;

import java.util.Scanner;
// https://codeforces.com/problemset/problem/1341/B 
public class NoOfPeeks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int max_peak=0;
        while((t--)>0){
            String ip1=sc.nextLine();

            int n=sc.nextInt();
            int k=sc.nextInt();
            int []arr=new int[n];
            int left_index=0;
            int left=0;
            int right_index=k-1;
            int current_peak=0;
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            for(int i=left_index+1;i<right_index;i++)
                if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
                    current_peak+=1;

            max_peak=current_peak;

            while(right_index<=n-2){
                left_index++;
                if(arr[left_index]>arr[left_index-1]&&arr[left_index]>arr[left_index+1])
                    current_peak--;
                if(arr[right_index]>arr[right_index+1]&&arr[right_index]>arr[right_index-1])
                    current_peak++;
                right_index++;
                if(current_peak>max_peak)
                {
                    max_peak=current_peak;
                    left=left_index;
                }
            }
            System.out.println((max_peak+1)+" "+(left+1));
        }
    }
}
