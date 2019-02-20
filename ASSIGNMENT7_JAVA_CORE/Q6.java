import java.util.Scanner;

public class Q6 {
// Q6. There is an array with every element repeated twice except one. Find that element

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        System.out.println("Enter the array( With every element repeated twice except one element)");
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=s.nextInt();
        }
        int[] f=new int[n];

        for(int i=0;i<arr1.length;i++)
        {
            int count=1;

            for(int j=i+1;j<arr1.length;j++)
            {

                if(arr1[i]==arr1[j] && f[i]!=1)
                {
                   count++;
                   f[j]=1;
                }
            }

            if(count!=2 && f[i]!=1)
            {
                System.out.println("The element repeated once = "+arr1[i]);

            }

        }
    }

}
