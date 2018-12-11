import java.util.Scanner;
class Fact{
int fact(int n){
    if(n==1){
    return 1;
    }
    else{
        return n*fact(n-1);
    }
   }
}
public class Recursive_Factorial {
    public static void main(String [] ar){
    Scanner ob=new Scanner(System.in);
    Fact ob1=new Fact();
        System.out.println("Enter the number . . .");
        int x=ob.nextInt();
        int y=ob1.fact(x);
        System.out.println(y);
    }
}