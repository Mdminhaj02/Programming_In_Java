class Student{
String Name;
double Roll;
}
class Result extends Student{
int mark;
void getData(){
Name="Minhaj";
Roll=380936;
mark=90;
}
void disPlay(){
    System.out.println("My name is : "+Name);
    System.out.println("My Board Roll"+Roll);
    System.out.printf("My Exam mark : %d",mark);
}
}
public class SingleInheritance {
    public static void main(String[] args){
    Result ob=new Result();
    
    ob.getData();
    ob.disPlay();
    
    }
}