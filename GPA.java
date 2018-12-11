import java.util.Scanner;
public class GPA {
    public static void main(String [] ar){
    Scanner ob=new Scanner(System.in);
        System.out.println("Enter the your number.");
        double mark;
        mark=ob.nextDouble();
        if((mark>=80)&&(mark<=100) ){
            System.out.println("Congratulations!You are find A+.");
        }
        else if(mark>=70 &&(mark<=79) ){
        System.out.println("Congratulations!You are find A.");
        }
        else if(mark>=60 && mark<=69){
        System.out.println("Congratulations!You are find -A.");
        }
        else if(mark>=50 && mark<=69){
        System.out.println("Congratulations!You are find B.");
        }
        else if(mark>=45 && mark<=49){
        System.out.println("Congratulations!You are find C.");
        }
        else if(mark>=33 && mark<=44){
        System.out.println("Congratulations!You are find d.");
        }
        else if(mark>=00 && mark<=32){
        System.out.println("Yor are fail!!!");
        }
        else{
        System.out.println("Your are entered a wrong input.Try again with other case.");
        }
    }
}