package hijava.practice;

public class Casting {

	public static void main(String[] args) {
		byte b = 1;
		int i = b; // 자동으로 형변환 됨
		long l = 1234567;
		
		//b = i; //에러발생
	
		System.out.println(i + l);
	}

}
