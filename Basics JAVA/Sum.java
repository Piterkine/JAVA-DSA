import java.util.Scanner;

public class Sum {
          public static void main(String[] args) {
                    
                    Scanner sc = new Scanner(System.in);

                    //~ Taking name through terminal 
                    String name = sc.nextLine(); 
//^ Note: nextLine likhne se aap ek se jyada word ka input le sakte ho, agar apne sirf next(); use kiya to aap Shashank shukla input doge but shashank hi milgea kyoki jaise aapne Space diya vo uske baad ke content ko skip ker dega.
                    System.out.printf("Welcome to DRT @%s :-) ", name);


                    //~ Sum of two number taking input via terminal....
                    // int num1 = sc.nextInt(); // nextInt is use for integer input reading... & next for string and nextDouble for Double...
                    // int num2 = sc.nextInt();
                    // int sum = num1 + num2;
                    // System.out.printf("Sum of %d + %d = %d", num1, num2, sum); //& %s for String, %d for integer, %f double

          }

}