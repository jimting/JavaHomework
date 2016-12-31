package ntou.cs.java2016.jimmy;

public abstract class Employee//裡面就這兩個東西而已
{
	protected Bonus whatBonus;//用protected是因為subClass要修改
	public abstract double getEarning();
}
