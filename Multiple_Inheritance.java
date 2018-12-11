class Student1{
String Name;
int Roll;
void getData(){
Name="Minhaj";
Roll=380936;
}
void getDisplay(){
System.out.println("Student Name: "+Name);
System.out.println("Student Roll : "+Roll);
}
}
class Exam extends Student1{

int mark;
void getData(){
mark=98;
}
void getDisplay(){
System.out.println("Student Mark : "+mark);
}
}
class Result1 extends Exam{
Student1 ob=new Student1();
Exam ob1=new Exam();
void getData(){
ob.getData();
ob1.getData();
}
void Display(){
ob.getDisplay();
ob1.getDisplay();
}
}

public class Multiple_Inheritance {
    public static void main (String[] args){
    Result1 ob3=new Result1();
    ob3.getData();
    ob3.Display();
    }
}