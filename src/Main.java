import java.util.Scanner;

public class Main
{
	public static int calc(int n)
	{
		if (n < 3)
		{
			return 1;
		}
		int sum = 0;
		int sum1 = 1;
		int sum2 = 1;
		for (int i = 3; i <= n; i++)
		{
			if(sum1>10007)
				sum1%=10007;
			if(sum2>10007)
				sum2%=10007;
			sum = sum2 + sum1;
			sum1 = sum2;
			sum2 = sum;
		}
		return sum%=10007;
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(calc(n));
	}
}
