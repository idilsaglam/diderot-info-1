public class Hamming {

    public static int hamming(String s1, String s2){
	int result = -1;
	if(s1.length() == s2.length()){
	    result = 0;
	for(int i=0; i<s1.length(); i++){
	    if(s1.charAt(i)==s2.charAt(i)){
		continue;
	    }
	    result++;
	}
	}
	return result; 
	
    }

    public static void main(String[] args) {

	System.out.println(hamming("poire","pomme"));
	System.out.println(hamming("stylo","bouteille"));

    }
}
