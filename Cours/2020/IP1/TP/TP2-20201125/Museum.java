public class Museum {
	/* EXERCICE 1 */
	public static int reduction(int birthyear, int year) {
	    if((year-birthyear) <= 20){
		return 5;
	    }
	    if(year-birthyear >60){
		return 3;
	    }
	    
	    return 0;
	}

	/* EXERCICE 2*/
	public static int price (int birthyear,int year,int price) {
	    int result = price - reduction(birthyear,price);
	    if(result < 0){
		return 0;
	     }

	    return result;
	}
	
	/*************************************************************/
	/* PROGRAMME PRINCIPAL*/
	
	public static void main (String[] args) {
	
	
		System.out.println("====Exo 1====");
		testInt("reduction(1970,1990)", reduction(1970,1990), 5);
		testInt("reduction(1929,1990)", reduction(1929,1990), 3);
		testInt("reduction(1960,1990)", reduction(1960,1990), 0);
		testInt("reduction(1940,2000)", reduction(1940,2000), 0);
		testInt("reduction(1979,2000)", reduction(1979,2000), 0);
		
		System.out.println("====Exo 2====");
		testInt("price(1970,1990,25)",price(1970,1990,25),20);
		testInt("price(1929,1990,2)", price(1929,1990,2),0);
		testInt("price(1960,1990,10)",price(1960,1990,10),10);
		
	}
	
	/*************************************************************/
	/* NE PAS MODIFIER */
	/*************************************************************/
	public static void testInt(String cmd, int exp, int val) {
		System.out.println(cmd + " == " + exp);
		if (exp != val) {
            System.out.println("Ce n'est pas la bonne réponse!");
		}
	}
    /*************************************************************/ 

	
}
