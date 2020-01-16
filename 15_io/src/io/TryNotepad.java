package io;
//종료 다이얼로그가 뜬다. (반드시 JFRAME위에 뜬다)
//다이얼로그에서 취소를 누르면 JFRAME 창 그대로 떠있는다.
//예를 누르면 저장 후 나간다.
import java.awt.Container;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class TryNotepad extends JFrame implements ActionListener{
	
	private JTextArea area;
	private JScrollPane scroll;
	private MenuPane menu;
	private File file;
	private KeyStroke ks;
	
	public TryNotepad() {
		area = new JTextArea();
		scroll = new JScrollPane(area);
		area.setFont(new Font("궁서체",Font.BOLD, 15));
		
		menu = new MenuPane();
		this.setJMenuBar(menu);
		
		Container c = this.getContentPane();
		c.add(scroll);
		
		
		setTitle("간단 메모장");
		setBounds(300,300,700,500);
		setVisible(true);
		
//		area.addKeyListener(this);

	}
	
	public void event() {
		menu.getNewM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		menu.getEndM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
//				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				int confirm = JOptionPane.showConfirmDialog(TryNotepad.this,"저장할꺼?","종료",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(confirm == JOptionPane.YES_OPTION) {
				//파일 저장 후 종료
				if(area.getText().length()!=0) {
					saveDialog();
					fileWrite();
				}
							
					System.exit(0);
				
				}else if(confirm == JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == menu.getNewM()) {
			area.setText("");
		}else if(e.getSource() == menu.getCutM()) {
			area.cut();
		}else if(e.getSource() == menu.getCopyM()) {
			area.copy();
		}else if(e.getSource() == menu.getPasteM()) {
			area.paste();
		}else if(e.getSource() == menu.getSaveM()) {
			
			saveDialog();
			fileWrite();
		
		}else if(e.getSource() == menu.getEndM()) {
//			System.exit(0);
			int result = JOptionPane.showConfirmDialog(this,
										"저장할꺼냐?",
										"메모장", 
										JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(result == JOptionPane.YES_OPTION) {
				//파일 저장 후 종료
				if(area.getText().length()!=0) {
					saveDialog();
					fileWrite();
				}
							
				System.exit(0);
				
			}else if(result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
			//endM ==========================================
			
		}else if(e.getSource() == menu.getOpenM()) {
			openDialog();//열기 다이얼로그
			fileRead();//파일 읽기
		}
	}
	
	private void fileWrite() {		
		try {
			if(file == null) return;
			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			String str = area.getText();
			br.write(str);
		    br.close();
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	private void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this); //showsavedialog
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//선택한 경로와 저장할 파일명		
		}else {
			
		}
		JOptionPane.showMessageDialog(this, file);
	}

	public void openDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this); //showsavedialog
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//선택한 경로와 파일명
		}else {
			
		}
			
		JOptionPane.showMessageDialog(this, file);
	}
	
	public void fileRead() {
		if(file == null) return;
		area.setText("");
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			
			while( (line = br.readLine() ) != null) {
				area.append(line+"\n");
			}//while
			
			br.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new TryNotepad().event();
	}

//	@Override
//	public void keyPressed(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		KeyStroke ks = KeyStroke.getKeyStroke(e.getKeyChar(), 
//				e.getModifiers());
//		KeyStroke ks1 = KeyStroke.getKeyStroke('x', InputEvent.ALT_MASK);
//		if(ks.equals(ks1)) {
//			area.cut();
//		}
//		KeyStroke ks2 = KeyStroke.getKeyStroke('c', InputEvent.ALT_MASK);
//		if(ks.equals(ks2)) {
//			area.copy();
//		}
//		KeyStroke ks3 = KeyStroke.getKeyStroke('v', InputEvent.ALT_MASK);
//		if(ks.equals(ks3)) {
//			area.paste();
//		}
//	}

}
