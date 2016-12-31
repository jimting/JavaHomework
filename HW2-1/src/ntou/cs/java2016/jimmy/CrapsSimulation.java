package ntou.cs.java2016.jimmy;
//我多宣告了兩個Class,Times和Play
//Times用來記錄擲了幾次的勝敗次數(用陣列宣告，所以可以省略"第幾次"的變數)
//Play只是方便傳遞訊息(第幾次輸贏)
import java.util.Random;
class Times
{
	private int Won;
	private int Lost;
	Times()
	{
		Won = 0;
		Lost = 0;
	}
	public void addWon()
	{
		Won++;
	}
	public void addLost()
	{
		Lost++;
	}
	public int getWon()
	{
		return Won;
	}
	public int getLost()
	{
		return Lost;
	}
	public String toString()
	{
		String Result = Won+" games won and "+Lost+" games lost ";
		return Result;
	}
}
public class CrapsSimulation 
{
	// create random number generator for use in method rollDice
	private Random randomNumbers = new Random();
	// enumeration with constants that represent the game status
	private enum Status { CONTINUE, WON, LOST };
	// constants that represent common rolls of the dice
	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;      
	private final static int SEVEN = 7;     
	private final static int YO_LEVEN = 11; 
	private final static int BOX_CARS = 12; 
	private Times TotalTimes[];
	class Play
	{
		public int Times;
		public Status WonOrLost;
		Play()
		{
			Times = 0;
		}
	}
	// plays one game of craps
	public Play play()
	{
		
		Play Play = new Play();//記錄擲了幾次骰子與狀態
		int myPoint = 0; // point if no win or loss on first roll
		int sumOfDice = rollDice(); // first roll of the dice
			// determine game status and point based on first roll 
		Play.Times++;
		switch ( sumOfDice ) 
		{
			case SEVEN: // win with 7 on first roll    
			case YO_LEVEN: // win with 11 on first roll
				Play.WonOrLost = Status.WON;
				break;
			case SNAKE_EYES: // lose with 2 on first roll
			case TREY: // lose with 3 on first roll      
			case BOX_CARS: // lose with 12 on first roll 
				Play.WonOrLost = Status.LOST;
				break;
			default: // did not win or lose, so remember point
				Play.WonOrLost = Status.CONTINUE; // game is not over
				myPoint = sumOfDice; // remember the point       
				System.out.printf( "Point is %d\n", myPoint );
				break; // optional at end of switch
					// end switch 
		}
			// while game is not complete
		while ( Play.WonOrLost == Status.CONTINUE ) // not WON or LOST
		{ 
			sumOfDice = rollDice(); // roll dice again
			// determine game status
			if ( sumOfDice == myPoint ) // win by making point
				Play.WonOrLost = Status.WON;
			else
				if ( sumOfDice == SEVEN ) // lose by rolling 7 before point
						Play.WonOrLost = Status.LOST;
			Play.Times++;
		} // end while 
			// display won or lost message
		if ( Play.WonOrLost == Status.WON )
			System.out.println( "Player wins" );
		else
			System.out.println( "Player loses" );
		return Play;
	} // end method play
	public int rollDice()
	{
		int Dice1 = randomNumbers.nextInt(6)+1;
		int Dice2 = randomNumbers.nextInt(6)+1;
		int add = Dice1+Dice2;
		return add;
	}
	public void playforthousand()
	{
		int WonTimes = 0;
		int TotalDoll = 0;
		TotalTimes = new Times[22];
		for(int i = 0;i < 22;i++)
		{
			TotalTimes[i] = new Times();
		}
		for(int i = 0;i < 1000;i++)
		{
			Play check = this.play();
			if(check.Times < 21)
				switch(check.WonOrLost)
				{
				case WON:
					TotalTimes[check.Times].addWon();
					WonTimes++;
					TotalDoll+=check.Times;
					break;
				case LOST:
					TotalTimes[check.Times].addLost();
					TotalDoll+=check.Times;
					break;
				default:
					break;
				}
			else
				switch(check.WonOrLost)
				{
				case WON:
					TotalTimes[21].addWon();
					WonTimes++;
					TotalDoll+=check.Times;
					break;
				case LOST:
					TotalTimes[21].addLost();
					TotalDoll+=check.Times;
					break;
				default:
					break;
				}
		}
		for(int i = 1;i < 22;i++)
		{
			if(i == 21)
			{
				System.out.println(TotalTimes[i] + "after the 20th roll");
			}
			else
				System.out.println(TotalTimes[i] + "on roll #" + i);
		}
		System.out.println("The chances of winning are " + WonTimes + " / 1000 = " + WonTimes*1.0/10 + "%");
		System.out.println("The average game length is " + TotalDoll*1.0/1000 + "rolls.");
	}
}