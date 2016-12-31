//這是一個可以印出一首叫做Twelve的鬼打牆歌詞的程式，真是太棒了
package ntou.cs.java2016.jimmy;

import org.omg.CORBA.SystemException;

public class Twelve 
{
	public void TwelveDayLyrics()//這邊是主要呼叫function，有一個switch控制1~12月
	{
		for(int Count = 0;Count < 12;Count++)
		{
			switch(Count)
			{
			case	0:System.out.println("On the first day of Christmas, my true love gave to me: ");this.FirstDay();break;
			case	1:System.out.println("On the second day of Christmas, my true love gave to me: ");this.SecondDay();break;
			case	2:System.out.println("On the third day of Christmas, my true love gave to me: ");this.ThirdDay();break;
			case	3:System.out.println("On the fourth day of Christmas, my true love gave to me: ");this.FourthDay();break;
			case	4:System.out.println("On the fifth day of Christmas, my true love gave to me: ");this.FifthDay();break;
			case	5:System.out.println("On the sixth day of Christmas, my true love gave to me: ");this.SixthDay();break;
			case	6:System.out.println("On the seventh day of Christmas, my true love gave to me: ");this.SeventhDay();break;
			case	7:System.out.println("On the eighth day of Christmas, my true love gave to me: ");this.EighthDay();break;
			case	8:System.out.println("On the ninth day of Christmas, my true love gave to me: ");this.NinthDay();break;
			case	9:System.out.println("On the tenth day of Christmas, my true love gave to me: ");this.TenthDay();break;
			case	10:System.out.println("On the eleventh day of Christmas, my true love gave to me: ");this.EleventhDay();break;
			case	11:System.out.println("On the twelfth day of Christmas, my true love gave to me: ");this.TwelfthDay();break;
			}
			System.out.println("");
		}
	}
	public void FirstDay()//以下為1~12月不同的歌詞，最主要用到迴圈包迴圈的方式呈現
	{
		System.out.println("A Partridge in a Pear Tree");
	}
	public void SecondDay()
	{
		System.out.println("Two Turtle Doves");
		System.out.println("and a Partridge in a Pear Tree");

	}
	public void ThirdDay()
	{
		System.out.println("Three French Hens");
		this.SecondDay();

	}
	public void FourthDay()
	{
		System.out.println("Four Calling Birds");
		this.ThirdDay();
	}
	public void FifthDay()
	{
		System.out.println("Five Golden Rings");
		this.FourthDay();
	}
	public void SixthDay()
	{
		System.out.println("Six Geese a Laying");
		this.FifthDay();
	}
	public void SeventhDay()
	{
		System.out.println("Seven Swans a Swimming");
		this.SixthDay();
	}
	public void EighthDay()
	{
		System.out.println("Eight Maids a Milking");
		this.SeventhDay();
	}
	public void NinthDay()
	{
		System.out.println("Nine Ladies Dancing");
		this.EighthDay();
	}
	public void TenthDay()
	{
		System.out.println("Ten Lords a Leaping");
		this.NinthDay();
	}
	public void EleventhDay()
	{
		System.out.println("Eleven Pipers Piping");
		this.TenthDay();
	}
	public void TwelfthDay()
	{
		System.out.println("12 Drummers Drumming");
		this.EleventhDay();
	}
}
