//這是一個有五個固定價格商品的商家想要的程式，想要方便算錢
package ntou.cs.java2016.jimmy;

import java.util.Scanner;

public class Sales 
{
	private double ProductQuantitySold1;//這邊是商品1~5
	private double ProductQuantitySold2;
	private double ProductQuantitySold3;
	private double ProductQuantitySold4;
	private double ProductQuantitySold5;
	public Sales()//建構元初始化囉囉
	{
		ProductQuantitySold1 = 0;
		ProductQuantitySold2 = 0;
		ProductQuantitySold3 = 0;
		ProductQuantitySold4 = 0;
		ProductQuantitySold5 = 0;
	}
	public void Menu()//這是程式的menu
	{
		int UserInput;
		do//淺顯易懂的介面，使用Scanner讀取輸入值，利用switch處理各種不同商品的處理事項
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
		End();//印商品總價
	}
	public void SetQuantitySold(int UserInput)//設定商品數量的function
	{
		Scanner scanner = new Scanner(System.in);
		int HowManySold;
		System.out.println("Enter quantity sold: ");
		HowManySold = scanner.nextInt();
		switch(UserInput)//在此又使用一個switch分流，不分開寫function是因為程式會太長又很亂，醜
		{
			case	1:ProductQuantitySold1 = HowManySold;break;
			case	2:ProductQuantitySold2 = HowManySold;break;
			case	3:ProductQuantitySold3 = HowManySold;break;
			case	4:ProductQuantitySold4 = HowManySold;break;
			case	5:ProductQuantitySold5 = HowManySold;break;
		}
	}
	public void End()//結束了所以把五個商品的總價印出來
	{
		System.out.println("Product 1:$" + 2.98*ProductQuantitySold1);
		System.out.println("Product 2:$" + 4.50*ProductQuantitySold2);
		System.out.println("Product 3:$" + 9.98*ProductQuantitySold3);
		System.out.println("Product 4:$" + 4.49*ProductQuantitySold4);
		System.out.println("Product 5:$" + 6.87*ProductQuantitySold5);
	}
}
