package swing;


//처음 실행하면 버튼만 보인다
//시작 버튼을 누르면 숫자가 올라간다(1~20)
//20까지 가면 자동으로 멈춘다
//중간에 멈추면 다시 1부터 시작한다.

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Timer extends JFrame implements ActionListener, Runnable {
	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 20);
	private JButton start = new JButton("시작");
	private JButton stop = new JButton("멈춤");
	
	public Timer() {
		super("Test");
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
	
		con.add("Center",jpb);
		jpb.setStringPainted(true);
		jpb.setString("0");
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp.add(start); jp.add(stop);
		start.addActionListener(this);
		stop.addActionListener(this);
		con.add("South", jp);
		setBounds(500,500,300,150); setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	private boolean bb = true;
	private static int ii;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(ii==20) ii=0;
		for(int i = ii; i<=20; i++) {
			if(!bb) break;
			try {
				Thread.sleep(400);
				
			}catch(InterruptedException ee) {}
			jpb.setValue(i);
			ii = i;
			jpb.setString(i+"");
		}
		start.setEnabled(true);
		stop.setEnabled(false);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == start) {
			bb = true; 
			new Thread(this).start();
			start.setEnabled(false);
			stop.setEnabled(true);
		}
		else if(e.getSource() == stop) {
			bb = false;
			start.setEnabled(true);
			stop.setEnabled(false);
			ii = 0;
		}
	}
	public static void main(String[] args) {
		new Timer();
	}
	
}

