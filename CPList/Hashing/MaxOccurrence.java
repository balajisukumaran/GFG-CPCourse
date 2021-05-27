// https://www.hackerearth.com/practice/data-structures/hash-tables/basics-of-hash-tables/practice-problems/algorithm/maximum-occurrence-9/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        */
        Scanner s = new Scanner(System.in);
        int []hash=new int[256];
        String input=s.nextLine();
        int max=Integer.MIN_VALUE;
        char c='-';
        for(int i=0;i<input.length();i++)
            hash[input.charAt(i)]++;
        for(int i=0;i<hash.length;i++)
            if(hash[i]>max)
            {
                max=hash[i];
                c=(char)i;
            }
        // Write your code here
        System.out.println(String.valueOf(c)+" "+max);
    }
}
