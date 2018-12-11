import java.util.Scanner;
public class quadratic_equation {
    public static void main(String [] args ){
        
    Scanner ob =new Scanner(System.in);
    double a,b,c,d,x,x1,x2;
    System.out.println("Enter the value of a: ");
    a=ob.nextInt();
    System.out.println("Enter the value of b: ");
    b=ob.nextInt();
    System.out.println("Enter the value of c: ");
    c=ob.nextInt();
    
    d=((b*b)-4*a*c);
        System.out.println("D =: "+d);
    if(d==0){
    x=(-b)/(2*a);
        System.out.printf("Root are real & equel and they are : %d" ,x);
    }else if(d>0){
    x1=(-b+Math.sqrt(d))/(2*a);
    
    x2=(-b-Math.sqrt(d))/(2*a);
    
        System.out.println("The root are real  unequel and they are. . .\nx1:"+ x1+ "\nx2 : "+ x2);
    }else{
        System.out.println("Root are imaginary.");
    }
   }
}