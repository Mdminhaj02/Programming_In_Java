interface Studentx{
static final String Name="Minhaj";
}
interface Examx{
static final int Roll=380936;
void disPlay();
}
class Resultx implements Studentx,Examx{
int mark;
public void disPlay(){
    System.out.println("Name is : "+Name);
    System.out.println("Roll is : "+Roll);
}
  void getMark(int m){
  mark=m;
  //return m;
  } 
  void showMark(){
      System.out.println("Total Mark is : "+mark);
  }
}
public class Interface {
    public static void main(String []a ) {
    Resultx ob=new Resultx();
    ob.getMark(98);
    ob.disPlay();
    ob.showMark();
    }
}
