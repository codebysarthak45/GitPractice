import java.util.*;
public class prg3BNT
{
public static void main(String x[])
  {
    Scanner Sc=new Scanner(System.in);
	System.out.printf("Enter the Array elements:\n");
	int ch[]=new int[4];
	int n=ch.length;
	for(int i=0;i<ch.length;i++)
	{
	   ch[i]=Sc.nextInt();
	}
	System.out.printf("Enter the Value:");
	int val=Sc.nextInt();
	int count=0;
	int j=0;
	for(int i=0;i<n;i++)
	{
	   if(ch[i]!=val)
	   {
	     ch[j++]=ch[i];
		 count++;
		 n--;
	   }
	   
	}
	/*for(int k=j;k<ch.length;k++)
	{
	   ch[j++]=m;
	}*/
	System.out.println(count);
	for(int i=0;i<n;i++)
	{
		System.out.printf(ch[i]+" ");
	}
  }
}