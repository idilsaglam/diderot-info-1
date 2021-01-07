public class Recherche {

   public static boolean cherche(char c, String s){
	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i)==c){
		return true;
	    }
	}
	return false;
    }


    public static int cherche2(char c, String s){
	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i) == c){
		return (i);
	    }
	}
	return -1;
    }
    
    
    public static void  main(String[] args) {
	System.out.println(cherche('a',"cheval"));
	System.out.println(cherche('a',"ecole"));
	System.out.println(cherche2('a',"ecole"));
	System.out.println(cherche2('a', "cheval"));
    }
}
