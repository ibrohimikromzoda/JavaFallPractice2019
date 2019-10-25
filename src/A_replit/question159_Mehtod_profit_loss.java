package A_replit;

public class question159_Mehtod_profit_loss {
	
	public static void main(String[] args) {
		System.out.println(c_profits(100,100));
		
	}
	
	public static  String c_profits (int buyPrice, int sellPrice) {
		
		String result ="";
		
		if (buyPrice < sellPrice) {
			return result+"profit";
			
		} 
		
		if (buyPrice > sellPrice) {
			return result+"loss";
		} 
		if (buyPrice == sellPrice) {
			return result+"no loss";
		} 
		
		
		
		return result;
	}
	
}
