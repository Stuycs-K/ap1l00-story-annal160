public class HelloWorld
{
    public static boolean isPrime(int x)
    {
        if (x < 2)
        {
            return false;
        }

        for (int i = 2; i < x; i++)
        {
            if (x % i != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n)
    {
        int nth = 0;
        int num = 2;

        while (true)
        {
            if (isPrime(num))
            {
                if (nth == n)
                {
                    return num;
                }
                nth++;
            }
            num++;
        }
    }

    public static void main(String[] args)
    {
        int[] inputs = {0, 1, 2, 3, 4, 5, 55, 67, 76, 96};
        int[] expected = {2, 5, 11, 17, 23, 29, 263, 337, 389, 509};

        for (int i = 0; i < inputs.length; i++)
        {
            if (nthPrime(inputs[i]) == expected[i])
            {
                System.out.println("pass"); 
            }
            else 
            {
                System.out.print("failed expected " + expected[i] + ", but value returned was " + nthPrime(inputs[i]));
            }
        }
    }
}
