/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-03-2018
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		int count = 5;
		for(int i=1; i<=count; i++){
			for(int j =1; j <=(count-i); j++){
				System.out.print(" ");			
			}
			for(int k = 1; k<=i ; k++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
