package ntou.cs.java2016.jimmy;

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Employee Employee1 = new Employee("Bob","Jones",2875.00);//第一個員工叫包伯瓊斯，月薪2875.00
		Employee Employee2 = new Employee("Susan","Baker",3150.75);//第二個員工叫蘇珊貝可，月薪3150.75
		System.out.println(Employee1);//印出員工資料
		System.out.println(Employee2);
		Employee1.Raise();//加薪時間
		Employee2.Raise();
		System.out.println("Increasing employee salaries by 10% \n");
		System.out.println(Employee1);//在印一次員工資料
		System.out.println(Employee2);	
	}
}
