// Abstract methed define in interface  not write a 
 interface MyInt
{
int a = 10;
   public void show();
public void disp();
 default public void display ()
{ 
 System .out.println("I am a display ");
}
}
  class A implements MyInt
{   
 public void show ()
{
   System.out.println("I  am a  abstraact methad ");
}
 public void  disp()
{
  System.out.println("I am a second abstract methaod ");
}
}