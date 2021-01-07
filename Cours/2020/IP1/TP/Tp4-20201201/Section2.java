class Section2 {

    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // QUESTION 1 
    // Déclarez la fonction letterToInt ci-dessous
    public static int letterToInt(String s){
	for(int i=0; i<alphabet.length(); i++){
	    if(alphabet.charAt(i) == s.charAt(0)){
		return i;
	    }
	}
	return -1;
    }

    // QUESTION 2  
    // Déclarez la fonction cesarLetter ci-dessous

    public static String cesarLetter(String s1, String s2) {
	if (s2 == " ") {
	    return " ";
	}
	char result = (char)(s1.charAt(0) - 'A' + s2.charAt(0));
	if (result > 'Z') {
	    result = (char)(result - 'Z' + 'A');
	}
	return result + "";
    }
    
    // QUESTION 3
    public static String cesar(String s1, String s2){
	String res= "";
	for(int i=0; i<s2.length(); i++){
	    res+= cesarLetter(s1,s2.charAt(i)+"");
	}
	return res;
    }
    
	
    // QUESTION 4
    // Déclarez la fonction deCesarLetter ci-dessous    
    public static String deCesarLetter(String str1, String str2) {
	if (str2.charAt(0) == ' ') {
	    return " ";
	}
	char result = (char)(str2.charAt(0) - (str1.charAt(0) - 'A'));
	if (result < 'A') {
	    result = (char)('Z'-('A'-result));
	}
	return result + "";
    }

    // QUESTION 5
    // Déclarez la fonction deCesar ci-dessous    
    public static String deCesar(String s1, String s2) {
	String result = "";
	for(int i = 0; i<s2.length(); i++) {
	    result += deCesarLetter(s1, ""+s2.charAt(i));
	}
	return result;
    }

    // QUESTION 6
    // Déchiffrez le message "DOHD MDFWD HVW" dans la fonction principale



    /* ********************************************************** */
    /* FONCTION PRINCIPALE                                        */
    /* ********************************************************** */
    

    public static void main (String []args) {
	System.out.println(letterToInt("A"));
	System.out.println(letterToInt("Z"));
	System.out.println(letterToInt("*"));
	System.out.println(cesar("D","BONJOUR"));
	System.out.println(cesarLetter("D","B"));
	System.out.println(cesarLetter("H"," "));
	System.out.println(cesarLetter("C","Z"));
	System.out.println(deCesarLetter("D", "E"));
	System.out.println(deCesarLetter("D", "F"));
	System.out.println(deCesarLetter("Z", "B"));
	System.out.println(deCesar("D", "ERQMRXU"));
	System.out.println(deCesar("D", "DOHD MDFWD HVW"));
    }
    


    /* ********************************************************** */
    /* FONCTIONS AUXILIAIRES                                      */
    /* ********************************************************** */
     

    // caractère à une position donnée
    public static String charAtPos(String s, int i) {
	return String.valueOf(s.charAt(i));
    }

    // test d'égalité entre chaînes de caractères
    public static boolean stringEquals(String s, String t) {
	return s.equals(t);
    }
    

}
