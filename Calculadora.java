package pacote;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;

public class MeuForm {

	private JFrame frmOi;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeuForm window = new MeuForm();
					window.frmOi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	
	public MeuForm() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	
	Double valor1, valor2;
	String sinal;
	
	
	private void initialize() {
		frmOi = new JFrame();
		frmOi.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\plstech\\Downloads\\calculator.png"));
		frmOi.setTitle("Calculadora");
		frmOi.setForeground(Color.BLACK);
		frmOi.getContentPane().setBackground(SystemColor.activeCaption);
		frmOi.getContentPane().setForeground(Color.DARK_GRAY);
		frmOi.setBounds(100, 100, 334, 324);
		frmOi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "1");
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1_1.setBackground(SystemColor.text);
		
		JButton btnNewButton_1_1_1 = new JButton("2");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "2");
			}
		});
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setBackground(SystemColor.text);
		btnNewButton_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_2 = new JButton("3");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "3");
			}
		});
		btnNewButton_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2.setBackground(SystemColor.text);
		btnNewButton_1_1_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_3 = new JButton("4");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "4");
			}
		});
		btnNewButton_1_1_3.setForeground(Color.BLACK);
		btnNewButton_1_1_3.setBackground(SystemColor.text);
		btnNewButton_1_1_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_4 = new JButton("6");
		btnNewButton_1_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "6");
			}
		});
		btnNewButton_1_1_4.setForeground(Color.BLACK);
		btnNewButton_1_1_4.setBackground(SystemColor.text);
		btnNewButton_1_1_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_5 = new JButton("7");
		btnNewButton_1_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "7");
			}
		});
		btnNewButton_1_1_5.setForeground(Color.BLACK);
		btnNewButton_1_1_5.setBackground(SystemColor.text);
		btnNewButton_1_1_5.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_6 = new JButton("5");
		btnNewButton_1_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "5");
			}
		});
		btnNewButton_1_1_6.setForeground(Color.BLACK);
		btnNewButton_1_1_6.setBackground(SystemColor.text);
		btnNewButton_1_1_6.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_7 = new JButton("9");
		btnNewButton_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "9");
			}
		});
		btnNewButton_1_1_7.setForeground(Color.BLACK);
		btnNewButton_1_1_7.setBackground(SystemColor.text);
		btnNewButton_1_1_7.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_8 = new JButton("8");
		btnNewButton_1_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "8");
			}
		});
		btnNewButton_1_1_8.setForeground(Color.BLACK);
		btnNewButton_1_1_8.setBackground(SystemColor.text);
		btnNewButton_1_1_8.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_2_1 = new JButton("+");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "soma";
			}
		});
		btnNewButton_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1.setBackground(SystemColor.text);
		btnNewButton_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		JButton btnNewButton_1_1_2_2 = new JButton("-");
		btnNewButton_1_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "sub";
				
			}
		});
		btnNewButton_1_1_2_2.setForeground(Color.BLACK);
		btnNewButton_1_1_2_2.setBackground(SystemColor.text);
		btnNewButton_1_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		JButton btnNewButton_1_1_2_3 = new JButton("x");
		btnNewButton_1_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "multi";
			}
		});
		btnNewButton_1_1_2_3.setForeground(Color.BLACK);
		btnNewButton_1_1_2_3.setBackground(SystemColor.text);
		btnNewButton_1_1_2_3.setFont(new Font("Arial Black", Font.PLAIN, 12));
		
		JButton btnNewButton_1_1_2_4 = new JButton("/");
		btnNewButton_1_1_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "div";
			}
		});
		btnNewButton_1_1_2_4.setForeground(Color.BLACK);
		btnNewButton_1_1_2_4.setBackground(SystemColor.text);
		btnNewButton_1_1_2_4.setFont(new Font("Arial Black", Font.BOLD, 12));
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		
		JButton btnNewButton_1_1_2_4_1 = new JButton("Apagar");
		btnNewButton_1_1_2_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");

			}
		});
		btnNewButton_1_1_2_4_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_4_1.setBackground(SystemColor.text);
		btnNewButton_1_1_2_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JButton btnNewButton_1_1_9 = new JButton("0");
		btnNewButton_1_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText() + "0");
			}
		});
		btnNewButton_1_1_9.setForeground(Color.BLACK);
		btnNewButton_1_1_9.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton_1_1_9.setBackground(Color.WHITE);
		
		JButton btnNewButton_1_1_2_1_1 = new JButton("=");
		btnNewButton_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtResultado.getText());
				if (sinal == "soma") {
					txtResultado.setText(String.valueOf(valor1+valor2));
				}
				else if(sinal == "sub") {
					txtResultado.setText(String.valueOf(valor1-valor2));
				}
				else if(sinal == "multi") {
					txtResultado.setText(String.valueOf(valor1*valor2));
				}
				else if(sinal == "div") {
					txtResultado.setText(String.valueOf(valor1/valor2));
				}
			}
		});
		btnNewButton_1_1_2_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_1_1_2_1_1.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frmOi.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addComponent(btnNewButton_1_1_7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_1_1_2_4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_1_1_2_3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_1_1_2_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnNewButton_1_1_9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnNewButton_1_1_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_1_1_3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnNewButton_1_1_4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnNewButton_1_1_5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(btnNewButton_1_1_8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(btnNewButton_1_1_1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnNewButton_1_1_6, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnNewButton_1_1_2_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNewButton_1_1_2_1, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
								.addGap(15)))
						.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_2_4_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1_1_2_4_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1_1_7, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_2_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_2_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_2_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1_1_4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_5, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_8, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1_1_2_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_1_1_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1_3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1_6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_1_1_9, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1_1_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnNewButton_1_1_2_1_1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		frmOi.getContentPane().setLayout(groupLayout);
	}
}
