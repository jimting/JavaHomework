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
	
	private String[] City = { "基隆市", "臺北市", "新北市", "桃園市", "新竹市", "新竹縣", "苗栗縣", "臺中市", "彰化縣", "南投縣", "雲林縣", "嘉義市", "嘉義縣", "臺南市", "高雄市", "屏東縣", "宜蘭縣", "花蓮縣", "臺東縣", "連江縣", "金門縣", "澎湖縣" };
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
		
        //initial前面的哩哩叩叩啦
        cityJLabel = new JLabel("請選擇城市：");
        dateJLabel = new JLabel("請選擇日期：");
        dayTempJLabel = new JLabel("白天氣溫：");
        nightTempJLabel = new JLabel("晚上氣溫：");
        
        //ItemListener 取值function宣告
        ItemListener cityItemListener = new ItemListener() 
        {
            public void itemStateChanged(ItemEvent itemEvent) 
            {
            	if(itemEvent.getStateChange() == ItemEvent.SELECTED	)
            	{						
					CityChoose = (cityJComboBox.getSelectedIndex());
					//換城市選擇的時候，要做修改
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
			        //換日期選擇的時候，要做修改
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
        
        //initial城市選擇欄 + 設定城市取值
        cityJComboBox = new JComboBox<String>(City);
        cityJComboBox.addItemListener(cityItemListener);
        
        //initial tempBundle
        tempBundle = TemperatureFetcher.getTemperature(City[CityChoose]);
        
        //initial日期選擇欄 + 設定日期取值
        Date = tempBundle.getWeekDates();
        dateJComboBox = new JComboBox<String>(Date);
        dateJComboBox.addItemListener(dateItemListener);
        
        //拿到早晚的溫度
        dayTemp = tempBundle.getDayTemps();
        nightTemp = tempBundle.getNightTemps();
        
        //拿到早晚溫度的圖片
        dayImage = tempBundle.getDayImages();
        nightImage = tempBundle.getNightImages();
        
        //下面要initial早晚溫度欄
        
        //早上
        JPanel dayTempJPanel = new JPanel(); 
        dayTempJPanel.setLayout(new GridLayout(1,2));
        dayTempJTextField = new JTextField(dayTemp[DateChoose]);
        dayTempJTextField.setEditable(false);
        URL url1 = new URL(dayImage[DateChoose]);
        ImageIcon Image1 = new ImageIcon(url1);
        dayTempImage = new JLabel(Image1);
        dayTempJPanel.add(dayTempJTextField);
        dayTempJPanel.add(dayTempImage);
        
        //晚上
        JPanel nightTempJPanel = new JPanel();
        nightTempJPanel.setLayout(new GridLayout(0,2));
        nightTempJTextField = new JTextField(nightTemp[DateChoose]);
        nightTempJTextField.setEditable(false);
        URL url2 = new URL(nightImage[DateChoose]);
        ImageIcon Image2 = new ImageIcon(url2);
        nightTempImage = new JLabel(Image2);
        nightTempJPanel.add(nightTempJTextField);
        nightTempJPanel.add(nightTempImage);
        
        //最多顯示三行
        cityJComboBox.setMaximumRowCount(3);
        dateJComboBox.setMaximumRowCount(3);
        
        //把全部的東西加到主frame裡面
        add(cityJLabel);
        add(cityJComboBox);
        add(dateJLabel);
        add(dateJComboBox);
        add(dayTempJLabel);
        add(dayTempJPanel);
        add(nightTempJLabel);
        add(nightTempJPanel);
        
        //設為看的到 不要在背景執行
        setVisible(true);
    }    
}
