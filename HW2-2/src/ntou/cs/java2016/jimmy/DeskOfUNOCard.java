package ntou.cs.java2016.jimmy;

import java.util.Random;

public class DeskOfUNOCard 
{
	UNOCard Cards[];
	//��l�Ƥ���·Ф@�I ���L�]�~48�ӰդpCase
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
	//��P�L�X��
	public void PrintCard()
	{
		for(int i = 0;i < 48; i++)
		{
			System.out.println(Cards[i]);
		}
	}
	//�~�P �o��Ϊ���k�O�G��48��(�]���Ƭ�i)�A�C�����@��0~47��Random�ơA���Random�ջP��i�հ��洫
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
	//�o�P �M���ѤU���P�L�X��
	//�Q�n��o�X�h���P�R���A���ӷQ����array�̭����\��(�|�۰ʻ��ɪ�����)�A��ӨS���N�����o�˼g�F
	//���L�\���٬O�ŦX�D�حn�D�աI
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
		System.out.println("��First Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player1[i]);
		}
		System.out.println("��Second Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player2[i]);
		}
		System.out.println("��Third Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player3[i]);
		}
		System.out.println("��Fourth Player:");
		for(int i = 0; i < 4; i++)
		{
			System.out.println(player4[i]);
		}
		System.out.println("��Remaining Cards:");
		for(int i = top; i < 48; i++)
		{
			System.out.println(Cards[i]);
		}
		
	}
}
