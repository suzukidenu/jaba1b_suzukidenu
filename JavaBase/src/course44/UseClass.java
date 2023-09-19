package course44;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ
		Animal animal = new Animal();
		animal.dispWeight();
		//Humanクラス
		animal.setName("サイ");
		animal.setKari("相手を粉砕");
		animal.setWeight(7000000);
        animal.setJumyou(30);
		animal.death(animal.getName());
        
		animal.disp();
	
	}

}
