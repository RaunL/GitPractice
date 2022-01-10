package hijava.practice;

public class Oper {

	public static void main(String[] args) {

		int i = 0;
		 i += 1;	// i = i+1;
		 i += 10;
		 System.out.println(i);
		 
		 int k = !(i>0) ? 100 : 1000;
		 System.out.println("k= " +k);
		
//		int i = 0;
//		System.out.println(i);
//		
//		i++;	//단항연산자, i = i + 1
//		i--;	// i = i - 1
//		System.out.println(i);
	}

}
