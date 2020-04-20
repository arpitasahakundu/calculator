package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(100, 200, 269, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 233, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//---------row1----------//
		JButton btnNewButtonback = new JButton("<-");
		btnNewButtonback.setForeground(new Color(0, 0, 0));
		btnNewButtonback.setFont(UIManager.getFont("ComboBox.font"));
		btnNewButtonback.setBounds(10, 71, 50, 50);
		btnNewButtonback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back=null;
				
				if(textField.getText().length()>0){
					StringBuilder strB =new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					back=strB.toString();
					textField.setText(back);
				}
			}
		});
		frame.getContentPane().add(btnNewButtonback);
		
		JButton btnNewButtonpoint = new JButton(".");
		btnNewButtonpoint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonpoint.setBounds(70, 71, 50, 50);
		btnNewButtonpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText()+ btnNewButtonpoint.getText();
				textField.setText(EnterNumber );
				
			}
		});
		frame.getContentPane().add(btnNewButtonpoint);
		
		JButton btnNewButtonpercent = new JButton("%");
		btnNewButtonpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("" );
				operations = "%";
			}
		});
		btnNewButtonpercent.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButtonpercent.setBounds(130, 71, 50, 50);
		frame.getContentPane().add(btnNewButtonpercent);
		
		JButton btnNewButtonplus = new JButton("+");
		btnNewButtonplus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButtonplus.setBounds(190, 71, 50, 50);
		btnNewButtonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("" );
				operations = "+";
			}
		});
		frame.getContentPane().add(btnNewButtonplus);
		//----------row2--------//
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText()+ btnNewButton7.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton7.setBounds(10, 132, 50, 50);
		frame.getContentPane().add(btnNewButton7);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+ btnNewButton8.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton8.setBounds(70, 132, 50, 50);
		frame.getContentPane().add(btnNewButton8);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText()+ btnNewButton9.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton9.setBounds(130, 132, 50, 50);
		frame.getContentPane().add(btnNewButton9);
		
		JButton btnNewButtonminus = new JButton("-");
		btnNewButtonminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButtonminus.setBounds(190, 132, 50, 50);
		btnNewButtonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("" );
				operations = "-";
		
			}
		});
		frame.getContentPane().add(btnNewButtonminus);
		//-----------row3---------//
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText()+ btnNewButton4.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton4.setBounds(10, 194, 50, 50);
		frame.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText()+ btnNewButton5.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton5.setBounds(70, 192, 50, 50);
		frame.getContentPane().add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+ btnNewButton6.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton6.setBounds(130, 192, 50, 50);
		frame.getContentPane().add(btnNewButton6);
		
		JButton btnNewButtonmul = new JButton("*");
		btnNewButtonmul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButtonmul.setBounds(190, 192, 50, 50);
		btnNewButtonmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("" );
				operations = "*";
			}
		});
		frame.getContentPane().add(btnNewButtonmul);
		//---------------row4----------//
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText()+ btnNewButton1.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton1.setBounds(10, 254, 50, 50);
		frame.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton2.setEnabled(true);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText()+ btnNewButton2.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton2.setBounds(70, 254, 50, 50);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText()+ btnNewButton3.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton3.setBounds(130, 254, 50, 50);
		frame.getContentPane().add(btnNewButton3);
		
		JButton btnNewButtondivide = new JButton("/");
		btnNewButtondivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("" );
				operations = "/";
			}
		});
		btnNewButtondivide.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtondivide.setBounds(190, 254, 50, 50);
		frame.getContentPane().add(btnNewButtondivide);
		
		//------------row5---------//
		
		JButton btnNewButtonC = new JButton("C");
		btnNewButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null );
			}
		});
		btnNewButtonC.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButtonC.setBounds(10, 318, 50, 50);
		frame.getContentPane().add(btnNewButtonC);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+ btnNewButton0.getText();
				textField.setText(EnterNumber );
			}
		});
		btnNewButton0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton0.setBounds(70, 318, 50, 50);
		frame.getContentPane().add(btnNewButton0);
		
		JButton btnNewButtonequal = new JButton("=");
		btnNewButtonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String answer;
			secondnum = Double.parseDouble(textField.getText());
			if (operations == "+"){
				result = firstnum + secondnum;
				answer = String.format("%2f",result);
				textField.setText(answer);
			}
			else if (operations == "-"){
				result = firstnum - secondnum;
				answer = String.format("%2f",result);
				textField.setText(answer);
			}
			else if (operations == "*"){
				result = firstnum * secondnum;
				answer = String.format("%2f",result);
				textField.setText(answer);
			}
			else if (operations == "/"){
				result = firstnum / secondnum;
				answer = String.format("%2f",result);
				textField.setText(answer);
			}
			else if (operations == "%"){
				result = firstnum % secondnum;
				answer = String.format("%2f",result);
				textField.setText(answer);
			}
			
			
			
			
			
			
			
			
			
			
			
				
				
			}
		});
		btnNewButtonequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButtonequal.setBounds(130, 318, 110, 50);
		frame.getContentPane().add(btnNewButtonequal);
	}
}
