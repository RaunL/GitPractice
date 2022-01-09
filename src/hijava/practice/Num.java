package hijava.practice;

public class Num {

	public static void main(String[] args) {
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println("0.1+0.2 = " + (0.1 + 0.2));
		/*
		 * 위의 값이 0.3이 나오지 않는 경우
		 * 소숫점은 전자공학적으로 소숫점*2 를했을 때 0인지 1인지 판단을하며...
		 * 0.1+0.2 자체를 하는 것이 아니라 1을 10으로 나눈 후 바이트 표현
		 * 2를 10으로 나눈후 바이트 표현한다음에 더하기 때문에
		 * 두개의 바이트 자리수가 달라서 나타나는 현상임.
		 * 자바/파이썬 모두 동일
		 */
		
	}

}
