//真的是一個很棒的程式呢！可以幫員工算薪水
//其實暑假老師出的作業已經練習過了，大部分的程式碼都一樣啦！
package ntou.cs.java2016.jimmy;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		ArrayList<Employee> worker = new ArrayList<>();
		int sum = 0;
		int bonusSum = 0;
		int choise = 0;
		while(choise != -1)
		{	
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("---Earnings Calculation System:");
			System.out.println("1. SalariedEmployee");
			System.out.println("2. HourlyEmployee");
			System.out.println("3. CommissionEmployee");
			System.out.println("4. Piece Worker");
			System.out.print("Please input (1~4, -1 to end): ");
			choise = scanner.nextInt();
			switch(choise)
			{
				case 1:Employee newman1 = new SalariedEmployee();sum += newman1.getEarning();bonusSum += newman1.whatBonus.getBonus((int)newman1.getEarning());worker.add(newman1);break;
				case 2:Employee newman2 = new HourlyEmployee();sum += newman2.getEarning();bonusSum += newman2.whatBonus.getBonus((int)newman2.getEarning());worker.add(newman2);break;
				case 3:Employee newman3 = new CommissionEmployee();sum += newman3.getEarning();bonusSum += newman3.whatBonus.getBonus((int)newman3.getEarning());worker.add(newman3);break;
				case 4:Employee newman4 = new PieceWorker();sum += newman4.getEarning();bonusSum += newman4.whatBonus.getBonus((int)newman4.getEarning());worker.add(newman4);break;
			}
		}
		System.out.println("Input finished!");
		System.out.println("---Result:");
		for(Employee x:worker)
		{
			System.out.println("No." + (worker.indexOf(x)+1));
			System.out.println(x);
		}
		System.out.println("\nTotal earnings: " + sum);
		System.out.println("Total bonus: " + bonusSum);
	}
}
