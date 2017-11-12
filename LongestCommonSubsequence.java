import java.util.Scanner;
/*http://www.geeksforgeeks.org/longest-common-subsequence/ 
was used for reference and help implementing */

public class LongestCommonSubsequence {
	//str1 is of length m, str2 of length n
	int lcs(char[] C1, char[] C2, int m, int n){
		
		//in the 2D array write-out this is the 0 row/column
		if (m== 0 || n == 0) 
			return 0;
		//2 conditions:
		//1. LCS[m][n] or C1[m] matches C2[n]:
		//this is done bottom up, so, checks m-1 and n-1
		if(C1[m-1] == C2[n-1])
			return lcs(C1, C2, m -1, n-1) + 1;
		//2. characters don't match then LCS[m][n] = max(LCS[i-1][j], LCS[i][j-1])
			else
				return max(lcs(C1, C2, m - 1, n), lcs(C1, C2, m, n - 1));
		//still fuzzy on this part...
		
	}
	
	//max method
	int max(int a, int b){
		if (a > b)
			return a;
		else
			return b;
	}
	
	public static void main(String args[]){
		
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		char[] in1 = input.nextLine().toCharArray();
		char[] in2 = input.nextLine().toCharArray();
		
		
		
		int m = in1.length;
		int n = in2.length;
		
		System.out.println("Longest Common Sub for these is: " + lcs.lcs(in1, in2, m, n));//lcs.lcs???
	}
}
