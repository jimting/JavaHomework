package ntou.cs.java2016.jimmy;

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Employee Employee1 = new Employee("Bob","Jones",2875.00);//�Ĥ@�ӭ��u�s�]�Bã���A���~2875.00
		Employee Employee2 = new Employee("Susan","Baker",3150.75);//�ĤG�ӭ��u�sĬ�����i�A���~3150.75
		System.out.println(Employee1);//�L�X���u���
		System.out.println(Employee2);
		Employee1.Raise();//�[�~�ɶ�
		Employee2.Raise();
		System.out.println("Increasing employee salaries by 10% \n");
		System.out.println(Employee1);//�b�L�@�����u���
		System.out.println(Employee2);	
	}
}
