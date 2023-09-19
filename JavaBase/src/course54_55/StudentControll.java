package course54_55;

public class StudentControll {
	public static void main(String[] args) {

		Student tonari = new Student(13, "杉本侑星");

		Student me = new Student(15, "鈴木羚也");
		
		Student[] mymen = new Student[2];
		mymen[0] = tonari;
		mymen[1] = me;
		
		
		mymen[1].setName("長縄");
		System.out.println(mymen[1].getName());
	
		
	}
}