import java.util.Scanner;

public class video4 {
          public static void main(String[] args) {
                    
                    Scanner sc = new Scanner(System.in);

                    // String name = sc.nextLine();
                    // int age = sc.nextInt();
                    // if(age >= 18){
                    //           System.out.printf("Welcome to DRT %s ", name);
                    // }else{
                              
                    //           System.out.printf("You are not eligible...");
                              
                              
                    // }

                    //~ Odd and even number program

                    // int num = sc.nextInt();
                    // if(num % 2 == 0){
                    //           System.out.printf("%d is Even number" , num);

                    // }else{
                    //           System.out.printf("%d is Odd number", num);
                    // }


                    //~ Switch Case 
                    int button = sc.nextInt();
                    switch(button){

                    case 1:System.out.printf("Jai Maa Durga");
                    break;
                    case 2:System.out.printf("Jai Ambe Maa");
                    break;
                    case 3:System.out.printf("Jai Sherawali Maa");
                    break;
                    case 4:System.out.printf("Jai Jagdamba Maa");
                    break;
                    default :System.out.printf("Jai Bhavani");

                    }
          }

}