/**
 * 问题描述
 * 	Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 * 	当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 * 输入格式
 * 	输入包含一个整数n。
 * 输出格式
 * 	输出一行，包含一个整数，表示Fn除以10007的余数。
 * @author kesar
 *
 */
public class Fibonacci
{
	public static int getFibonacci1(int n)
	{
		if(n<1)
		{
			return 0;
		}
		if(n==1||n==2)
		{
			return 1;
		}
		return getFibonacci1(n-1)+getFibonacci1(n-2);
	}
	
	public static int getFibonacci(int n)
	{
		if(n<1)
		{
			return 0;
		}
		if(n==1||n==2)
		{
			return 1;
		}
		int sum=0;
		int sum1=1;int sum2=1;
		for(int i=3;i<=n;i++)
		{
			sum=sum2+sum1;
			sum1=sum2;
			sum2=sum;
		}
		return sum;
	}
	
	public static int calc(int n)
	{
		if(n<21)
		{
			return getFibonacci(n);
		}
		return getFibonacci(n)%10007;
	}
	
	public static int calc1(int n)
	{
		if(n<21)
		{
			return getFibonacci1(n);
		}
		return getFibonacci1(n)%10007;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		long start=System.currentTimeMillis();
		// TODO Fibonacci数过大溢出了
		System.out.println(calc1(1000000));
		System.out.println(System.currentTimeMillis()-start+"ms");
	}

}
