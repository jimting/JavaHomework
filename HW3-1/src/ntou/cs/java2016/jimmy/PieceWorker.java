package ntou.cs.java2016.jimmy;
import java.util.Scanner;
public class PieceWorker extends Employee{
	Scanner scanner = new Scanner(System.in);
	private double wage;
	private int piece;
	public PieceWorker()//建構子
	{
		System.out.print("Please input wage: ");
		wage = scanner.nextDouble();
		System.out.print("Please input piece: ");
		piece = scanner.nextInt();
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
	public double getEarning()//他賺的錢就是這樣算
	{
		// TODO Auto-generated method stub
		return wage*piece;
	}
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		String out = "Piece Worker => wage: "+ wage +", piece:"+ piece +", calculated earnings:"+this.getEarning()+", bonus:"+whatBonus.getBonus((int)this.getEarning());
		return out;
	}
}
