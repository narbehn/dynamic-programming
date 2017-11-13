//array size is amount x (amount-1) since [0] is always 1. I think
public class CoinChange {
	
	public static int coinChange(int amount, int[] coins){
		
		int[] combinations = new int[amount + 1]; //+1 since array starts at 0
		
		combinations[0] = 1;//"base case" of index 0
		
		for(int i = 0; i < coins.length; i++){
			for(int j = 1; j < combinations.length; j++){
				if(j >= coins[i])
					combinations[j] += combinations[j - coins[i]];
					printAmount(combinations);
			}
		}
		return combinations[amount];
	}
	
	public static void printAmount(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		System.out.println(coinChange(200, new int[]{5, 10, 25}));
		}
}

