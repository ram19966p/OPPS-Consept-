import javax.swing.JOptionPane;
class Mycl3
{
  public static void sum()
{
  int a, b, d;
 a=Integer.parseInt(JOptionPane.showInputDialog("Enter the first num:"));
b=Integer.parseInt(JOptionPane.showInputDialog("Enter the second num:"));
d=a+b;
JOptionPane.showMessageDialog(null,"sum of two num is :" +d);
}

public void add()
{ 
int j,k,l;
j=Integer.parseInt(JOptionPane.showInputDialog("Enter the first num :"));
k=Integer.parseInt(JOptionPane.showInputDialog("Enter the second num:"));
l=j+k;
JOptionPane.showMessageDialog(null,"ADdtion of two num is "+l);
}
public static void main(String arg[])
{
Mycl3.sum();
Mycl3  ob;
 ob=new Mycl3();
ob.add();
} 
}


 