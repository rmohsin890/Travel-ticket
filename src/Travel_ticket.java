import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Travel_ticket {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JRadioButton rdbtnStandard;
	private JRadioButton rdbtnEconomy;
	private JRadioButton rdbtnFirstClass;
	private JRadioButton rdbtnSingleTicket;
	private JRadioButton rdbtnReturnTicket;
	private JRadioButton rdbtnAdult;
	private JRadioButton rdbtnChild;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travel_ticket window = new Travel_ticket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Travel_ticket() {
		initialize();
		
	}
	
	  

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1150, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeading = new JLabel("Travelling Ticketing System");
		lblHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeading.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHeading.setBounds(151, 22, 590, 39);
		frame.getContentPane().add(lblHeading);
		
		JLabel lblNewLabel = new JLabel("Ticket Type");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(62, 73, 166, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 106, 256, 2);
		frame.getContentPane().add(separator);
		
		rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnStandard.isSelected())
				{
					rdbtnEconomy.setSelected(false);
					rdbtnFirstClass.setSelected(false);
				}
			}
		});
		rdbtnStandard.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnStandard.setBounds(6, 124, 120, 22);
		frame.getContentPane().add(rdbtnStandard);
		
		rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnEconomy.isSelected())
				{
					rdbtnStandard.setSelected(false);
					rdbtnFirstClass.setSelected(false);
				}
			}
		});
		rdbtnEconomy.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnEconomy.setBounds(6, 150, 109, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnFirstClass.isSelected())
				{
					rdbtnStandard.setSelected(false);
					rdbtnEconomy.setSelected(false);
				}
			}
		});
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnFirstClass.setBounds(6, 180, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSingleTicket.isSelected())
				{
					rdbtnReturnTicket.setSelected(false);		
				}
			}
		});
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnSingleTicket.setBounds(138, 124, 130, 22);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnReturnTicket.isSelected())
				{
					rdbtnSingleTicket.setSelected(false);		
				}
			}
		});
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnReturnTicket.setBounds(138, 150, 109, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnAdult.isSelected())
				{
					rdbtnChild.setSelected(false);		
				}
			}
		});
		rdbtnAdult.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnAdult.setBounds(264, 124, 139, 22);
		frame.getContentPane().add(rdbtnAdult);
		
		rdbtnChild = new JRadioButton("Child");
		rdbtnChild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnChild.isSelected())
				{
					rdbtnAdult.setSelected(false);		
				}
			}
		});
		rdbtnChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnChild.setBounds(264, 150, 130, 22);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setAlignmentX(Component.RIGHT_ALIGNMENT);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Destination", "Frankfurt", "Dresden", "Munich"}));
		comboBox.setBounds(138, 180, 226, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTax.setBounds(10, 265, 130, 35);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubTotal.setBounds(6, 316, 116, 31);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotal.setBounds(6, 358, 120, 39);
		frame.getContentPane().add(lblTotal);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(138, 273, 226, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(138, 316, 226, 27);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(138, 363, 226, 27);
		frame.getContentPane().add(textField_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			}
		});
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// int T = 0, Tax, SubT, k;
				if (rdbtnSingleTicket.isSelected()) {
					textField_4.setText("One Way");
				}
				if (rdbtnReturnTicket.isSelected()) {
					textField_4.setText("Return Ticket");
					
				}
				if (rdbtnAdult.isSelected()) {
					textField_5.setText("Adult");
					textField_6.setText("No");
				}
				if (rdbtnChild.isSelected()) {
					textField_6.setText("Yes");
					textField_5.setText("No");
				}
				
			
				
				String destination = comboBox.getSelectedItem().toString();
				if (rdbtnStandard.isSelected() || rdbtnEconomy.isSelected() && rdbtnSingleTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Frankfurt" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);	
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   
					   int T, Tax, SubT;
					   T = 200;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("Standard");	   
				}
				if (rdbtnStandard.isSelected() || rdbtnEconomy.isSelected() && rdbtnSingleTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Dresden" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);	
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 300;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("Standard");	   
				}
				else if  (rdbtnStandard.isSelected() || rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Frankfurt" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 400;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("Standard");	   
				}
				else if  (rdbtnStandard.isSelected() || rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Dresden" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 550;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("Standard");	   
				}
				else if (rdbtnStandard.isSelected() || rdbtnEconomy.isSelected() && rdbtnSingleTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Munich" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 450;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("Standard");	   
				}
				else if (rdbtnStandard.isSelected() || rdbtnEconomy.isSelected() && rdbtnReturnTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Munich" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 650;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("Standard");	   
				}
				else if (rdbtnStandard.isSelected() || rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Munich" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 950;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("First Class");	   
				}
				else if (rdbtnStandard.isSelected() || rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Dresden" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 1250;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("First Class");	   
				}
				else if (rdbtnStandard.isSelected() || rdbtnFirstClass.isSelected() && rdbtnReturnTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Frankfurt" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 1050;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("First Class");	   
				}
				if (rdbtnStandard.isSelected() || rdbtnFirstClass.isSelected() && rdbtnSingleTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Frankfurt" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 500;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("First Class");	   
				}
				if (rdbtnStandard.isSelected() || rdbtnFirstClass.isSelected() && rdbtnSingleTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Dresden" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 600;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("First Class");	   
				}
				if (rdbtnStandard.isSelected() || rdbtnFirstClass.isSelected() && rdbtnSingleTicket.isSelected() && 
						rdbtnAdult.isSelected() || rdbtnChild.isSelected() && destination == "Munich" ) {
					
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
					   LocalDateTime now = LocalDateTime.now();
					   LocalDateTime now1 = LocalDateTime.now();
					   textField_10.setText(dtf.format(now));
					   textField_9.setText(dtf1.format(now1));
					   textField_7.setText("London");
					   String s = comboBox.getSelectedItem().toString();
					   textField_8.setText(s);
					   Random rnd = new Random(); 
						int n3 = rnd.nextInt(4000) + 1000; 
						textField_11.setText("DE" + n3);
					   int T, Tax, SubT;
					   T = 700;
					   Tax = (T/100)*19;
					   SubT = T -Tax;
					   textField_2.setText(Double.toString(T));
					   textField_12.setText(Double.toString(T));
					   textField_1.setText(Double.toString(SubT));
					   textField.setText(Double.toString(Tax));
					   textField_3.setText("First Class");	   
				}
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTotal.setBounds(6, 446, 95, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false); 
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(139, 446, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(275, 446, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setAlignmentY(1.5f);
		separator_1.setAlignmentX(1.5f);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(453, 106, 12, 375);
		frame.getContentPane().add(separator_1);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblClass.setBounds(536, 79, 94, 29);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicket.setBounds(690, 79, 94, 29);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("Adult");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAdult.setBounds(838, 79, 94, 29);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChild.setBounds(984, 79, 94, 29);
		frame.getContentPane().add(lblChild);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setBounds(520, 126, 89, 35);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(663, 126, 89, 35);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(809, 126, 89, 35);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_6.setColumns(10);
		textField_6.setBounds(963, 126, 89, 35);
		frame.getContentPane().add(textField_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(520, 187, 538, 16);
		frame.getContentPane().add(separator_2);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFrom.setBounds(520, 254, 89, 35);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTo.setBounds(520, 322, 82, 35);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(520, 380, 89, 35);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTime.setBounds(520, 446, 82, 35);
		frame.getContentPane().add(lblTime);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_7.setBounds(606, 254, 146, 35);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_8.setColumns(10);
		textField_8.setBounds(606, 322, 146, 35);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_9.setColumns(10);
		textField_9.setBounds(606, 381, 146, 35);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_10.setColumns(10);
		textField_10.setBounds(606, 446, 146, 35);
		frame.getContentPane().add(textField_10);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setAlignmentY(1.5f);
		separator_1_1.setAlignmentX(1.5f);
		separator_1_1.setBounds(845, 210, 12, 277);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTicketNo.setBounds(943, 214, 109, 31);
		frame.getContentPane().add(lblTicketNo);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_11.setColumns(10);
		textField_11.setBounds(906, 255, 146, 35);
		frame.getContentPane().add(textField_11);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrice.setBounds(943, 301, 109, 39);
		frame.getContentPane().add(lblPrice);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_12.setColumns(10);
		textField_12.setBounds(906, 351, 146, 35);
		frame.getContentPane().add(textField_12);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRoute.setBounds(943, 397, 101, 31);
		frame.getContentPane().add(lblRoute);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(906, 441, 146, 35);
		frame.getContentPane().add(textField_13);
	}
}
