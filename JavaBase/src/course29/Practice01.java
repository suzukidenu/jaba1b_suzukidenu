package course29;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Character tonari1 = new Character();
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("名前は？");
		tonari1.name = stdIn.next();
		

		//human1にパラメータを設定
		System.out.println("hpは？");
		tonari1.hp = stdIn.nextInt();
		
		System.out.println("攻撃力は？");
		tonari1.str =  stdIn.nextInt();
		
		System.out.println("命中率は？");
		tonari1.dex =  stdIn.nextInt();
		
		System.out.println("素早さは？");
		tonari1.agi =  stdIn.nextInt();
		
		System.out.println("防御力は？");
		tonari1.def =  stdIn.nextInt();
		

		//クラス「Human」から、インスタンス「human2」を生成
		Character me2 = new Character();

		//human2にパラメータを設定
		System.out.println("名前は？");
		me2.name = stdIn.next();
		
		System.out.println("hpは？");
         me2.hp = stdIn.nextInt();
		
		System.out.println("攻撃力は？");
		me2.str =  stdIn.nextInt();
		
		System.out.println("命中率は？");
		me2.dex =  stdIn.nextInt();
		
		System.out.println("素早さは？");
		me2.agi =  stdIn.nextInt();
		
		System.out.println("防御力は？");
		me2.def =  stdIn.nextInt();

		//メソッド呼び出し
		tonari1.viewStatus();
       me2.battle(me2, tonari1);
		
		}
	

}
