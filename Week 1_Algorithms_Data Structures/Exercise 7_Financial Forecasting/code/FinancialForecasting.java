import java.util.*;
public class FinancialForecasting {
	public double forecast(double rates[],int yr, double v)//fv=pv*(1+r1)*(1+r2)*(1+r3)...*(1+rn)
	{
		if(yr==rates.length) // base case
			return v;
		return forecast(rates,yr+1,v*(1+rates[yr]));
	}
	public static void main(String[] args) {
		FinancialForecasting ob=new FinancialForecasting();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter present value");
		double pv=sc.nextDouble();
		System.out.println("Enter the no oy years and previous growth rates");
		int n=sc.nextInt();
		double rates[]=new double[n];
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter rate");
			rates[i]=sc.nextDouble();
		}
		double fv=ob.forecast(rates,0,pv);
		System.out.println("The predicted value after "+n+" years is "+fv);
		

	}

}
