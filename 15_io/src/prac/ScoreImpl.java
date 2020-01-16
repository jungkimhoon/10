package prac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;



public class ScoreImpl implements Score {
	private ScoreForm sf;
	private ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>();
	private File file;
	private JTextArea output;
	
	public ScoreImpl(ScoreForm sf){
		
		this.sf = sf;
	}
	
	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
	}

	@Override
	public void print(JTextArea output) {
		this.output = output;
		output.setText("학번              이름    국어  영어  수학  총합   평균\n");
		for(ScoreDTO tt : list) {
			tt.calc();
			output.append(tt.getHak()+"   "+tt.getName()+"  "+tt.getKor()+"   "+
					tt.getEng()+"   "+tt.getMath()+"   "+tt.getTot()+"   "+tt.getAvg()+"\n");	
		}
		
	}

	@Override
	public void search(JTextArea output) {
		
		String id = JOptionPane.showInputDialog("학번 입력해라");
		for(ScoreDTO tt : list) {
			tt.calc();
			if(tt.getHak().equals(id)){
			output.setText("학번            이름    국어  영어  수학  총합  평균\n"+tt.getHak()+"   "+tt.getName()+"  "+tt.getKor()+"  "+
					tt.getEng()+"  "+tt.getMath()+tt.getTot()+tt.getAvg()+"\n");	
			}
		}
	}

	@Override
	public void tot_desc() {
		Collections.sort(list);
	}
	
	@Override
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(sf); //showsavedialog
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//선택한 경로와 저장할 파일명
		}
		try {
			if(file == null) return;
			ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(file));
			//BufferedWriter br = new BufferedWriter(new FileWriter(file));
			for(ScoreDTO tt : list) {
			String str = "학번            이름    국어  영어  수학  총합  평균\n"+tt.getHak()+"   "+tt.getName()+"  "+tt.getKor()+"  "+
					tt.getEng()+"  "+tt.getMath()+tt.getTot()+tt.getAvg();
			ois.writeObject(str);
			}
			
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public void load() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(sf); //
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//선택한 경로와 파일명
		}
		if(file == null) return;
		sf.getScore().setText("");
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			ScoreDTO dto = new ScoreDTO();
			
			while( (dto = (ScoreDTO)ois.readLine()) != null)
			
			
			}
				
		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}	
		
	}
	
	
	

}
