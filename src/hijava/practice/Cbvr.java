package hijava.practice;

public class Cbvr {
	int m = 2; //Cbvr의 주소.
	
	public static void main(String[] args) {	//JVM��
		/* Call by Value*/
		int i = 1;	//i는 1이라는 값을 반환
		System.out.println("i1 = " + i);
		change1(i); 
		System.out.println("i2 = " + i);	
		
		
		/* Call by reference */
		Cbvr cb1 = new Cbvr();
		System.out.println("cb1 = "+cb1.m);
		
		change2(cb1);
		System.out.println("cb2 = "+cb1.m);
	}

	public static void change1(int x) {
		System.out.println("x=" + x);
		
		x = 100;
	}
	
	public static void change2(Cbvr cb) {
		cb.m = 100;
	}
	
}
