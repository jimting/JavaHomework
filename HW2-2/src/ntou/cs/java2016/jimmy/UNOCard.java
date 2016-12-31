package ntou.cs.java2016.jimmy;
public class UNOCard 
{
	//第一次用enum 真的很不知道它的定位是什麼 
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
		//第一次用到enum的switch功能...恩還是不知道他是幹嘛的
		switch(MyType)
		{
			case Number:Result = MyColor + " " + Number;break;
			case Skip:Result = MyColor + " " + MyType;break;
			case Draw2:Result = MyColor + " " + MyType;break;
		}
		return Result;
	}
}
