package ntou.cs.java2016.jimmy;

public class DynamicBonus implements Bonus
{

	@Override
	public int getBonus (int salary)
	{
		return (int)(salary * .1);
	}
}
