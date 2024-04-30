class A 
{
   public void f1(int x)
{
  System .out. println( "i AM A CLASS  A ");
}
}
class B extends A 
{
   public void f1(int x , int y)
{
  System .out. println ("i am a class b");
}
} 
 public class ExecriceA
{
 public void main(String arg [])
{
  B ob1 = new B ();
ob1.f1(4);
ob1.f1(2, 5);
}
} 