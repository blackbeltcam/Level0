
public class Fizz_Buzz {
public static void main(String[] args) {
	for (int number= 1; number<=16; number++){
		if ((number%5)==0){
			if ((number%3)==0){
			System.out.print("FizzBuzz, ");
			}
			else{
				System.out.print("Buzz, ");
			}
			
		}
		else if ((number%3)==0){
			System.out.print("Fizz, ");
		}
		else {
			System.out.print(number+", ");
		}
	}
	
	
	
}
	

}
