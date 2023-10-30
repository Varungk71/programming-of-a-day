import java.util.Scanner;

public class Program2 
{
    int value[]=new int[5];
    public static void main(String[] args) 
    {
        int array[]={1,2,3,4,5};

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number of position to be replace");

        int replace=sc.nextInt();

        for(int i=0;i<replace;i++)
        {
            int j,last;

            last=array[array.length-1];

            for(j=array.length-1;j>0;j--)
            {
                array[j]=array[j-1];
            }
            array[0]=last;
        }

        System.out.println("array after rotation");

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
        
    }
    
}
