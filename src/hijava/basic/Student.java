package hijava.basic;

public class Student implements Cloneable{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "(" + id + ")";
	}
		
	@Override
	public Object clone() throws CloneNotSupportedException{
		Student clobj = (Student)super.clone();
		clobj.name = clobj.name + "복제본!";
		return clobj;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//s1.equals(s2) // if(s1 != null && s1.equals(s2)) {} 
	@Override
	public boolean equals(Object obj) {
		//동일한 메모리 주소면 true  (==는 메모리 주소)
		if (this == obj) 
			return true;
		
		//this는 절대 null이 될 수 없으므로 obj null이면 false
		if (obj == null)
			return false;
		
		// 동일한 class type이 아니면 false
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		if (this.id != other.id)
			return false;
		
		if (this.name == null) {
			if (other.name != null)
				return false;
		
		} else if (!name.equals(other.name))
			return false;
		
		return true;
		
//		Student other = (Student) obj;
//		return this.id == other.id && this.name != null && this.name.contentEquals(other.name);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student(921234, "홍길동");
		Student s2 = (Student)s.clone();
		System.out.println(s2);
//		System.out.println(s);
//		String ss = new String("홍길동");
//		Integer obj = new Integer(s.id);
//		Integer obj2 = new Integer(921234);
//		System.out.println(s.name.hashCode() + "::" + ss.hashCode());
//		System.out.println(obj.hashCode() + "=" + obj2.hashCode());
//		System.out.println(System.identityHashCode(obj2));
//		
//		Student s1 = new Student(123, "Hong");
//		Student s2 = new Student(456, "Kim");
//		Student s3 = new Student(123, "Hong");
//		System.out.println("s1 equals s2 = " + s2.equals(s1));
//		System.out.println("s1 equals s3 = " + s3.equals(s1));
	}

}
