package BinarySearch;
// https://practice.geeksforgeeks.org/problems/square-root/1#
public class SquareRoot {
    long floorSqrt(long x)
	 {
		// Your code here
		long l=1;
		long r=x;
		long ans=1;
		while(l<=r){
		    long mid=l+((r-l)/2);
		    if(mid*mid<=x){
		        ans=mid;
		        l=mid+1;
		    } 
		    else r=mid-1;
		}
		return r;
	 }
}

