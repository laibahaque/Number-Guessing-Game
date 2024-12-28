
package RandomNum;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool=true;
		int count = 0;
		int randomNum = (int) (Math.random()*100);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter guess No. :");
		int guessNum = scan.nextInt();
		while(bool) {
			if(guessNum == -1) {
				count++;
				System.out.println("Thankyou for playing you tried in "  + count + " attempts");
 				bool =  false;
			}
			else if(guessNum < randomNum) {
				System.out.println("Guess value is low.!");
				System.out.println("Enter guess No. Again :");
				guessNum = scan.nextInt();
				count++;
			}  
			else  if(guessNum > randomNum) {
				System.out.println("Guess value is high.!");
				System.out.println("Enter guess No. Again :");
				guessNum = scan.nextInt();
				count++;
			}
			else {
				count++;
				bool =false;
				System.out.println("You guessed the number in " + count + " attempts");
			}
			
		}
		
		 
		

	}

}
