import java.util.Scanner;
public class Q5 {

//     Q5. Find common elements between two arrays.

        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n=s.nextInt();
        System.out.println("Enter the first array");
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=s.nextInt();
        }
        System.out.println("Enter the size of second array");
        int n1=s.nextInt();
        int []arr2=new int[n1];

        System.out.println("Enter the second array");
        for(int i=0;i<n1;i++)
        {
            arr2[i]=s.nextInt();
        }
        int n3=(n<n1)?n:n1;
        int[] arr3=new int[n3];
        int k=0;
        for(int i=0;i<n;i++)
            {

            for (int j = 0; j <n1; j++)
                {
                if (arr1[i] == arr2[j])
                    {
                    arr3[k++]=arr1[i];
                }
            }
        }
        System.out.print("The commmon in 2 arrays = ");
        if(k!=0)
        {
            for (int i = 0; i < k; i++)
            {
                System.out.print("  " + arr3[i]);

            }
        }
        else
        {
            System.out.print(0);

        }

    }
}
