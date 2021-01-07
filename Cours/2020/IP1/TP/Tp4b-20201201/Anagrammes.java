public class Anagrammes {

    public static String supression(char c, String s){
	String res =  "";
	boolean changed = false;
	for(int i=0; i<s.length(); i++){
	    if(!changed && s.charAt(i) == c){
		changed = true;
		continue;
	    }
	    res+=s.charAt(i);
	}
	return res;
    }

    public static boolean scrabble(String mot, String lettres_disponibles){
	for(int i=0; i<=lettres_disponibles.length(); i++){
	    for(int j=0; j<= mot.length(); j++){
		if(mot.charAt(j)==mot.charAt(i)){
		    mot.charAt
		}
	    }
	}
    }
    public static boolean anagram(String s1, String s2){
	if(s1.length() != s2.length()){
	    return false;
	}
	for(int i=0; i<s1.length(); i++){
	    if(s1.charAt(i) != s2.charAt(i)){
		return false;
	    }
	}
	return true;
    }


    public static void main(String[] args) {

	System.out.println(supression('a',"baldaquin"));
	System.out.println(supression('d',"fleur"));

	System.out.println(anagram("parisien","aspirine"));
	System.out.println(anagram("chaise","disque"));
    }
}
