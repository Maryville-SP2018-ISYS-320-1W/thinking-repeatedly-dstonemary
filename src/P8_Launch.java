/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-03-2018
*/

// 1. Your predicted output 
/*
 	T-minus 5, 4, 3, 2, 1, 
 	Blastoff!
 	
 */


public class P8_Launch {

	public static void main(String[] args) {
		System.out.println("T-minus ");
        for( int i = 5; i >= 1; i-- ) {
            System.out.print( i + ", " );
        }
        System.out.println("Blastoff!");
	}

}



// 3. Were you correct? Explain any differences and what you learned.

/*
 Prediction was incorrect.
 T-minus 
 5, 4, 3, 2, 1, Blastoff!
 Reason: println means print text and new line
  		 print means print text on same line 
  		 Last execution print text "Blastoff!" on same line and nothing for execution to print in next line

 */