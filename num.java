import java.io.*
class Number
{
public Static void main(String args[])
{
Scanner input=new Scanner(System.in);
int num=input.nextInt();
if(num > 0)
{
System.out.println("Positive number");
}
else if(num < 0)
{
System.out.println("Negative number");
}
else if(num == 0)
{
System.out.println("Zero");
}
}
}
