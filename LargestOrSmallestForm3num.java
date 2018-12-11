import java.util.Scanner;

public class LargestOrSmallestForm3num {
    public static void main(String[] args){
    Scanner ob =new Scanner(System.in);
    int a,b,c,max;
    System.out.println("Enter the first number :");
    a=ob.nextInt();
    System.out.println("Enter the 2nd number : ");
    b=ob.nextInt();
    System.out.println("Enter the 3rd number : ");
    c=ob.nextInt();
    
    if(a>b && b>c){
        max=a;
    }
    else if(b>c){
        max=b;
    }
    else{
        max=c;
    }
    System.out.println("Large number is : " +max);
    }
}