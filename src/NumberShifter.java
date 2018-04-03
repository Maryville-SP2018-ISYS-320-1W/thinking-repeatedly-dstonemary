
public class NumberShifter {

	
	public static void main(String[] args) {
		int count = 5;
		int iterationCount = 2;
		for(int iteration = 1; iteration <= 3 ; iteration++){
			for(int i=1; i<=count; i++){
				for(int j = 1; j <=i; j++){
					System.out.print(i);			
				}
				System.out.println();
			}	
			
			for(int i=(count-1); i>=1; i--){
				int k = i;
				for(int j =1; j <=i; j++){
					for(; k <= (count-1) ; k++){
						System.out.print(" ");
					}
					System.out.print(i);			
				}		
				System.out.println();
			}
		}
	}

}
