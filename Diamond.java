public class Diamond 
{
 
 
public static void main(String[] args)
{
 

 
char c = ("*").charAt(0);
int i=1;
int j;
while(i<=10)
{
j=1;
while(j++<=10-i)
 
{
System.out.print(" ");
 
}
j=1;
while(j++<=i*2-1)
 
{
System.out.print(c);
 
}
 
System.out.println();
i++;
} 
i=10-1;
while(i>0)
{
j=1;
while(j++<=10-i)
 
{
System.out.print(" ");
 
} 
j=1;
while(j++<=i*2-1)
 
{
System.out.print(c);
 
}
 
System.out.println();
i--;
}
 
}
}