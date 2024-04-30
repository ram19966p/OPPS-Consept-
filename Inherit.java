class IN
{
private  int a ;
protected  int b ;
public int c ;
IN()
{
a = 10 ;
b = 10 ;
c = 10 ; 
}
IN(int x , int y )
{
  a = x ;
 b = y ; 
c = 0;
}
IN(int x )
{
a = x ;
 b = 0 ; 
c = 0 ;
}
public int callPriv()
{
  return a;
}

}