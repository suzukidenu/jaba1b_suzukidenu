package cource28;

public class chr {

	
		// TODO 自動生成されたメソッド・スタブ
    static int attack;
    static int def;
    static int spd;
    static int love;
    static int Mp;
     static int hp;

     static void naguru(int naguruattack, int nagurudef) {
    	 System.out.println((naguruattack - nagurudef) + "のダメージを与えた");
     }
     
static void mamoru() {
	System.out.println("守りを固めて防御が" + (def * 2) + "になった");
}
}