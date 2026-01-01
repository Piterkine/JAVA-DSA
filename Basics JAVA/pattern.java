import java.util.Scanner;

public class pattern {
          public static void main(String[] args) {
                    
                    Scanner sc = new Scanner(System.in);

          //! 1) FOR LOOP Solid quib

                    // for(int i = 1; i <= 4; i++){
                    //           for(int j = 1; j <= 5; j++){
                    //                     System.out.print("*");
                    //           }
                    //           System.out.println();
                    // }
          //! 2) FOR LOOP hollow quib
                    // int n = 4;
                    // int m = 5;
                    // for(int i = 1; i<=n; i++){
                    //           for(int j = 1; j <=m; j++){
                    //                     if(i==1 || j==1 || i==n || j==m){
                    //                               System.out.print('*');
                    //                     }else{
                    //                               System.out.print(" ");
                    //                     }
                    //           }
                    //           System.out.println();
                    // }

          //! 3) FOR LOOP Star quib
                    // int n = 4;
                    // for (int i = 1; i <= n; i++) {
                    //            for (int j = 1; j <= i; j++) {
                    //                      System.out.print("*");
                    //                      }
                    //           System.out.println();
                    // }


          //! 4) FOR LOOP Reverse Star quib  
          
                    // int n = 4;
                    // for(int i = n; i >= 1; i--){
                    //           for(int j=1; j<=i; j++){
                    //                     System.out.print("*");
                    //           }
                    //  System.out.println();
                    // }

          //! 5) FOR LOOP Reverse Star quib  

           int n = 4;
                    for(int i = 1; i <= 4; i++){
                              for(int j=1; j<=n-i; j++){
                                        System.out.print(" ");
                              }
                              for(int k = 1; k<=i; k++){
                                        System.out.print('*');
                              }
                     System.out.println();
                    }

          
           }
}
