//�o�O�@�ӥi�H�]�wEmployee���m�B�W�M���~�A�M��i�H��ܥX�m�B���M�~�~���{���A�H�Χ�L�̥[�~10%�A�ܴΧa�I��ı�o�W�Ϊ��A�ڤ]�Q�[�~
package ntou.cs.java2016.jimmy;

import java.text.DecimalFormat;

public class Employee 
{
	private String FirstName;	//�o��N�O�m�W�աI���ӫ�²��
	private String LastName;
	private double MonthlySalary;	//�o�N�O���~
	public Employee()	//�Z�Ƴ��ݭn��l�ơA�N���o��
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
	}	//�i�H���ϥΪ̫ŧi���ɭԳ]�w��l�ȡA��
	public void Raise()
	{
		MonthlySalary = MonthlySalary * 1.1;
	}//�[�~�o
	public String toString()
	{
		DecimalFormat df=new DecimalFormat("#.##");
		String s=df.format(MonthlySalary*12);
		return "Employ1: " + FirstName +" "+ LastName + ";Yearly Salary: " + s + "\n";
	}//toString�ޥ� �N�������o���`���N�O���u��ƪ�Sring��
}
