public class Fonctions {


    public static int div10(int x){
	return 10/x;
    }

    public static int sumProduct(int x, int y, int z){
	return ((x*y)+(x*z)+(y*z));
    }

    public static void main(String[] args) {
	System.out.println(div10(5));
	System.out.println(sumProduct(2,3,div10(2)));
    }
}
