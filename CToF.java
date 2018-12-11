import java.util.Scanner;
public class CToF {
    public static void main(String [] args){
    Scanner ob=new Scanner(System.in);
    double F,C;
    System.out.println("Enter the Celsius Temperature : ");
    C=ob.nextDouble();
    F=(((9*C)+160)/5);
        System.out.println("Celsius to Fahrenheit Temperature: "+F);
    }
}
