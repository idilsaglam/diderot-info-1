public class Seance{

    //Exercice 11.1
    // Une fonction qui prend en argument une chaine de caractères et affihce une suite de tirets (-) de même longueur. 
    public static String tirets(String word) {
	String result = "";
	for(int i = 0; i<= word.length(); i++){
	    result += "-";

	}
	return result;
    }

    //Exercice 11.2
    //Écrire une fonction qui prend en argument une chaine de caractères et l'affiche à l'envers.
    public static String envers(String word){
	String result = "";
	for(int i = word.length()-1; i>=0; i--){
	    result += word.charAt(i);
	}
	return result;
    }

    //Exercice 12
    //Ecrire une fonction qui prend en argument une chaine de caractères et affiche cette meme chaine sans les espaces.
    public static String espaces(String word){
	return(word.replaceAll(" " , ""));	
    }

    //Exercice 15
    //Une condition permattant de tester si le tiers de l'entier x appartient à l'inervalle [2;8].
    public static boolean calcul(int number){
	double tiers = number/3.0;
	if(tiers >= 2 && tiers <= 8){
	    return true;
	}
	return false;
    }
    
    //Exercice 16
    //Une condition permettant de tester si les entiers a,b et h peuvent correspondre aux longueurs des cotes d'un triangle rectangle, où h serait 
    public static boolean triangle(int a, int b, int h){
	if((a*a) + (b*b) == (h*h)){
	    return true;

	}
	return false;
	
    }
    //Exercice 17 
    // Une boucle permettant de calculer la somme des cubes des entiers de 1 à 100.
    public static int somme (){
	 int cube = 0;
	for(int i=1;i <= 100; i++){
	    cube += (i*i*i);
	}
	return cube;
    }

    //Exercice 18: Une fonction qui prend un entier de type int en paramètre et affiche l'ordinal anglais abrégé correspondant.

    public static String ordinaux(int n){
	String result = "" + n;
	if(n == 11 || n==12 || n==13 ){
	    return result + "th";
	}
	switch(n%10){
	case 1:
	    result += "st";
	    break;
	case 2:
	    result += "nd";
	    break;
	case 3:
	    result += "rd";
	    break;
	default:
	    result += "th";
	    break;
	}
	return result;
    }
   
    //Exercice 20
    //Une conditionnelle afin de stocker dans une chaine de caractéres s la mention correspondant à la note (entière) contenue dans la variable n de type int.
    
    public static String notes(int num){
	String result = "";
	if(num >=10 && num<12){
	    result = "passable";
	}else if(num>=12 && num<14 ){
	    result = "assez bien";
	}else if(num >= 14 && num<16){
	    result = "bien";
	}else if (num >= 16){
	    result = "tres bien";
	}
	return result;
    }

    //Exercice 21.1
    //Une fonction qui prend en paramètre un entier supposé positif n et qui affiche une ligne d'astéerisques "*" de longueur n puis va à la ligne. 

    public static String etoiles(int n){
	String result = "";
	for(int i=0; i<n; i++){
	    result += "*";
	}
	return result;
    }

    //Exercice 21.2
    // Modifiez fonction pour qu'elle affiche une ligne pointillée altenant astérisques et espaces.

    public static String setoile(int n){
	String result = "";
	for(int i=0; i<n; i++){
	    result += "*" + " ";
	}
	return result;
    }

    //Exercice 22

    public static String parfait(int n ){
	return ("Hdllo zordl");
    }

    //Exercice 23

    public static String occurence(String st, char c){
	String result = "";
	int index = 0;
	for (int i=0; i<st.length(); i++){
	    if(st.charAt(i) == c){
		index = st.indexOf(i);
	    }
	}
	return result;
    }
    public static void main(String[] args){
	System.out.println("Exercice 11.1");
	System.out.println(tirets("amphitheatre"));

	System.out.println("Exercice 11.2");
	System.out.println(envers("amphitheatre"));

	System.out.println("Exercice 12");
	System.out.println(espaces("Bonjour monde ."));

	System.out.println("Exercice 15");
	System.out.println(calcul(0));
	System.out.println(calcul(6));
	System.out.println(calcul(9));
	System.out.println(calcul(25));

	System.out.println("Exercice 16");
	System.out.println(triangle(3,4,5));
	System.out.println(triangle(1,2,3));

	System.out.println("Exercice 17");
	System.out.println(somme());

	System.out.println("Ex 18 bir daha bak");
	System.out.println(ordinaux(4));
	System.out.println(ordinaux(21));
	System.out.println(ordinaux(53));
	System.out.println("Exercice 20");
	System.out.println((notes(16)));
	System.out.println(notes(3));
	System.out.println(notes(12));

	System.out.println("Exercice 21");
	System.out.println(etoiles(7));

	System.out.println("Exercice 21.2 OLMADI");
	System.out.println(setoile(7));
	System.out.println(setoile(4));

	System.out.println("Exercice 22");
	System.out.println(parfait(1));
	System.out.println(parfait(5));
	System.out.println(parfait(60));
	
 }
}
