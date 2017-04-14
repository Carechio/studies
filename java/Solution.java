import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/****************************************************************************************
 *                   Challenge #02 from Week of Code 31 !                               *
 *                                                                                      *
 * Consider an unsorted array A = a_0, a_1, ..., a_{n-1}, of distinct integers from 0 to*
 * n-1. We can swap two adjacent elements in A as long as the absolute difference       *
 * between these elements is 1.                                                         *
 * Answer q queries, where each query consists of some array A. For each query, print   *
 * "Yes" if it's possible to sort the array in ascending order, otherwise, print "No"   *
 ****************************************************************************************/

//input: the number of queries q; an integer denoting n; n space-separated integers
//       describing the array A
//output: "Yes" if "A" can be sorted, "No" otherwise
public class AccurateSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String[] result = new String[q];
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            if(a.length == 1) result[a0] = "Yes";
            int aux;
            for(int i = 0; i < a.length - 1; i++) {
                if(a[i] > a[i + 1]){
                    if(Math.abs(a[i] - a[i + 1]) <= 1){
                        aux = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = aux;
                    }
                    else{
                        result[a0] = "No";
                        break;
                    }
                    if (i > 0) i -= 2;
                    else i--;
                }
                if(i == a.length - 2) result[a0] = "Yes";
            }
        }
        for(int j = 0; j < q; j++) System.out.println(result[j]);
    }
}
