interface  MyIntf1
{
   public int   v = 10;  
   public void show();
}

interface MyIntf2
{
   public void disp();
}

interface MyIntf3
{
   public void display();
}

class A implements MyIntf1, MyIntf2, MyIntf3
{
   public void show()
    {
  	System.out.println("I am in Show Instance Method");
    }
   public void disp()
    {
  	System.out.println("I am in Disp Instance Method");
    }
   public void display()  
    {
  	System.out.println("I am in Display Instance Method");
    }
}
