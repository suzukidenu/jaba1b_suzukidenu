package course41;

public class Food {

	String name;
	int price;

	Food(String n, int s) {
		name = n;
		price = s;
	}
		
	void display() {
		System.out.println(name);
		System.out.println(price);
}
}
