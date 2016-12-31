package ntou.cs.java2016.jimmy;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WeatherViewer extends JFrame
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TemperatureBundle tempBundle;
	
	private JLabel cityJLabel;
	private JLabel dateJLabel;
	private JLabel dayTempJLabel;
	private JLabel nightTempJLabel;
	private JLabel dayTempImage;
	private JLabel nightTempImage;
	
	private JTextField dayTempJTextField;
	private JTextField nightTempJTextField;
	
	private String[] City = { "�򶩥�", "�O�_��", "�s�_��", "��饫", "�s�˥�", "�s�˿�", "�]�߿�", "�O����", "���ƿ�", "�n�뿤", "���L��", "�Ÿq��", "�Ÿq��", "�O�n��", "������", "�̪F��", "�y����", "�Ὤ��", "�O�F��", "�s����", "������", "���" };
	private String[] Date;
	private String[] dayTemp;
	private String[] nightTemp;
	private String[] dayImage;
	private String[] nightImage;
	
	private JComboBox<String> cityJComboBox;
	private JComboBox<String> dateJComboBox;
	
	private int CityChoose = 0;
	private int DateChoose = 0;

	public WeatherViewer() throws IndexOutOfBoundsException, IOException 
	{
		
        super("WeatherViewer");
		this.setLayout(new GridLayout(4,2));
		this.setFont(new Font("Tahoma",Font.PLAIN,24));
		
        //initial�e���������n�n��
        cityJLabel = new JLabel("�п�ܫ����G");
        dateJLabel = new JLabel("�п�ܤ���G");
        dayTempJLabel = new JLabel("�դѮ�šG");
        nightTempJLabel = new JLabel("�ߤW��šG");
        
        //ItemListener ����function�ŧi
        ItemListener cityItemListener = new ItemListener() 
        {
            public void itemStateChanged(ItemEvent itemEvent) 
            {
            	if(itemEvent.getStateChange() == ItemEvent.SELECTED	)
            	{						
					CityChoose = (cityJComboBox.getSelectedIndex());
					//��������ܪ��ɭԡA�n���ק�
					try 
					{
						tempBundle = TemperatureFetcher.getTemperature(City[CityChoose]);
				        dayTemp = tempBundle.getDayTemps();
				        nightTemp = tempBundle.getNightTemps();
				        dayImage = tempBundle.getDayImages();
				        nightImage = tempBundle.getNightImages();
				        dayTempJTextField.setText(dayTemp[DateChoose]);
						nightTempJTextField.setText(nightTemp[DateChoose]);
						URL url1 = new URL(dayImage[DateChoose]);
						ImageIcon Image1 = new ImageIcon(url1);
				        dayTempImage.setIcon(Image1);
				        URL url2 = new URL(nightImage[DateChoose]);
				        ImageIcon Image2 = new ImageIcon(url2);
				        nightTempImage.setIcon(Image2);
					} 
					catch (IndexOutOfBoundsException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					catch (IOException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
            }
        };
        ItemListener dateItemListener = new ItemListener() 
        {
            public void itemStateChanged(ItemEvent itemEvent) 
            {
            	if(itemEvent.getStateChange() == ItemEvent.SELECTED	)
            	{						
					DateChoose = (dateJComboBox.getSelectedIndex());
			        //�������ܪ��ɭԡA�n���ק�
					try 
					{
						dayTempJTextField.setText(dayTemp[DateChoose]);
						nightTempJTextField.setText(nightTemp[DateChoose]);
						URL url1 = new URL(dayImage[DateChoose]);
						ImageIcon Image1 = new ImageIcon(url1);
				        dayTempImage.setIcon(Image1);
				        URL url2 = new URL(nightImage[DateChoose]);
				        ImageIcon Image2 = new ImageIcon(url2);
				        nightTempImage.setIcon(Image2);
					} 
					catch (MalformedURLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
            	}
            }
        };
        
        //initial��������� + �]�w��������
        cityJComboBox = new JComboBox<String>(City);
        cityJComboBox.addItemListener(cityItemListener);
        
        //initial tempBundle
        tempBundle = TemperatureFetcher.getTemperature(City[CityChoose]);
        
        //initial�������� + �]�w�������
        Date = tempBundle.getWeekDates();
        dateJComboBox = new JComboBox<String>(Date);
        dateJComboBox.addItemListener(dateItemListener);
        
        //���즭�ߪ��ū�
        dayTemp = tempBundle.getDayTemps();
        nightTemp = tempBundle.getNightTemps();
        
        //���즭�߷ūת��Ϥ�
        dayImage = tempBundle.getDayImages();
        nightImage = tempBundle.getNightImages();
        
        //�U���ninitial���߷ū���
        
        //���W
        JPanel dayTempJPanel = new JPanel(); 
        dayTempJPanel.setLayout(new GridLayout(1,2));
        dayTempJTextField = new JTextField(dayTemp[DateChoose]);
        dayTempJTextField.setEditable(false);
        URL url1 = new URL(dayImage[DateChoose]);
        ImageIcon Image1 = new ImageIcon(url1);
        dayTempImage = new JLabel(Image1);
        dayTempJPanel.add(dayTempJTextField);
        dayTempJPanel.add(dayTempImage);
        
        //�ߤW
        JPanel nightTempJPanel = new JPanel();
        nightTempJPanel.setLayout(new GridLayout(0,2));
        nightTempJTextField = new JTextField(nightTemp[DateChoose]);
        nightTempJTextField.setEditable(false);
        URL url2 = new URL(nightImage[DateChoose]);
        ImageIcon Image2 = new ImageIcon(url2);
        nightTempImage = new JLabel(Image2);
        nightTempJPanel.add(nightTempJTextField);
        nightTempJPanel.add(nightTempImage);
        
        //�̦h��ܤT��
        cityJComboBox.setMaximumRowCount(3);
        dateJComboBox.setMaximumRowCount(3);
        
        //��������F��[��Dframe�̭�
        add(cityJLabel);
        add(cityJComboBox);
        add(dateJLabel);
        add(dateJComboBox);
        add(dayTempJLabel);
        add(dayTempJPanel);
        add(nightTempJLabel);
        add(nightTempJPanel);
        
        //�]���ݪ��� ���n�b�I������
        setVisible(true);
    }    
}
