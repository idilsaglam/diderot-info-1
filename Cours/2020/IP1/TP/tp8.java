public class tp8{


    public static void printMatrix(int[][] tab) {
	String res = "";
	for (int i = 0; i<tab.length; i++) {
	    for (int j = 0; j<tab[i].length; j++) {
		res += tab[i][j] + "\t";
	    }
	    res += "\n";
	}
	System.out.println(res);
    }

    public static void printArray(int[] tab) {
	String res = "";
	for (int i = 0; i<tab.length; i++) {
	    res += tab[i] + ",";
	}
	System.out.println(res.replaceAll(",$",""));
    }
    
    public static  void printLines(int[][] tab){
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		System.out.print(tab[i][j] + " ");
	    }
	    System.out.println();
	}
    }

    public static int[][] squareOfZeros(int n){
	int[][] tab = new int[n][n];
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		tab[i][j] = 0;
	    }
	}
	return tab;
    }

    public static int[][] rectOfInt(int n, int p){
	int[][] tab= new int[n][p];
	int c =1;
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		tab[i][j]=c;
		c++;
	    }
	}
	return tab;
    }

    public static int[][] triangleOfInt(int n){
	int c = 1;
	int[][] tab = new int[n][];
	for (int i = 0; i<n; i++) {
	    tab[i] = new int[i+1];
	}
	for (int i = 0; i<n; i++) {
	    for (int j = 0; j<tab[i].length; j++) {
		tab[i][j] = c;
	    }
	    c++;
       }
	return tab;
    }


    public static int[][] target(int n){
	int[][] tab = new int[n][n];
	for (int c = 1; 2*c <= n+1; c++) {
	    for (int i = c-1; i<=(n-c); i++) {
		for (int j = c-1; j<=(n-c); j++) {
		    tab[i][j] = c;
		 }
	    }
	}
	return tab;
    }

    public static int[][]  copyIntArray(int[][] tab){
	int[][] res = new int[tab.length][];
	for(int i=0; i<tab.length; i++){
	    res[i]=new int[tab[i].length];
	    for(int j=0; j<tab[i].length;j++){
		res[i][j] = tab[i][j];
	    }
	    
	}
	return res;
    }

    public static int[][] cutIntArrayArray(int[][] tab, int n){
	int[][] res = new int[n][];
	for(int i=0; i<n; i++){
	    res[i] = new int[tab[i].length];
	    for(int j=0; j<tab[i].length; j++){
		res[i][j] = tab[i][j];
	    }
	}
	return res;
	
    }
    public static int sumArrayOfArrays(int[][] tab){
	int sum = 0;
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		sum += tab[i][j];
	    }
	}
	return sum;
    }

    

    public static boolean holdsOddInt(int[][] tab){
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		if(tab[i][j] % 2 !=0){
		    return true;
		}
	    }
	}
	return false;
    }

    public static int numberOfOneDigit(int[][] tab){
	int counter = 0;
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		if(tab[i][j] < 10 && tab[i][j]>-10){
		    counter ++;
		}
	    }
	}
	return counter;
    }

    public static int[][] positionArray(int[][] tab){
	int counter=0;
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		if(tab[i][j] % 9 == 0){
		    counter++; 
		}
	    }
	}
	int[][] res = new int[counter][2];
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		res[i]=new int[]{i,j};
	    }
	}
	return res;	    
    }

    public static int sumOfEvenInt(int[][] tab){
	int somme = 0;
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length;j++){
		if(tab[i][j] % 2 == 0){
		    somme+=tab[i][j];
		}
	    }
	}
	return somme;
    }

    public static int[] rowSum(int[][] tab){
	int[] res = new int[tab.length];
	int sum=0;
	for(int i=0; i<tab.length; i++){
	    sum=0;
	    for(int j=0; j<tab[i].length; j++){
		sum += tab[i][j];
	    }
	    res[i]=sum;
	}
	return res;
    }

    
    public static int[] rowWiseCount(int[][] tab, int n){
	int[] res = new int[tab.length];
	int counter = 0;
	for(int i=0; i<tab.length; i++){
	    counter = 0;
	    for(int j=0; j<tab[i].length; j++){
		if(tab[i][j] > n){
		    counter++;
		}
	    }
	    res[i]=counter;
	}
	return res;
    }

    public static boolean holdsCharlie(String[][] tab){
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		if(tab[i][j]== "Charlie"){
		    return true;
		}
	    }
	}
	return false;
    }

    public static boolean holdsE(String[][] tab){
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length;j++){
		for (int k=0; k<tab[i][j].length(); k++) {
		    if (tab[i][j].charAt(k) == 'e' || tab[i][j].charAt(k) == 'E') {
			return true;
		    }
		}
	    }
	}
	return false;
    }

    public int[][] fWordPositions(String[][] tab, String s){
	int counter = 0;
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length;j++){
		if(tab[i][j] == s){
		    counter ++;
		}
	    }
	}

	int[][] res = new int[counter][2];
	for(int i=0; i<tab.length; i++){
	    for(int j=0; j<tab[i].length; j++){
		if(tab[i][j] == s){
		    res[i]=new int[]{i,j};
		}
	    }
	}
	return res;
    }

    

    public static void main(String[] args){
	System.out.println("PrintLines");
	printLines(new int[][]{{1,2,3},{4},{5,6}});
	System.out.println("squareOfZeros");
	printMatrix(squareOfZeros(3));
	System.out.println("rectOfInt");
	printMatrix(rectOfInt(2,3));
	System.out.println("target(6)");
	printMatrix(target(6));
	System.out.println("CopyIntArrayArray");
	printMatrix(copyIntArray(new int[][]{{1,2},{3},{4,5,6,7}}));
	System.out.println("cutIntArray");
	printMatrix(cutIntArrayArray(new int[][]{{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,1}}, 3));
	System.out.println("triangleOfInt");
	printMatrix(triangleOfInt(3));
	System.out.println("sumArrayOfArrays");
	System.out.println(sumArrayOfArrays(new int[][]{{1,2,3},{4,5}}));
	System.out.println("holdsOddInt");
	System.out.println(holdsOddInt(new int[][]{{2,4,6},{8,10},{12}}));
	System.out.println(holdsOddInt(new int[][]{{4,6,3},{2},{9,11}}));
	System.out.println("numberOfOneDigitInt");

	System.out.println(numberOfOneDigit(new int[][]{{11,3,12},{1,100}}));
	System.out.println("positionArray");
	printMatrix(positionArray(new int[][]{{9,4,27},{81},{3,45}}));
	System.out.println("sumOfEvenInt");
	System.out.println(sumOfEvenInt(new int[][]{{1,2,3},{4,5}}));
	System.out.println("Charlie");
	System.out.println(holdsCharlie(new String[][]{{"Riri","Fifi","Loulou"},{"Charlie","Gerogia","Valery"},{"Franz"}}));
	System.out.println("holdsE");
	printMatrix(holdsE(new String[][]{{"il","abondonna","son","roman","sur","son","lit"},{"Il","alla","a","son","lavabo"}}));
	System.out.println("fWordPositions");
	printMatrix(fWordPositions("son", new String[][]{{"il","abandonna","son","roman","sur","son","lit"},{"il","alla","a","son","lavabo"}}));
    }
}
