import java.util.Scanner;
public class ex6 {
    
 public static void main(String[] args) {
	 
	 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Type your text");
		String test = sc.next();
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		int letter = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i < x.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			
			else{
				other ++;
			}
		}
		System.out.println("The string is :" + x);
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
		System.out.println("Sentences: " + other);
			}
}
	

  					// There must be no space in your text! 
									//There must be no space in your text! 
													//There must be no space in your text! 
																	//There must be no space in your text! 
																										//Taron
    		

    
    		
