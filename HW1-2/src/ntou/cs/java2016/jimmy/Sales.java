//�o�O�@�Ӧ����өT�w����ӫ~���Ӯa�Q�n���{���A�Q�n��K���
package ntou.cs.java2016.jimmy;

import java.util.Scanner;

public class Sales 
{
	private double ProductQuantitySold1;//�o��O�ӫ~1~5
	private double ProductQuantitySold2;
	private double ProductQuantitySold3;
	private double ProductQuantitySold4;
	private double ProductQuantitySold5;
	public Sales()//�غc����l���o�o
	{
		ProductQuantitySold1 = 0;
		ProductQuantitySold2 = 0;
		ProductQuantitySold3 = 0;
		ProductQuantitySold4 = 0;
		ProductQuantitySold5 = 0;
	}
	public void Menu()//�o�O�{����menu
	{
		int UserInput;
		do//�L������������A�ϥ�ScannerŪ����J�ȡA�Q��switch�B�z�U�ؤ��P�ӫ~���B�z�ƶ�
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter product number (1-5) (0 to stop): ");
			UserInput = scanner.nextInt();
			switch(UserInput)
			{
				case	1:SetQuantitySold(1);break;
				case	2:SetQuantitySold(2);break;
				case	3:SetQuantitySold(3);break;
				case	4:SetQuantitySold(4);break;
				case	5:SetQuantitySold(5);break;
			}
		}while(UserInput != 0);
		End();//�L�ӫ~�`��
	}
	public void SetQuantitySold(int UserInput)//�]�w�ӫ~�ƶq��function
	{
		Scanner scanner = new Scanner(System.in);
		int HowManySold;
		System.out.println("Enter quantity sold: ");
		HowManySold = scanner.nextInt();
		switch(UserInput)//�b���S�ϥΤ@��switch���y�A�����}�gfunction�O�]���{���|�Ӫ��S�ܶáA��
		{
			case	1:ProductQuantitySold1 = HowManySold;break;
			case	2:ProductQuantitySold2 = HowManySold;break;
			case	3:ProductQuantitySold3 = HowManySold;break;
			case	4:ProductQuantitySold4 = HowManySold;break;
			case	5:ProductQuantitySold5 = HowManySold;break;
		}
	}
	public void End()//�����F�ҥH�⤭�Ӱӫ~���`���L�X��
	{
		System.out.println("Product 1:$" + 2.98*ProductQuantitySold1);
		System.out.println("Product 2:$" + 4.50*ProductQuantitySold2);
		System.out.println("Product 3:$" + 9.98*ProductQuantitySold3);
		System.out.println("Product 4:$" + 4.49*ProductQuantitySold4);
		System.out.println("Product 5:$" + 6.87*ProductQuantitySold5);
	}
}
