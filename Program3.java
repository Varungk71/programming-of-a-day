import java.util.Scanner;

public class Program3
{
    public static void main(String[] args)
    {
        int []array={2,11,15,7,5,4};

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
               if( array[i] + array[j] == 9)
                
                    System.out.println("indices are " +(i +","+j));
                
            }
        }
    }

}

