class A
{
private void priv()
{
System.out.println("i am a priv Methed ");
}
protected void prot()
{
 System.out.println( " I am a proct Methed ");
}
public void pub()
{
 System.out.println("I am a pub methed");
  priv();
}
}
class B extends A
{
public void callprotpriv()
{  

//priv();
prot();
}

}
   
