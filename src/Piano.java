	import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;



public class Piano extends JFrame implements KeyListener{

	private JPanel contentPane;

	JButton btnNewButton = new JButton("");
	JButton button = new JButton("");
	JButton button_1 = new JButton("");
	JButton button_2 = new JButton("");
	JButton button_3 = new JButton("");
	JButton button_4 = new JButton("");
	JButton button_5 = new JButton("");
	JButton button_6 = new JButton("");
	JButton button_7 = new JButton("");
	JButton button_8 = new JButton("");
	JButton button_9 = new JButton("");
	JButton button_10 = new JButton("");
	JButton button_11 = new JButton("");
	JButton button_12 = new JButton("");
	JComboBox comboBox = new JComboBox();
	JTextArea textArea = new JTextArea();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	/*	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piano frame = new Piano();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
		new Piano();
	}

	/**
	 * Create the frame.
	 */
	public Piano() {
		addKeyListener(this);
		setBackground(Color.BLACK);
		setUndecorated(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);

		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.addKeyListener(this);
		setFocusable(true);
		JLabel lblPianoForBeginners = new JLabel("Piano For Beginners");
		lblPianoForBeginners.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblPianoForBeginners.setForeground(Color.WHITE);
		lblPianoForBeginners.setBounds(477, 27, 474, 125);
		
		contentPane.add(lblPianoForBeginners);
	//	contentPane.setFocusable(true);
		JLabel lblLearnSongs = new JLabel("Learn Songs");
		lblLearnSongs.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblLearnSongs.setForeground(Color.WHITE);
		lblLearnSongs.setBounds(29, 173, 164, 52);
		contentPane.add(lblLearnSongs);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				setting();
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		comboBox.setBounds(215, 186, 284, 30);
		
		comboBox.addItem(new String("Jingle Bells"));
		comboBox.addItem(new String("Happy Birthday"));
		comboBox.addItem(new String("Call Me Maybe"));
		comboBox.addItem(new String("Pirates of Caribbean"));
		
		contentPane.add(comboBox);
		
		
	
		
		btnNewButton.setEnabled(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(551, 195, 31, 305);
		contentPane.add(btnNewButton);
		
		
		button.setEnabled(false);
		button.setForeground(Color.WHITE);
		button.setBounds(572, 375, 46, 125);
		contentPane.add(button);
		
		
		button_1.setEnabled(false);
		button_1.setForeground(Color.WHITE);
		button_1.setBounds(628, 195, 31, 305);
		contentPane.add(button_1);
		
		
		button_2.setEnabled(false);
		button_2.setForeground(Color.WHITE);
		button_2.setBounds(649, 375, 46, 125);
		contentPane.add(button_2);
		
		
		button_3.setEnabled(false);
		button_3.setForeground(Color.WHITE);
		button_3.setBounds(705, 195, 31, 305);
		contentPane.add(button_3);
		
		
		button_4.setEnabled(false);
		button_4.setForeground(Color.WHITE);
		button_4.setBounds(726, 375, 46, 125);
		contentPane.add(button_4);
		
		
		button_5.setEnabled(false);
		button_5.setForeground(Color.WHITE);
		button_5.setBounds(782, 195, 31, 305);
		contentPane.add(button_5);
		
		
		button_6.setEnabled(false);
		button_6.setForeground(Color.WHITE);
		button_6.setBounds(803, 375, 46, 125);
		contentPane.add(button_6);
		
		
		button_7.setEnabled(false);
		button_7.setForeground(Color.WHITE);
		button_7.setBounds(859, 195, 31, 305);
		contentPane.add(button_7);
		
		
		button_8.setEnabled(false);
		button_8.setForeground(Color.WHITE);
		button_8.setBounds(880, 375, 46, 125);
		contentPane.add(button_8);
		
		
		button_9.setEnabled(false);
		button_9.setForeground(Color.WHITE);
		button_9.setBounds(936, 195, 31, 305);
		contentPane.add(button_9);
		
		
		button_10.setEnabled(false);
		button_10.setForeground(Color.WHITE);
		button_10.setBounds(957, 375, 46, 125);
		contentPane.add(button_10);
		
		
		button_11.setEnabled(false);
		button_11.setForeground(Color.WHITE);
		button_11.setBounds(1013, 195, 31, 305);
		contentPane.add(button_11);
		
		
		button_12.setEnabled(false);
		button_12.setForeground(Color.WHITE);
		button_12.setBounds(1034, 375, 46, 125);
		contentPane.add(button_12);
		
		
		
		
		
		JTextArea txtrThankYouFor = new JTextArea();
		txtrThankYouFor.setEditable(false);
		txtrThankYouFor.setFont(new Font("Monospaced", Font.PLAIN, 26));
		txtrThankYouFor.setBackground(Color.BLACK);
		txtrThankYouFor.setForeground(Color.WHITE);
		txtrThankYouFor.setText("Thank You For Using\r\n H-00ona Piano");
		txtrThankYouFor.setBounds(829, 612, 308, 82);
		contentPane.add(txtrThankYouFor);
		
		JButton btnNewButton_1 = new JButton("Quit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(1179, 628, 165, 45);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("C");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 56));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(561, 511, 57, 52);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("D");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 56));
		label.setBounds(638, 511, 57, 52);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("E");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 56));
		label_1.setBounds(715, 511, 57, 52);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("F");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 56));
		label_2.setBounds(792, 511, 57, 52);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("G");
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 56));
		label_3.setBounds(869, 511, 57, 52);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("A");
		label_4.setForeground(Color.BLUE);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 56));
		label_4.setBounds(946, 511, 57, 52);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("B");
		label_5.setForeground(Color.BLUE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 56));
		label_5.setBounds(1023, 511, 57, 52);
		contentPane.add(label_5);
		

		
		btnNewButton.setBorder(null);
		button.setBorder(null);
		button_1.setBorder(null);
		button_2.setBorder(null);
		button_3.setBorder(null);
		button_4.setBorder(null);
		button_5.setBorder(null);
		button_6.setBorder(null);
		button_7.setBorder(null);
		button_8.setBorder(null);
		button_9.setBorder(null);
		button_10.setBorder(null);
		button_11.setBorder(null);
		button_12.setBorder(null);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
		
		
		textArea.setEditable(false);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(29, 255, 394, 439);
		contentPane.add(textArea);
		contentPane.setFocusable(true);
		requestFocus();
		setting();
		
	}
	
	public void setting(){
		if(comboBox.getSelectedItem().toString().equals("Jingle Bells")){
			textArea.setText("E E E - E E E - E G C D E - - -"+"\n"+
					"F F F E E E"+"\n"+
					"E D D E D - G -"+"\n"+
					"E E E - E E E - E G C D E - - -"+"\n"+
					"F F F E E E"+"\n"+
					"G G F D C"+"\n"+
					"G G F D C"+"\n"+
					"G G F D C"+"\n"+
					"G G F D C");
		}
		
		else if(comboBox.getSelectedItem().toString().equals("Happy Birthday")){
			textArea.setText("A A B A D C"+"\n"+
"A A B A E D"+"\n"+
"A A A F D C B"+"\n"+
"G G F D E D"+"\n"+
"A A B A D C"+"\n"+
"A A B A E D"+"\n"+
"A A A F D C B"+"\n"+
"G G F D E D");
		}
		else if(comboBox.getSelectedItem().toString().equals("Call Me Maybe")){
			textArea.setText("G B D G D"+"\n"+
					"B B D B G"+"\n"+			
					"G B C B G" +"\n"+
					"G B A A G");
		}
		
		
		else if(comboBox.getSelectedItem().toString().equals("Pirates of Caribbean")){
			textArea.setText("a c d d" +"\n"+
					"d e f f"+"\n"+
					"f g e e"+"\n"+
					"d c c d"+"\n"+
					"a c d d"+"\n"+
					"d e f f"+"\n"+
					"f g e e"+"\n"+
					"d c c d"+"\n"+
					"a c d d"+"\n"+
					"d f g g"+"\n"+
					"a g a d"+"\n"+
					"d e f f"+"\n"+
					"g a d"+"\n"+
					"d f e e"+"\n"+
					"f d e");
		}
		
		
		repaint();
		revalidate();
		contentPane.repaint();
		contentPane.revalidate();
		requestFocus();
		setFocusable(true);
		contentPane.setFocusable(true);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_C){
			try {
			    File yourFile=new File("C.wav");;
			    AudioInputStream stream;
			    AudioFormat format;
			    DataLine.Info info;
			    Clip clip;

			    stream = AudioSystem.getAudioInputStream(yourFile);
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format);
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    clip.start();
			    
			    
			    btnNewButton.setBackground(Color.RED);
			    button.setBackground(Color.RED);
			    
			    wait(btnNewButton,button);
			    
			}
			catch (Exception e2) {
			    
			}
		}
		
		else if(e.getKeyCode()==KeyEvent.VK_D){
			try {
			    File yourFile=new File("D.wav");;
			    AudioInputStream stream;
			    AudioFormat format;
			    DataLine.Info info;
			    Clip clip;

			    stream = AudioSystem.getAudioInputStream(yourFile);
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format);
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    clip.start();
			    
			    button_1.setBackground(Color.RED);
			    button_2.setBackground(Color.RED);
			    
			    wait(button_1,button_2);
			}
			catch (Exception e2) {
			    
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_E){
			try {
			    File yourFile=new File("E.wav");;
			    AudioInputStream stream;
			    AudioFormat format;
			    DataLine.Info info;
			    Clip clip;

			    stream = AudioSystem.getAudioInputStream(yourFile);
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format);
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    clip.start();
			    
			    button_3.setBackground(Color.RED);
			    button_4.setBackground(Color.RED);
			    
			    wait(button_3,button_4);
			}
			catch (Exception e2) {
			    
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_F){
			try {
			    File yourFile=new File("F.wav");;
			    AudioInputStream stream;
			    AudioFormat format;
			    DataLine.Info info;
			    Clip clip;

			    stream = AudioSystem.getAudioInputStream(yourFile);
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format);
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    clip.start();
			    
			    button_5.setBackground(Color.RED);
			    button_6.setBackground(Color.RED);
			    
			    wait(button_5,button_6);
			}
			catch (Exception e2) {
			    
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_G){
			try {
			    File yourFile=new File("G.wav");;
			    AudioInputStream stream;
			    AudioFormat format;
			    DataLine.Info info;
			    Clip clip;

			    stream = AudioSystem.getAudioInputStream(yourFile);
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format);
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    clip.start();
			    button_7.setBackground(Color.RED);
			    button_8.setBackground(Color.RED);
			    
			    wait(button_7,button_8);
			}
			catch (Exception e2) {
			    
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_A){
			try {
			    File yourFile=new File("A.wav");;
			    AudioInputStream stream;
			    AudioFormat format;
			    DataLine.Info info;
			    Clip clip;

			    stream = AudioSystem.getAudioInputStream(yourFile);
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format);
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    clip.start();
			    button_9.setBackground(Color.RED);
			    button_10.setBackground(Color.RED);
			    
			    wait(button_9,button_10);
			}
			catch (Exception e2) {
			    
			}
		}
		else if(e.getKeyCode()==KeyEvent.VK_B){
			try {
			    File yourFile=new File("B.wav");;
			    AudioInputStream stream;
			    AudioFormat format;
			    DataLine.Info info;
			    Clip clip;

			    stream = AudioSystem.getAudioInputStream(yourFile);
			    format = stream.getFormat();
			    info = new DataLine.Info(Clip.class, format);
			    clip = (Clip) AudioSystem.getLine(info);
			    clip.open(stream);
			    clip.start();
			    button_11.setBackground(Color.RED);
			    button_12.setBackground(Color.RED);
			    
			    wait(button_11,button_12);
			}
			catch (Exception e2) {
			    
			}
		}
		
		else if(e.getKeyCode()==KeyEvent.VK_N){
			System.exit(0);
		}
		else if(e.getKeyCode()==KeyEvent.VK_U){
			
			int old=comboBox.getSelectedIndex();
			int newnum=old+1;
			int max=comboBox.getItemCount();
			
			if(old==max-1)comboBox.setSelectedIndex(0);
			else comboBox.setSelectedIndex(newnum);
			
			/*if(comboBox.getSelectedIndex()==comboBox.getSelectedObjects().length-1){
				comboBox.setSelectedIndex(0);
		
		}
			else comboBox.setSelectedIndex(comboBox.getSelectedIndex()+1);*/
			//comboBox.setSelectedIndex(1);
		
	}
		
	else if(e.getKeyCode()==KeyEvent.VK_V){
		int old=comboBox.getSelectedIndex();
		int newnum=old-1;
		int max=comboBox.getItemCount();
		
		if(old==0)comboBox.setSelectedIndex(max-1);
		else comboBox.setSelectedIndex(newnum);
		
			
	}
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void wait(JButton b,JButton s){
		new java.util.Timer().schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	 b.setBackground(Color.WHITE);
		 			    s.setBackground(Color.WHITE);
		 			    
		            }
		        }, 
		        100
		);
	}
}
