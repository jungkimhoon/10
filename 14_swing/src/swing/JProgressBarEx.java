package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class JProgressBarEx extends JFrame implements ActionListener, Runnable {
	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
	private JButton start = new JButton("시작");
	private JButton stop = new JButton("멈춤");
	
	public JProgressBarEx() {
		super("Test");
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", new JLabel("이것이 프로그레스 바"));
		con.add("Center",jpb);
		jpb.setStringPainted(true);
		jpb.setString("0%");
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(start); jp.add(stop);
		start.addActionListener(this);
		stop.addActionListener(this);
		con.add("South", jp);
		setSize(300,150); setVisible(true);
	}
	private boolean bb = true;
	private static int ii;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(ii==100) ii =0;
		for(int i = ii; i<=100; i++) {
			if(!bb) break;
			try {
				Thread.sleep(10);
				
			}catch(InterruptedException ee) {}
			jpb.setValue(i);
			ii = i;
			jpb.setString(i + "%");
		}
		start.setEnabled(true);
		stop.setEnabled(false);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == start) {
			bb = true; new Thread(this).start();
			start.setEnabled(false);
			stop.setEnabled(true);
		}
		else if(e.getSource() == stop) {
			bb = false;
			start.setEnabled(true);
			stop.setEnabled(false);
		}
	}
	public static void main(String[] args) {
		new JProgressBarEx();
	}
	
}
