package hijava.practice;

public class Str {

	public static void main(String[] args) {
		
		//char와 byte는 싱클쿼테이션(')으로 선언.
		char c = '한';	//cf. char c = 65; or char c = '\uD55C';
		byte b = 'B';
		System.out.println(c);
		System.out.println( (int)c );	// cf. (char)c or (char)b	
		System.out.println(b);
	
		//String은 더블쿼테이션(")으로 선언.
		String str = "AB";
		System.out.println(str);
		System.out.println("AB".getBytes().length);	//getBytes() : String을 byte로 나눈다..
		System.out.println("AB한".getBytes().length);
		System.out.println("한".getBytes().length);	//문서의 저장 인코딩 값에 따라 한글의 크기가 바뀜
	}

}
