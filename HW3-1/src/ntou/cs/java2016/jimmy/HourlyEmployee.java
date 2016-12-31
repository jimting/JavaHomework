package ntou.cs.java2016.jimmy;

import java.util.Scanner;
//HourlyEmployee 就是工讀生啦～不過工作超過40小時 每一個小時可以拿1.5倍的薪水哦！比系辦工讀金還多呢！
class HourlyEmployee extends Employee
{
	Scanner scanner = new Scanner(System.in);
	private int hourlySalary;
	private int hour;
	public HourlyEmployee()//建構子 用scanner取得input 然後分別做動作
	{
		System.out.print("Please input hourly salary: ");
		hourlySalary = scanner.nextInt();
		System.out.print("Please input hours: ");
		hour = scanner.nextInt();
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
	@Override
	public String toString()//toString
	{
		String out = "Hourly Employee => hourly salary:"+ hourlySalary +", hours:"+ hour +", calculated earnings:"+this.getEarning()+", bonus:"+whatBonus.getBonus((int)this.getEarning());
		return out;
	}
	@Override
	public double getEarning()//Employee裡面的function，計算賺多少錢
	{
		double total;
		if(hour>40)
		{
			total = 40*hourlySalary + (hour-40)*hourlySalary*1.5;
		}
		else
		{
			total = hourlySalary*hour;
		}
		return total;
	}
}