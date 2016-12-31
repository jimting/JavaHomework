package ntou.cs.java2016.jimmy;

import java.util.Scanner;
class SalariedEmployee extends Employee
{
	Scanner scanner = new Scanner(System.in);
	private int weeklySalary;
	private int week;
	public SalariedEmployee()//建構子
	{
		System.out.print("Please input weekly salary: ");
		weeklySalary = scanner.nextInt();
		System.out.print("Please input working weeks: ");
		week = scanner.nextInt();
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
		String out = "Salaried Employee => weekly salary: "+ weeklySalary +", working weeks: "+ week +", calculated earnings: "+this.getEarning()+", bonus: " + whatBonus.getBonus((int)this.getEarning());
		return out;
	}
	public double getEarning()//他賺的錢就是這樣算
	{
		double total = weeklySalary * week;
		return total;
	}
}