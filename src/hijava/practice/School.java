package hijava.practice;

public class School {

	public static void main(String[] args) {
		Score korean = new Score();
		korean.setSubject("국어");
		korean.setScore(90);
		korean.prof = "코뿔소";
		 
		Score math = new Score("수학", 80);
		
		Score science = new Score("과학");
		
//		String k = korean.toString();
		System.out.println(korean);
		System.out.println(korean.prof);
		System.out.println(math);
		System.out.println(science);
		
		Student s1 = new Student("김일수");
		s1.setTelno("010-9999-8888");
		System.out.println(s1.getTelno());
		       
	}

}
