package cource28;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。
		
		chr numata = new chr();
		
     numata.attack = 250;
     numata.def = 100;
     numata.spd = 50;
     numata.love = 0;
      numata.Mp = 0;
      numata. hp = 100;
     
     //chrクラスのインタンス「kajima」を生成
      //パラメーターを設定しよう
      
      chr kajima = new chr();
     kajima.attack = 400;
      kajima.def = 100;
      kajima.spd = 50;
      kajima.love = 0;
      kajima.Mp = 0;
      kajima. hp = 500;
      
      kajima.naguru(kajima.attack,  numata.def );
    	  
	}

}
