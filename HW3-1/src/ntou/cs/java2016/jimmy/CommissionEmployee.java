package ntou.cs.java2016.jimmy;

import java.util.Scanner;
class CommissionEmployee extends Employee
{
	Scanner scanner = new Scanner(System.in);
	private double commissionRate;
	private int grossSales;
	public CommissionEmployee()//�غc�l
	{
		System.out.print("Please input commission rate:");
		commissionRate = scanner.nextDouble();
		System.out.print("Please input gross sales:");
		grossSales = scanner.nextInt();
		System.out.print("Please input type of Bonus (1: static, 2: dynamic): ");
		int bonusChoise = scanner.nextInt();
		if(bonusChoise == 1)
		{
			whatBonus = new StaticBonus();
		}
		else if(bonusChoise == 2)
		{
			whatBonus = new DynamicBonus();
		}
	}
	public String toString()
	{
		String out = "Commission Employee => commission rate: "+ commissionRate +", gross sales:"+ grossSales +", calculated earnings:"+this.getEarning()+", bonus:" + whatBonus.getBonus((int)this.getEarning());
		return out;
	}
	public double getEarning()//�L�Ȫ����N�O�o�˺�I
	{
		double total = commissionRate*grossSales;
		return total;
	}
}