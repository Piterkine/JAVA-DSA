import java.util.Scanner;

public class loop {
          public static void main(String[] args) {
                    
                    Scanner sc = new Scanner(System.in);
          //! FOR LOOP


          //        for(int i = 1; i <= 10; i++){
          //           System.out.printf("Welcome to DRT %s \n", i );
          //        }
                 
          //        //~ Print a 2 table in java 

                 int num = sc.nextInt(); 
                 for(int i = 1; i <= 10; i++){
                    int mul = num*i;
                    System.out.printf(" %d * %d = %d \n",num, i , mul);
                 }

          //! While Loop
          // int i = 1;
          // while(i < 11){
          //           System.out.println("Jai Mata di");
          //           i++;
          // }


          //! Do While Loop
          // int i = 1;
          // do{
          //           System.out.println("Do While is Running...");
          //           i++;
          //           System.out.println(i);
          // }while(i < 10);
          // }

          //! NAtural Number sum
          // int n = sc.nextInt();
          // int sum = 0;
          // for(int i = 0; i <= n; i++){
          //           sum = sum + i;
          // }
          // System.out.println(sum);

           }
}
