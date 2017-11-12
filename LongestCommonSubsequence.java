
public class LongestCommonSubsequence {
	int lcs(char[] C1, char[] C2, int m, int n){
		//str1 is of length m, str2 of length n
		if (m== 0 || n == 0)
			return 0;
		
		if(C1[m-1] == C2[n-1])
			return lcs(C1, C2, m -1, n-1) + 1;
			else
				return max(lcs(C1, C2, m-1, n), lcs(C1, C2, m, n - 1));
		
		
	}
	
	//max method
	int max(int a, int b){
		if (a > b)
			return a;
		else
			return b;
	}
}
