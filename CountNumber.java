import java.util.Scanner;

public class CountNumber
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size=sc.nextInt();

        int array[]=new int[size];

        System.out.println("enter the elements ");
        for(int i=0;i<size;i++)
        {            
            array[i]=sc.nextInt();    
        }
        System.out.println("enter number to be checked ");
        int num=sc.nextInt();
        for(int i=0;i<size;i++)
        {            
                if(array[i]==num)
                {
                    count=count+1;
                }
        }
            System.out.println("The enter number is " + num + " count is -" + count);
    }       
 }
    
