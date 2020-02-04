public class CurrencyConverter {
	public static void main ( String [] args ){
			double CAD;
			double USD;
			double EUR;
			double USDratio  = 0.75; 
			double EURratio  = 0.68; 
			

			CAD = 2; 
			USD = CAD * USDratio; 
			EUR = CAD * EURratio;

			System.out.println(CAD + "canadian dollars = " + USD + "US dollars" + EUR + " euros");








	}


}