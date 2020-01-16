package thread;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class RunRace extends Frame implements ActionListener {
	private int count;
	private String[] name;
	private Button btn;
	private Racer[] racer;
	private int rank;
	
	public RunRace() {
		
	}
	
	public RunRace(int count, String[] name) {
		this.count = count;
		this.name = name;
		
		setTitle("경주");
		setBounds(300,300,800,500);
		setVisible(true);
		setResizable(false);
		
		btn = new Button("출발");
		Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p.add(btn);
		
		Panel p2 = new Panel(new GridLayout(count,1));
		racer = new Racer[count];
		for(int i=0; i<count; i++) {
			racer[i] = new Racer(); //Canvas
			racer[i].setName(name[i]);
			p2.add(racer[i]);
		
//			if(racer[i].x >= 790) System.out.println(rank++);
		}
		
		add("South",p);
		add("Center",p2);
		
	
		
		//btn.setBounds(530, 450, 50, 30);
		//add(btn);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Thread[] t = new Thread[count];
		for(int i=0; i<count; i++) {
			t[i] = new Thread(racer[i]);
			t[i].setPriority((int)Math.random()*10+1);
			t[i].setName(name[i]);
			t[i].start();
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("경주마 수를 입력 : ");
		int count = sc.nextInt();
		String[] name = new String[count];
		for(int i=0; i<count; i++) {
			System.out.print("말 이름 입력 : ");
			name[i] = sc.next();
		}
		
		new RunRace(count, name);	
	}
}
