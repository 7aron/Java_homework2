import java.util.Random;
import java.util.Scanner;

class ex5 { 
public static void main (String[] args){
int a = 0;
int b = 0;
int[][] grades = new int[a][b];

Scanner sc = new Scanner(System.in);
System.out.println("NUmber of rows");
a = sc.nextInt();
System.out.println("NUmber of columns");
b = sc.nextInt();


if (a < b || a > b) {
System.out.println("It is not a square, check your numbers of rows and columns");
} else System.out.println("This is a square now.");

}
}

//Taron
