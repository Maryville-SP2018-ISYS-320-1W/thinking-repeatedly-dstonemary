/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 1. Your predicted output 
/*
 	4
 	2
 	1
 	0
 */
/*
  	ISYS 320
  	Name(s): Derek Stone
  	Date:    April-03-2018
*/

public class P5_OddStuff {

	public static void main(String[] args) {
		int number = 4;
        for( int count = 1; count <= number; count++ ) {
            System.out.println( number );
            number = number / 2;
        }
	}

}

// 3. Were you correct? Explain any differences and what you learned.
/*
 	4
 	2
 	Prediction was wrong because didnt see number is updating on every iteration and before executing block of statement loop test the condition on updated number.
 */
