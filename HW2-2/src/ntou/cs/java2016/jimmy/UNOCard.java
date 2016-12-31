package ntou.cs.java2016.jimmy;
public class UNOCard 
{
	//�Ĥ@����enum �u���ܤ����D�����w��O���� 
	enum Type
	{
		Number,Skip,Draw2;
	}
	enum ColoredSuit
	{
		Blue,Green,Red,Yellow;
	}
	private Type MyType;
	private ColoredSuit MyColor;
	private int Number;
	public UNOCard()
	{
		Number = -1;
	}
	public Type getMyType() {
		return MyType;
	}
	public void setMyType(Type myType) {
		MyType = myType;
	}
	public ColoredSuit getMyColor() {
		return MyColor;
	}
	public void setMyColor(ColoredSuit myColor) {
		MyColor = myColor;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public UNOCard(String InputType,String InputColoredSuit,int InputNumber)
	{
		MyType = Type.valueOf(InputType);
		MyColor = ColoredSuit.valueOf(InputColoredSuit);
		this.Number = InputNumber;
	}
	@Override
	public String toString()
	{
		String Result = "";
		//�Ĥ@���Ψ�enum��switch�\��...���٬O�����D�L�O�F����
		switch(MyType)
		{
			case Number:Result = MyColor + " " + Number;break;
			case Skip:Result = MyColor + " " + MyType;break;
			case Draw2:Result = MyColor + " " + MyType;break;
		}
		return Result;
	}
}
