package ntou.cs.java2016.jimmy;

import java.util.Random;

public class DeskOfUNOCard 
{
	UNOCard Cards[];
	//初始化比較麻煩一點 不過也才48個啦小Case
	public DeskOfUNOCard()
	{
		Cards = new UNOCard[48];
		Cards[0] = new UNOCard("Number","Blue",0);
		Cards[1] = new UNOCard("Number","Blue",1);
		Cards[2] = new UNOCard("Number","Blue",2);
		Cards[3] = new UNOCard("Number","Blue",3);
		Cards[4] = new UNOCard("Number","Blue",4);
		Cards[5] = new UNOCard("Number","Blue",5);
		Cards[6] = new UNOCard("Number","Blue",6);
		Cards[7] = new UNOCard("Number","Blue",7);
		Cards[8] = new UNOCard("Number","Blue",8);
		Cards[9] = new UNOCard("Number","Blue",9);
		Cards[10] = new UNOCard("Skip","Blue",-1);
		Cards[11] = new UNOCard("Draw2","Blue",-1);
		Cards[12] = new UNOCard("Number","Green",0);
		Cards[13] = new UNOCard("Number","Green",1);
		Cards[14] = new UNOCard("Number","Green",2);
		Cards[15] = new UNOCard("Number","Green",3);
		Cards[16] = new UNOCard("Number","Green",4);
		Cards[17] = new UNOCard("Number","Green",5);
		Cards[18] = new UNOCard("Number","Green",6);
		Cards[19] = new UNOCard("Number","Green",7);
		Cards[20] = new UNOCard("Number","Green",8);
		Cards[21] = new UNOCard("Number","Green",9);
		Cards[22] = new UNOCard("Skip","Green",-1);
		Cards[23] = new UNOCard("Draw2","Green",-1);
		Cards[24] = new UNOCard("Number","Red",0);
		Cards[25] = new UNOCard("Number","Red",1);
		Cards[26] = new UNOCard("Number","Red",2);
		Cards[27] = new UNOCard("Number","Red",3);
		Cards[28] = new UNOCard("Number","Red",4);
		Cards[29] = new UNOCard("Number","Red",5);
		Cards[30] = new UNOCard("Number","Red",6);
		Cards[31] = new UNOCard("Number","Red",7);
		Cards[32] = new UNOCard("Number","Red",8);
		Cards[33] = new UNOCard("Number","Red",9);
		Cards[34] = new UNOCard("Skip","Red",-1);
		Cards[35] = new UNOCard("Draw2","Red",-1);
		Cards[36] = new UNOCard("Number","Yellow",0);
		Cards[37] = new UNOCard("Number","Yellow",1);
		Cards[38] = new UNOCard("Number","Yellow",2);
		Cards[39] = new UNOCard("Number","Yellow",3);
		Cards[40] = new UNOCard("Number","Yellow",4);
		Cards[41] = new UNOCard("Number","Yellow",5);
		Cards[42] = new UNOCard("Number","Yellow",6);
		Cards[43] = new UNOCard("Number","Yellow",7);
		Cards[44] = new UNOCard("Number","Yellow",8);
		Cards[45] = new UNOCard("Number","Yellow",9);
		Cards[46] = new UNOCard("Skip","Yellow",-1);
		Cards[47] = new UNOCard("Draw2","Yellow",-1);
	}
	//把牌印出來
	public void PrintCard()
	{
		for(int i = 0;i < 48; i++)
		{
			System.out.println(Cards[i]);
		}
	}
	//洗牌 這邊用的方法是：做48次(設次數為i)，每次取一個0~47的Random數，把第Random組與第i組做交換
	public void ShuffleCard()
	{
		Random randomNumbers = new Random();
		for(int i = 0;i < 48; i++)
		{
			int RandomNumber = randomNumbers.nextInt(48);
			UNOCard temp = Cards[i];
			Cards[i] = Cards[RandomNumber];
			Cards[RandomNumber] = temp;
		}
	}
	//發牌 然後把剩下的牌印出來
	//想要把發出去的牌刪掉，本來想說用array裡面的功能(會自動遞補的那種)，後來沒找到就直接這樣寫了
	//不過功能還是符合題目要求啦！
	public void Licensing()
	{
		UNOCard player1[] = new UNOCard[4];
		UNOCard player2[] = new UNOCard[4];
		UNOCard player3[] = new UNOCard[4];
		UNOCard player4[] = new UNOCard[4];
		int top = 0;
		for(int i = 0;i < 4;i++)
		{
			player1[i] = Cards[top++];
			player2[i] = Cards[top++];
			player3[i] = Cards[top++];
			player4[i] = Cards[top++];
		}
		System.out.println("※First Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player1[i]);
		}
		System.out.println("※Second Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player2[i]);
		}
		System.out.println("※Third Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player3[i]);
		}
		System.out.println("※Fourth Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player4[i]);
		}
		System.out.println("▲Remaining Cards:");
		for(int i = top; i < 48; i++)
		{
			System.out.println(Cards[i]);
		}
		
	}
}
