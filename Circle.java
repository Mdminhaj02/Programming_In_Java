import java.util.Scanner;
public class Circle {
    public static void main(String [] a){
    Scanner ob=new Scanner(System.in);
    double r,area;
        System.out.println("Enter the circle radius: ");
    r=ob.nextDouble();
    final double pi=3.1416;
    area=pi*(r*r);
        System.out.println("The Circle Area is : "+area);   
    }
    
}