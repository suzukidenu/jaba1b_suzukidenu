package course30;

public class UseClass {

	public static void main(String[] args) {
		Drink dr = new Drink(100, "初期データ");
		dr.display();

		dr.name = "午後の紅茶";
		dr.price = 150;

		dr.display();

		

	}
}
