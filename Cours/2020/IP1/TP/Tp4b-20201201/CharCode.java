public class CharCode {

    public static int charToCode(char c) {
        return 0+c;
    }
    public static void miniscule(char c){
	if(c >= 'A' && c<= 'Z'){
	    System.out.println("MAJUSCULE");
	}
	if(c >= 'a' && c<= 'z'){
	    System.out.println("minuscule");
	}
	if(!((c>='A'&& c<= 'Z') || (c>='a' && c<='z') ||(c>='0' && c<= '9'))){
	    System.out.println("special");
	}

    }

    public static String alphabet(){
	String res="";
	for(char i='A'; i<='Z'; i++){
	    res+=i;
	}
	return res;
    }
    public static char codeToChar(int code) {
	return (char)code;
    }

    public static String intToString(int i){
	String res = "" +i;
	return res;
    }
    
    /* Écrivez vos fonctions ici */

    public static void main(String[] args) {

	System.out.println(charToCode('a'));
	System.out.println(charToCode('m'));
	System.out.println(charToCode('M'));

	miniscule('A');
	miniscule('b');
	miniscule('é');

	System.out.println(codeToChar(106));
	System.out.println(intToString(4));

	System.out.println(alphabet());
    }
}
