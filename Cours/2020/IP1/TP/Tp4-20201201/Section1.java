class Section1 {

    /* ********************************************************** */
    /* EXERCICE 1 : ENTIERS NON SIGNES                            */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction isBinaryEncoding ci-dessous
    public static boolean isBinaryEncoding(String w){
	for(int i=0; i<w.length(); i++){
	    if(w.charAt(i) != '1' &&  w.charAt(i)!='0'){
		return false;
	    }
        }
	if(w.length() != 8){
	    return false;
	}
	return true;
    }
    

    // QUESTION 2  
    // Déclarez la fonction powerTwo ci-dessous
    public static int powerTwo(int n){
	int power = 1;
	for(int i=0; i<n; i++){
	    power *= 2;
	}
	return power;
    }

    // QUESTION 3
    // Déclarez la fonction decode ci-dessous    
     public static int decode(String s){
	 int result = 0;
	 if(isBinaryEncoding(s) == true){
	     for(int i=0; i<s.length(); i++){
		 result += (s.charAt(i)-'0')*powerTwo(s.length()-i-1);
	     }
	     return result;
	 }
	 return -1;
	 
      }

    // QUESTION 4
    // Déclarez la *procédure* encodeAndPrint ci-dessous    
    public static String encodeAndPrint(int n){
      	String res="";
	do{
	    res+=n%2;
	    n/=2;
	}while(n!=0);
	return(res);	
    }

    // QUESTION 5
    // Déclarez la fonction encode ci-dessous    
    public static String encode(int n){
	String res = "";
	if (encodeAndPrint(n).length() < 8){
	    int zeroNeeded= 8-(encodeAndPrint(n).length());
	    for(int i=0; i<=zeroNeeded-1; i++){
		res+= "0";
	    }
	    res+= encodeAndPrint(n);
	    return res;
	}
	return encodeAndPrint(n);
    }

    // QUESTION 6
   
    /* ********************************************************** */
    /* EXERCICE 2 : INVERSE                              */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction inverse ci-dessous
     public static String inverse(String w){
	String res = "";
	for(int i=0; i<w.length();i++){
	    if(w.charAt(i) == '0'){
		res+= '1'; 
	    }
	    if(w.charAt(i) == '1'){
		res+='0';
	    }
	    
	    if(w.charAt(i) != '1' && w.charAt(i)!='0'){
		res+= w.charAt(i);
	    }
	}
	return res;

    }
    

    // QUESTION 2  
    // Déclarez les fonctions encodeInv et decodeInv ci-dessous
    public static String encodeInv(int n){
	return inverse(encode(n));
    }

    public static int decodeInv(String s){
	return(decode(inverse(s)));
    }
    /* ********************************************************** */
    /* EXERCICE 3 : ENTIERS SIGNES                                */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction isNegative ci-dessous
    public static boolean isNegative(String w){
        return(w.charAt(0) == '1');
    }

    public static int decodeNeg(String s){
      int result = 0;
       if(isBinaryEncoding(s) == true){
	   for(int i=1; i<s.length(); i++){
	       result += (s.charAt(i)-'0')*powerTwo(s.length()-i-1);
           }
	   if(s.charAt(0)=='1'){
	       return -1*result;}
	   return result;
       }
       return -1;
    }

    public static String encodeNeg(int n){
	String res = "";
	
	if(n<0){
	    res = "1";
	    n*=-1;
	}else{
	    res = "0";}
	
	if (encodeAndPrint(n).length() < 8){
	    int zeroNeeded= 7-(encodeAndPrint(n).length());
            for(int i=0; i<zeroNeeded; i++){
		res+= "0";
            }
            res+= encodeAndPrint(n);
            return res;
        }
        return encodeAndPrint(n);
    
    }


    // QUESTION 2  
    // Déclarez la fonction decodeNeg ci-dessous
    

    // QUESTION 3
    // Déclarez la fonction encodeNeg ci-dessous    


    // QUESTION 4
    // Déclarez la procédure testFinal ci-dessous    



    /* ********************************************************** */
    /* FONCTION PRINCIPALE                                        */
    /* ********************************************************** */
    

    public static void main (String []args) {

	System.out.println(isBinaryEncoding("0030000"));
	System.out.println(isBinaryEncoding("01100101"));
	System.out.println(isBinaryEncoding("0010"));

	System.out.println(powerTwo(2));
	System.out.println(powerTwo(3));

	System.out.println(decode("11111110"));
	System.out.println(decode("10001000"));
	System.out.println(decode("400"));

	System.out.println(encodeAndPrint(254));
	System.out.println(encodeAndPrint(136));

	System.out.println(encode(253));
	System.out.println(encode(15));

	System.out.println(inverse("010"));
	System.out.println(inverse("bob1081"));

	System.out.println(encodeInv(253));
	System.out.println(encodeInv(15));
	System.out.println(decodeInv("11101101"));

	System.out.println(isNegative("10100100"));
	System.out.println(isNegative("01001000"));

	System.out.println("decodeNeg");
	System.out.println(decodeNeg("00000110"));
	System.out.println(decodeNeg("11000001"));

	System.out.println("encodeNeg");
	System.out.println(encodeNeg(-17));
	System.out.println(encodeNeg(9));
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
