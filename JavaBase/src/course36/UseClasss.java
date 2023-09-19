package course36;

public class UseClasss {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Kaden ka1 = new Kaden();
		Kaden ka2 = new Kaden();

		ka1.setName("冷蔵子");
		ka2.setName("洗濯機");
		ka1.setPrice(10000);

		ka1.display();
		ka2.display();
	}
}
