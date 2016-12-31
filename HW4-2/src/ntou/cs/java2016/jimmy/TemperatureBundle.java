package ntou.cs.java2016.jimmy;

import java.util.Arrays;

public class TemperatureBundle
{
	String location; // �a�z�ϰ�W��
	String weekDates[]; // ���P���
	String dayTemps[]; // ���P�դѮ��
	String nightTemps[]; // ���P�ߤW���
	String dayImages[]; //���g�դѮ�Թϥ�
	String nightImages[]; //���g�ߤW��Թϥ�

	public TemperatureBundle (String location, String[] weekDates,
			String[] dayTemps, String[] nightTemps, String dayImages[], String nightImages[])
	{
		this.location = location;
		this.weekDates = weekDates;
		this.dayTemps = dayTemps;
		this.nightTemps = nightTemps;
		this.dayImages = dayImages;
		this.nightImages = nightImages;
	}

	public String getLocation ()
	{
		return location;
	}

	public String[] getWeekDates ()
	{
		return weekDates;
	}

	public String[] getDayTemps ()
	{
		return dayTemps;
	}

	public String[] getNightTemps ()
	{
		return nightTemps;
	}
	
	public String[] getDayImages ()
	{
		return dayImages;
	}
	
	public String[] getNightImages ()
	{
		return nightImages;
	}

	@Override
	public String toString ()
	{
		return "TemperatureBundle [location=" + location + ", weekDates="
				+ Arrays.toString(weekDates) + ", dayTemps="
				+ Arrays.toString(dayTemps) + ", nightTemps="
				+ Arrays.toString(nightTemps) + ", dayImages="
				+ Arrays.toString(dayImages) + ", nightImages="
				+ Arrays.toString(nightImages) + "]";
	}
}
