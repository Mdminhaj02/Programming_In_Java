import java.util.Scanner;
 class GCD_And_LCM {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int num1,num2,n1,n2,rem,GCD,LCM;
        System.out.println("Enter the value of num1:");
        num1=ob.nextInt();
        System.out.println("Enter the value of num2:");
        num2=ob.nextInt();
        n1=num1;
        n2=num2;
        while(n2!=0){
        rem=n1%n2;
        n1=n2;
        n2=rem;
        }
    GCD=n1;
    LCM=(num1*num2)/GCD;
    
        System.out.println("GCD is : "+GCD);
        System.out.println("LCM is : "+LCM);
    }
}