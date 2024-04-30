import javax.swing.JOptionPane;
  class Mycl1
{
   
   public static void showMess()
  {
      JOptionPane.showMessageDialog(null," I am a in show meass fun");
  }
  public void showData()
{
   JOptionPane.showMessageDialog(null,"I am a show Data mem fun" );
}
  public static void main(String arg[])
{
  //showMess();
  Mycl1.showMess();
//My.showData(); = wrong hai non static object ke refrence se chalte hai 
Mycl1  nob = new Mycl1();
  nob.showData();
 
}
}