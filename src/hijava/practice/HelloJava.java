package hijava.practice;
/**
 * 
 * @author Raun
 * 
 */

public class HelloJava {
	String message = "Hello World";	//message 는 프로퍼티
	
	public static void main(String[] args) {	//JVM에서 실행
		HelloJava.say("Hi~");

		System.out.println("HELLO JAVA !!");
	}

	
	public static void say(String msg) { //Method
		System.out.println(msg);
	}
}
