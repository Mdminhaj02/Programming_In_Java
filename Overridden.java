class SuperClass{
    int n;
 SuperClass(){
    n++;
}
void getDisplay(){
    System.out.println("This is super Class.");
    System.out.println("n= " +n);
}
}
class SubClass extends SuperClass{
 SubClass(){
n++;
}
@Override
void getDisplay(){
    System.out.println("This is Sub Class.");
    System.out.println("n=  "+n);
}
}
public class Overridden {
    public static void main(String [] args){
        SuperClass sp=new SuperClass();
        sp.getDisplay();
    SubClass sb=new SubClass();
    sb.getDisplay();
    }
}