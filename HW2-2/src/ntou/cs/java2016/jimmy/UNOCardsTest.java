//簡單版UNO，共48張牌
//功能1:印出牌
//功能2:洗牌
//功能3:發給四個玩家各四張，並印出剩下的牌
package ntou.cs.java2016.jimmy;

public class UNOCardsTest 
{
	public static void main(String args[])
	{
		DeskOfUNOCard Start = new DeskOfUNOCard();
		System.out.println("=====新的UNO牌：=====");
		Start.PrintCard();
		System.out.println("=====洗牌囉！=====");
		Start.ShuffleCard();
		System.out.println("=====洗牌後：=====");
		Start.PrintCard();
		System.out.println("=====開始發牌：=====");//加印出結果
		Start.Licensing();
	}
}
