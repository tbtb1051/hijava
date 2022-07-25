package hijava.practice;

/**
 * 첫번째 자바 실습
 * @author Sooin
 * @update say함수 추가 (2022-07-20 by Sooin)
 */


public class HelloJava {
	String message = "Hello World";
	
	public static void main(String[] args) {

		// HelloJava에게 say라는 명령을 내림!
		HelloJava.say("Hi~");

		/** 코드 안내멘트
		ㄴㅇㄹㄴㄹㅇ
		ㅇ
		ㅇ
		ㅇㅇ
		*/
		
		
		//JVM이 스스로 화면에 출력
		System.out.println("Hello Java!!");
	}

	public static void say(String msg) {
		System.out.println(msg);
	}

}


