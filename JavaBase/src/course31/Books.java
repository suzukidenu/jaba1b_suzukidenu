package course31;

public class Books {

	String name;
	int page;
	String author;

	Books(String n, int s, String a) {
		name = n;
		page = s;
		author = a;
	}

	void display() {
		System.out.println(name);
		System.out.println(page);
		System.out.println(author);
	}
}
