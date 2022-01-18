package longestincreasingseque;


public class Sequence {
	 static int incre_subseq(int my_arr[], int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int x, j, m = 0;
	      for (x = 0; x < arr_len; x++)
	         seq_arr[x] = 1;
	      for (x = 1; x < arr_len; x++)
	      for (j = 0; j < x; j++)
	      if (my_arr[x] > my_arr[j] && seq_arr[x] < seq_arr[j] + 1)
	      seq_arr[x] = seq_arr[j] + 1;
	      for (x = 0; x < arr_len; x++)
	      if (m < seq_arr[x])
	      m = seq_arr[x];
	      return m;
	   }
	   public static void main(String args[]){
	      int my_arr[] = { 20, 15, 58, 89, 45, 86, 98 , 48, 78, 82, 60, 12, 80, 90, 77, 55};
	      int arr_len = my_arr.length;
	      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(my_arr, arr_len));
	   }
	}
