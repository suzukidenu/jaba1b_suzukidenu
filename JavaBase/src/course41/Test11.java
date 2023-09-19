package course41;

public class Test11 {

	public static void main(String[] args) {
		
		
		int[] numExArr = new int[5];
		numExArr[0] = 10;
		numExArr[1] = 50;
		numExArr[2] = 30;
		numExArr[3] = 20;
		numExArr[4] = 40;
		
		
		int save = 0 ;
	    save = numExArr[0];
		numExArr[0] = numExArr[4];
		numExArr[4] = save;
		numExArr[4] = numExArr[3];
		numExArr[3] = save;
		numExArr[3] = numExArr[2];
		
		for(int i = 0; i < numExArr.length; i++) {
			System.out.println(numExArr[i]);
		}
	}

}
