public class Conditions {

    public static int absolute(int x){
	if(x>0){
	    return x;
	}
	return -x;
    }

    public static void solve(int x, int y, int z){
	if(x+y==z){
	    System.out.println("x+y=z");
	}
	if(x-y==z){
	    System.out.println("x-y=z");
	}
	if(-x-y==z){
	    System.out.println("-x-y=z");
	}
	if(-x+y==z){
	    System.out.println("-x+y=z");
	}
	if((x+y!=z) && (x-y!=z) && (-x-y!=z) &&  (-x+y!=z)){
	    System.out.println("Rien du tout!");
	}
	

    }

    public static void main(String[] args) {
	System.out.println(absolute(73));
	System.out.println(absolute(-37));

	solve(2,3,5);
	solve(5,3,2);
	solve(2,3,-5);
	solve(5,3,2);
	solve(4,-7,100);
    }
}
