public class UTS
public class CodesCracker
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 10 Numbers for the Array: ");
        for(int i=0; i<10; i++)
            arr[i] = s.nextInt();

        int countEven=0, countOdd=0;
        for(int i=0; i<10; i++)
        {
            if(arr[i]%2==0)
                countEven++;
            else
                countOdd++;
        }

        System.out.println("\nEven Number: " +countEven);
        System.out.println("Odd Number: " +countOdd);
    }
}
}
