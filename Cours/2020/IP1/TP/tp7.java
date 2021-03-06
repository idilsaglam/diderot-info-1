public class tp7{
    public static String letters2word(char[] tab){
	String res="";
	for(int i=0; i<tab.length; i++){
	    res+=tab[i];
	}
	return res;
    }

    public static String stutterword(char[] tab1, int[] tab2 ){
	String res="";
	for(int i=0; i<tab1.length; i++){
	    for (int j = 0; j<tab2[i]; j++) {
		res+=tab1[i];
	    }
	}
	return res;
    }

    public static char[] word2letters(String s){
	char[] res= new char[s.length()];
	for(int i=0; i<s.length(); i++){
	    res[i]=s.charAt(i);
	}
	return res;
    }

    public static char[] letters(String s){
	char[] res= new char[s.length()];
	boolean checked = false;
	for(int i=0; i<s.length(); i++){
	    res[i]=s.charAt(i);
	    checked = true;
	}
	return res;
    }

    public static boolean search(int[] tab, int x){
	for(int i=0; i<tab.length; i++){
	    if(tab[i] == x){
		return true;
	    }
	}
	return false;
    }
       
    

public static void main(String[] args){
    System.out.println(letters2word(new char[]{'p','l','a','c','a','r','d'}));

    System.out.println(stutterword(new char[]{'a','b','c','d'},new int[]{2,2,3,4} ));

    System.out.println(word2letters("placard"));

    System.out.println(search(new int[]{1,2,10,4},10));
    System.out.println(search(new int[]{1,4,5},6));
}
}

