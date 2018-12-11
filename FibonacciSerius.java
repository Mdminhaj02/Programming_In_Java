import java.util.Scanner;

public class FibonacciSerius {
    public static void main(String [] args){
        Scanner ob =new Scanner(System.in);
    long Fib_A,Fib_B,C,i,n;
    Fib_A=0;
    Fib_B=1;
    System.out.println("Enter the number of terms to be Display.");
    n=ob.nextInt();
    for(i=0;i<n;i++){                           //(0,1,2,3,4,5,6,7,8,9) 0+1=1,1+1=2,1+2=3,2+3=5,5+3=8
    C=Fib_A+Fib_B;                  //0+1=1
        System.out.print("  "+C);
    Fib_A=Fib_B;                    //Fib_A=1
    Fib_B=C;                        //Fib_B=1
    }
        System.out.print(" ");
   }
}