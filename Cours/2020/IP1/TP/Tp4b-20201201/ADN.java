public class ADN {

    public static boolean estADN(String s){
        for(int i=0; i<s.length(); i++){
	    if(!(
	       s.charAt(i)=='C' ||
	       s.charAt(i) == 'G' ||
	       s.charAt(i)=='T' ||
	       s.charAt(i)=='A'
		 )) {
		return false;
	     }
          }
	return true;
    }
    public static String masseMolaire(String s){
	String res = "";
	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i) ==  'A'){
		res += "135";
	    }
	    if(s.charAt(i) == 'T'){
		res += "126";
	    }
	    if(s.charAt(i) == 'G'){
		res+= "151";
	    }
	    if(s.charAt(i) == 'C'){
		res+= "111";
	    }
	    if (i < s.length()-1) {
		res += "+";
	    }
	} 
	res+= "g/mol";
	return res;
    }


    public static String brinComp(String s){
	String res ="";
	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i) == 'A'){
		res+= 'T';
	    }
	    if(s.charAt(i) == 'T'){
		res+= 'A';
	    }
	    if(s.charAt(i) == 'C'){
		res+= 'G';
	    }
	    if(s.charAt(i) == 'G'){
		res+= 'C';
	    }
	}
	return res;
    }

    public static boolean sous_sequence(String s1, String s2){
	return (brinComp(s1)==s2);
    }

    public static int somme(String s){
	int res=0;
	String operand="";
	if(s.charAt(0) == '+'){
	    return -1;
	}
	if(s.charAt(s.length()-1)== '+'){
	    return -1;
	}
	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i) == '+'){
		res += Integer.parseInt(operand);;
		operand = "";
		continue;
	    }
	    operand+=s.charAt(i);
	}
	return res;
    }




    public static void main(String[] args) {

	System.out.println(estADN("TTGAC"));
	System.out.println(estADN("GCAATTG"));
	System.out.println(estADN("CatG"));
	System.out.println(estADN("AMOG"));

	System.out.println(masseMolaire("AGATC"));

	System.out.println(brinComp("A"));
	System.out.println(brinComp("AAGT"));

	System.out.println(sous_sequence("ATC","GGTATCG"));
	System.out.println(sous_sequence("GC","AAT"));
	System.out.println(sous_sequence("ATC","TAG"));

	System.out.println(somme("1+3+4"));
	System.out.println(somme("+2+3"));
	System.out.println(somme("1+2+"));
	System.out.println(somme("11+12"));
    }
    
}
