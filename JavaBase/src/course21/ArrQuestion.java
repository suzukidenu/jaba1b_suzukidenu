package course21;

import java.util.Scanner;

public class ArrQuestion {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
         //台風件数
	     int[] typhoon = new int[12];
	      typhoon[0] = 1;
	      typhoon[1] = 1;
	      typhoon[2] = 0;
	      typhoon[3] = 0;
	      typhoon[4] = 0;
	      typhoon[5] = 1;
	      typhoon[6] = 4;
	      typhoon[7] = 5;
	      typhoon[8] = 6;
	      typhoon[9] = 4;
	      typhoon[10] = 6;
	      typhoon[11] = 1;

	      
	      //地震件数
			 int[] quake = new int[12];
			 quake[0] = 153;
			 quake[1] = 127;
			 quake[2] = 130;
			 quake[3] = 109;
			 quake[4] = 118;
			 quake[5] = 164;
			 quake[6] = 130;
			 quake[7] = 103;
			 quake[8] = 103;
			 quake[9] = 104;
			 quake[10] = 123;
			 quake[11] = 141;
			 
			 ///降水量
			   int[] rain = new int[12];
			      rain[0] = 20;
			      rain[1] = 58;
			      rain[2] = 107;
			      rain[3] = 87;
			      rain[4] = 114;
			      rain[5] = 187;
			      rain[6] = 200;
			      rain[7] = 59;
			      rain[8] = 169;
			      rain[9] = 441;
			      rain[10] = 158;
			      rain[11] = 94;

		
	      
				Scanner stdIn = new Scanner(System.in);
		System.out.println("見たい情報を選んでください");
		System.out.println("1:台風件数  2:地震件数 3:降水量");
		int menu = stdIn.nextInt();
       		
			
		
		System.out.println("年別か月別かを選んでください");
		System.out.println("1:年別 2:月別");
		int menu2 = stdIn.nextInt();
		
		
		
		///台風の年間を選んだ場合
		if( menu == 1) {
		if(menu2 == 1) {
			int sum = 0;
			for(int i = 0; i < typhoon.length; i++) {
				sum = sum + typhoon[i];
			}
			System.out.println("1年間の台風の総件数は" + sum + "件です");
			
			
			//台風の月別を選んだ場合
		}else if(menu == 1) {
			  if(menu2 == 2) {
			System.out.println("見たい月を選んでください");
		   int menu3 = stdIn.nextInt();
		  System.out.println(menu3 + "月の台風件数は" + typhoon[menu3 - 1] + "です" );
		  
	       ///地震の年間を選んだ場合
		}else if( menu == 2) {
        	if(menu2 == 1) {
        		
        		int sum1  = 0;
        		for(int i = 0; i < quake.length; i++) {
        			sum1 = sum1 + quake[i];
        			
        		}
        		System.out.println("1年間の地震の総件数は" + sum1 + "件です");
        		
        		
        		///地震の月別を選んだ場合
        }else if(menu == 2)
        	   if(menu == 2)
        	System.out.println("見たい月を選んでください");
 		   int menu3 = stdIn.nextInt();
 		  System.out.println(menu3 + "月の地震件数は" + quake[menu3 - 1] + "です" );
        	
 		  
 		  ///年間の降水量を選んだ場合
        }else if( menu == 3) {
        	   if(menu2 == 1) {
        		   
        		   int sum2 = 0;
        		   for(int i = 0; i < rain.length; i++) {
        			   sum2 = sum2 + rain[i];
        			   
        		   }
        			System.out.println("1年間の降水量は" + sum2 + "件です");
        			
        			
        		///月別の降水量を選んだ場合
        	   }else if(menu == 3) {
        		   if(menu2 == 2) {
        			   
        			   System.out.println("見たい月を選んでください");
        			   int menu3 = stdIn.nextInt();
        			   System.out.println(menu3 + "月の降水量は" + rain[menu3 - 1] + "です" );
        	        	
        			   
        		   }
        	   }
        }
        	
			 
		 

	}
}
	}
}