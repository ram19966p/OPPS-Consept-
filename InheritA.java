class B extends IN
{
 private int d ;
B()
{
d = 0  ;
}
B(int i , int j , int k ,int l )
{
  super(i , j );
c = k ; 
d = l ;
 }
B(int x , int y )
{
super(x );
d = y ; 
}
void  add ()
{
    int r = callpriv()+b + c + d ;
System.out.println("Sum of all data member is "+r);
}
}
 
