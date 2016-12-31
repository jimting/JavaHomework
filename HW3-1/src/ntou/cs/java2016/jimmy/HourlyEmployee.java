package ntou.cs.java2016.jimmy;

import java.util.Scanner;
//HourlyEmployee �N�O�uŪ�Ͱա㤣�L�u�@�W�L40�p�� �C�@�Ӥp�ɥi�H��1.5�����~���@�I��t��uŪ���٦h�O�I
class HourlyEmployee extends Employee
{
	Scanner scanner = new Scanner(System.in);
	private int hourlySalary;
	private int hour;
	public HourlyEmployee()//�غc�l ��scanner���oinput �M����O���ʧ@
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
	public double getEarning()//Employee�̭���function�A�p���Ȧh�ֿ�
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