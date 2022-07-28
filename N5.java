class nested 
{
public static void main(String args[])
{
nested obj= new nested();
obj.display();
}
void display()
{ for(int i=1;i<=5;i++)
{
for(int j=i;j<=5;j++)
System.out.print(i+" ");
System.out.println();
}
}
}

