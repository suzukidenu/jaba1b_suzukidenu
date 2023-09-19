package course30;

public class Drink {

	String name;
	int price;

	//コンストラクタ追加
	//コンストラクタはメインクラスでnewをした時に自動的に発動する
	Drink(int q, String n) {
		price = q;
		name = n;

	}

	void display() {
		System.out.println("商品名は" + price);
		System.out.println("値段は" + name);
	}

	

}
