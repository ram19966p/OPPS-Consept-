 abstract class  A
 {
 public void  show ()
{
   System.out . println(" I am a show Fun " ); 
}
  public void disp()
{
 System .out . print (" I am a Diasp Fum" );
}
abstract protected void display();
}
class B extends A 
{
   public void  display()
{
  System.out.print(" I am a B display MEthod" );
}
public void disp()
{
   System.out.println(" I am a B Disp method" );

}
}
 