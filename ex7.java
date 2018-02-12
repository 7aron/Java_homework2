import java.util.Scanner;

public class ex7 {
    

    private static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("Please enter a password");
        String password = scanner.nextLine();   

        checkPassword(password);
    }
    public static boolean checkPassword(String password){
        boolean upperCase = !password.equals(password.toLowerCase()); 
        boolean lowerCase = !password.equals(password.toUpperCase()); 
        boolean isAtLeast8 = password.length()>=8;                    
        boolean hasSpecial = !password.matches("[A-Za-z0-9]*");       
        boolean hasNumber = !password.matches(".*\\d+.*");            
        if(!isAtLeast8){
            System.out.println("Your Password is not big enough\n please enter a password with minimun of 8 characters");
            return true;
        }else if(!upperCase){
            System.out.println("Password must contain at least one uppercase letter");
            return true;
        }else if(!lowerCase){
            System.out.println("Password must contain at least one lower case letter");
            return true;
        }else if(!hasSpecial){
            System.out.println("Password must contain a special character");
            return true;
        }else if(hasNumber){
            System.out.println("Password must contain at least one number");
            return true;
        }else{
            System.out.println("Congrats! Your password " + password + " matches");
            return true;
        }

    }
}


//Taron
