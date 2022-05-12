import java.util.*;
import java.io.*;
class Tribonacci
{
    public static void main(String args[])
    {
    	Tribonacci obj=new Tribonacci();
    	obj.display();
    }
    
    void display()
    {
        Scanner br = new Scanner(System.in);
        System.out.print("Enter number till u want Tribonacci series: ");
        int n=br.nextInt();

        int a = 0,b = 0,c = 1;
        int d = a+b+c;

        System.out.println("\nTribonacci Series: ");
        System.out.print(a+"\t"+b+"\t"+c);

        for(int i=4;i<=n;i++)
        {
            System.out.print("\t"+d);
            a=b;
            b=c;
            c=d;
            d=a+b+c;
        }

        System.out.println();
    }
}
/* Output
Enter number till u want Tribonacci series: 10

Tribonacci Series: 
0	0	1	1	2	4	7	13	24	44
*/