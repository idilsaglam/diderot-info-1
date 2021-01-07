public class Seance3{

    //Exercice 5
    //Une fonction qui prend en paramètre un entier n et affiche, pour i allant de 1 à n, i étoiles sur la i-ième ligne.
    public static String triangle(int n){
	String result = "";
	for(int i=1; i<=n; i++){
	    for(int j=1; j<=i; j++){
		result+="*";
	    }
	    result += "\n";
	}
	return result;
    }

    //Exercice 6
    //Puisance: Ecrire une fonction "int power (int x, int n)" qui renvoie la valeur "x^n"
    public static int puissance(int x, int n){
	int res = 0;
	return(res);
    }
    //Exercice 7
    //Une fonction qui renvoie la factorielle de n.
    public static int factorielle(int n){
	int fac= 1;
	for(int i=1; i<=n; i++){
	    fac *= i;
	}
	return fac;
    }
    //Exercice 8
    public static String chanson(int n){
	String paroles= "";
       for(int i=1; i<=n; i++){
	   paroles += i+" kilomètre" + (i==1 ? "" : "s") + " à pied, ca use les souliers. \n";
       }
       return paroles;
    }

    //Exercice 8.2
    //Modifier code pour qu'il affiche les vers dans l'ordre inverse.

    public static String chansonInverse(int n){
	String paroles= "";
	for(int i=n; i>=2; --i){
	    paroles += i+" kilomètres à pied, ca use les souliers. \n";
	}
	paroles+= "1 kilomètre à pied, ca use les souliers";
	return paroles;
    }

    //Exercice 9.1
    //Une fonction "int isPrime (int n)" qui renvoie 1 si n est un nombre premier 0 sinon.
    public static int isPrime(int n){
	if(n==1){
	    return  0;
	}
	for(int i=2; i<=(n/2); i++){
	    if(n%i == 0){
		return  0;
	    }
	}
	return 1;
    }

    //Exercice 10.1
    //Fragment de code qui affiche les tables de multiplication pour les entiers de 1 à 10.

    public static int[][] multiplication(){
	int[][] result = new int[10][10];
	
	for(int i = 0; i<10; i++){
	    for(int j=0; j<10; j++){
		result[i][j]=(i+1)*(j+1);
	    }
	}
	return result;
    }

    public static String matrixToString(int[][] mat) {
	String result = "";
	for (int i = 0; i<mat.length; i++) {
	    for (int j=0; j<mat[i].length; j++) {
		result+=mat[i][j]+"\t";
	    }
	    result+="\n";
	}
	return result.replaceAll("\t\n", "\n");
    }
    //Exercice 11

    public static void carre(int n){
	String res="";
	for(int i=0; i<n;i++){
	    for(int j=0; j<n;j++){
		res += "*";
	    }
	    res += "\n";
	}
	System.out.println(res);
    }

    public static void main(String[] args){
	System.out.println("Exercice 5");
	System.out.println(triangle(5));

	System.out.println("Exercice 7");
	System.out.println(factorielle(4));
	System.out.println(factorielle(7));
	
	System.out.println("Exercice 8");
	System.out.println(chanson(7));
	carre(5);
	System.out.println("Exercice 8.2");
	System.out.println(chansonInverse(5));

	System.out.println(matrixToString(multiplication()));
	
	System.out.println("Exercice 9");
	System.out.println(isPrime(18));
	System.out.println(isPrime(3));
	System.out.println(isPrime(4));
	System.out.println(isPrime(1));
    }
}
