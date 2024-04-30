// private ka rule hota hai jis class me decliyar hota hai ussi body ka member acess kar //sakta hai 
// data member ko inislaize constracter karta hai
// constracter ka name class ka name same hota hai sakl  function ke tarh hota hia
// constructer nahi banate to defullt  me chalta aoy 0 ,0 variable me dal data  

class Mycl7
{
 int a , b;
Mycl7()
{
  a=10;
  b= 30;
}
public void showData()
{

  System.out.println("\n value of a is " +a);
System.out.println(" Value of b is " +b);
}
} 