package epamnewyear.Newyear;
import java.lang.*;
import java.util.Scanner;
interface cook{
	void method();
}
class sortarray implements cook
{
    public void method()
    {
        int i,temp,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of array elements");
	    int count = scan.nextInt();
	    System.out.println("enter array elements");
	    int n[] = new int[count];
	    for(i=0;i<count;i++) 
	    {
	        n[i] = scan.nextInt();
	    }
	    for (i = 0; i < count; i++) 
        {
            for (j = i + 1; j < count; j++) { 
                if (n[i] > n[j]) 
                {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
    
    for(i=0;i<count;i++)
    {
    	System.out.println(n[i]);
    }
    int max=n[0];
    for(i=0;i<count;i++)
    {
    	max=n[i];
    		if(n[i]>max)
    		{
    			max=n[i];
    		}
    }
    System.out.println("Maximum Element"+" "+max);
    }
    void year()
    {
    	System.out.println("NEW YEAR");
    }
    
}
class overriding extends sorttarray
{
	void year()
	{
		System.out.println("HAPPY NEW YEAR");
	}
}
public class Newyeartask {
    public static void main (String[] args) {
        sortarray s1=new sortarray();
        s1.method();
        overriding r=new overriding();
        r.year();
    }
}