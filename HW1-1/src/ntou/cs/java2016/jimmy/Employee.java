//這是一個可以設定Employee的姓、名和月薪，然後可以顯示出姓、明和年薪的程式，以及把他們加薪10%，很棒吧！我覺得超棒的，我也想加薪
package ntou.cs.java2016.jimmy;

import java.text.DecimalFormat;

public class Employee 
{
	private String FirstName;	//這邊就是姓名啦！應該很簡單
	private String LastName;
	private double MonthlySalary;	//這就是月薪
	public Employee()	//凡事都需要初始化，就像這裡
	{
		FirstName = "";
		LastName = "";
		MonthlySalary = 0;
	}
	public Employee(String SetFirstName,String SetLastName,double SetMonthlySalary)
	{
		FirstName = SetFirstName;
		LastName = SetLastName;
		MonthlySalary = SetMonthlySalary;
	}	//可以給使用者宣告的時候設定初始值，棒
	public void Raise()
	{
		MonthlySalary = MonthlySalary * 1.1;
	}//加薪囉
	public String toString()
	{
		DecimalFormat df=new DecimalFormat("#.##");
		String s=df.format(MonthlySalary*12);
		return "Employ1: " + FirstName +" "+ LastName + ";Yearly Salary: " + s + "\n";
	}//toString技巧 就不解釋囉～總之就是員工資料的Sring版
}
