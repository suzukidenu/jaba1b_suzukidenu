package course19;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
      String x = "すずき";
      String y = "いの";
      String z = "こうせい";
      String a = "こうき";
      String b = "そら";
      String c = "藤平";
      String d = "安田";
      String e = "坂本";
      
      //配列の鉄板構文
      //[]のことを要素と呼ぶ。要素は0から始まる。
      String[] nameList = new String[10];
      nameList[0] = "安田";
      nameList[1]= "根本";
      nameList[2]= "ながなわ";
    	  
    	  for(int i = 0; i < 3; i ++) {
    		  System.out.println("俺の友達の名前は" + nameList[i] + "だ");
    	  }
      
	}

}
