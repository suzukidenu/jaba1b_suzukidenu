package course19;

import java.util.Scanner;

public class plactice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
String[] mygroup = new String[3];
      mygroup[0] = "いの";
      mygroup[1] = "こうき";
      mygroup[2] = "藤平";
      
      //慣れよう問題2
      
	int[] mygroupnum = new int[3];
	mygroupnum[0] = 3;
	mygroupnum[1] = 8;
	mygroupnum[2] = 24;
	//慣れよう問題3
	int[] myNum = new int[3];
	myNum[0] = 10;
	myNum[1] = 50;
	myNum[2] = myNum[0] + myNum[1];
	
    //慣れよう問題4
	System.out.println("数字打て");
	Scanner stdIn = new Scanner(System.in);
	int[] myNumScan = new int [3];
	 myNumScan[0] = 10;
	 myNumScan[1] = stdIn.nextInt();
	 myNumScan[2] = myNumScan[0] +  myNumScan[1];
	 System.out.println(myNumScan[2]);
}
}