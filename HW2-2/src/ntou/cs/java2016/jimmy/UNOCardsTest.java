//²�檩UNO�A�@48�i�P
//�\��1:�L�X�P
//�\��2:�~�P
//�\��3:�o���|�Ӫ��a�U�|�i�A�æL�X�ѤU���P
package ntou.cs.java2016.jimmy;

public class UNOCardsTest 
{
	public static void main(String args[])
	{
		DeskOfUNOCard Start = new DeskOfUNOCard();
		System.out.println("=====�s��UNO�P�G=====");
		Start.PrintCard();
		System.out.println("=====�~�P�o�I=====");
		Start.ShuffleCard();
		System.out.println("=====�~�P��G=====");
		Start.PrintCard();
		System.out.println("=====�}�l�o�P�G=====");//�[�L�X���G
		Start.Licensing();
	}
}
