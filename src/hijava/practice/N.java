package hijava.practice;

public class N {

	int x = 10;
	int y = 20;
	
	public void swap() {
		/*
		 * N class에 x,y property 존재(타입)
		 * 새로운 장소에 하나의 값(x)을 담는다.
		 * x에 y를 담는다.
		 * y에 새로운 장소의 값을 담는다.
		 */
		
		int a = x;
		x = y;
		y = a;
	}
	
	
	public static void main(String[] args) {
		
		N n = new N();
		System.out.println("x= " + n.x);
		System.out.println("x= " + n.y);
		n.swap();
		System.out.println("------------------swap---------------");
		System.out.println("x= " + n.x);
		System.out.println("x= " + n.y);
	}

}
