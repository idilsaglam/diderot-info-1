public class Somme {

    public static void somme(int n){
	int somme = 0;
	for(int i=0; i<n; i++){
	    somme += i;
	}
	System.out.println(somme);
       
    }

    public static void main(String[] args) {

	somme(4);

    }
}
