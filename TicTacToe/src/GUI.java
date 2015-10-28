import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Window.Type;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public GUI() {
		
		final Turno jugador = new Turno(0);
		
		setTitle("TIC-TAC-TOE EXTREME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 330);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 14));
		textField.setForeground(Color.CYAN);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEditable(false);
		textField.setBounds(69, 278, 114, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Accion del boton por turno
				 */
				
				
				if(jugador.getTurno() == 1){
					btnNewButton.setBackground(Color.CYAN);
					btnNewButton.setText("X");
					btnNewButton.setEnabled(false);
					jugador.setTurno(2);
				}else if (jugador.getTurno()==2){
					btnNewButton.setBackground(Color.ORANGE);
					btnNewButton.setText("O");
					btnNewButton.setEnabled(false);
					jugador.setTurno(1);
				}
				
				/*
				 * 
				 */
			}
		});
		btnNewButton.setBounds(115, 12, 91, 77);
		contentPane.add(btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_1.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Accion del boton por turno
				 */
				
				
				if(jugador.getTurno() == 1){
					btnNewButton_1.setBackground(Color.CYAN);
					btnNewButton_1.setText("X");
					btnNewButton_1.setEnabled(false);
					jugador.setTurno(2);
					
				}else if (jugador.getTurno()==2){
					btnNewButton_1.setBackground(Color.ORANGE);
					btnNewButton_1.setText("O");
					btnNewButton_1.setEnabled(false);
					jugador.setTurno(1);
				}
				
				/*
				 * 
				 */
			}
		});
		btnNewButton_1.setBounds(12, 12, 91, 77);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Accion del boton por turno
				 */
				
				
				if(jugador.getTurno() == 1){
					btnNewButton_2.setBackground(Color.CYAN);
					btnNewButton_2.setText("X");
					btnNewButton_2.setEnabled(false);
					jugador.setTurno(2);
					
				}else if (jugador.getTurno()==2){
					btnNewButton_2.setBackground(Color.ORANGE);
					btnNewButton_2.setText("O");
					btnNewButton_2.setEnabled(false);
					jugador.setTurno(1);
				}
				
				/*
				 * 
				 */
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(218, 12, 91, 77);
		contentPane.add(btnNewButton_2);
		
		final JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Accion del boton por turno
				 */
				
				
				if(jugador.getTurno() == 1){
					btnNewButton_3.setBackground(Color.CYAN);
					btnNewButton_3.setText("X");
					btnNewButton_3.setEnabled(false);
					jugador.setTurno(2);
					
				}else if (jugador.getTurno()==2){
					btnNewButton_3.setBackground(Color.ORANGE);
					btnNewButton_3.setText("O");
					btnNewButton_3.setEnabled(false);
					jugador.setTurno(1);
				}
				
				/*
				 * 
				 */
			}
		});
		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBounds(12, 101, 91, 77);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_4.setBounds(115, 103, 91, 77);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setBounds(218, 101, 91, 77);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_6.setBounds(12, 189, 91, 77);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.setBounds(115, 192, 91, 77);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 46));
		btnNewButton_8.setBounds(218, 190, 91, 77);
		contentPane.add(btnNewButton_8);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setBounds(12, 278, 70, 15);
		contentPane.add(lblTurno);
		
	}
	
	
}
