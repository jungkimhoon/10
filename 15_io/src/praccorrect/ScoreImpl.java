package praccorrect;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ScoreImpl implements Score {
	private ArrayList<ScoreDTO> list; 
	
	public ScoreImpl() {
		list = new ArrayList<ScoreDTO>();
	}

	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
		System.out.println("list 크기 = "+list.size());

	}

	@Override
	public void print(JTextArea output) {
		output.setText("");
		
		for(ScoreDTO dto : list) {
			output.append(dto.toString()+"\n");
		}
	}

	@Override
	public void search(JTextArea output) {
		String hak = JOptionPane.showInputDialog(null,"학번을 입력해라.");		
		if(hak == null || hak.equals("")) return;
		
		
		int sw = 0;
		for(ScoreDTO dto : list) {
			if(hak.equals(dto.getHak())) {
				if(sw==0) output.setText("");
				output.append(dto.toString()+"\n");
				sw = 1;
			}
		}
		if(sw == 0)
			JOptionPane.showMessageDialog(null, "학생 없음");
	}

	@Override
	public void tot_desc() {
		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {
			public int compare(ScoreDTO dto1, ScoreDTO dto2) {
				return dto1.getTot() < dto2.getTot() ? 1 : -1;
			}
		};
	}

		

	@Override
	public void save() {
		//저장 다이얼로그
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null); //showsavedialog
		File file = null;
		
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//선택한 경로와 저장할 파일명		
		}
		
		if(file == null) return; //경로가 null 이면 나가
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		
			for(ScoreDTO dto : list) {
				oos.writeObject(dto);
			}
			
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void load() {
		
		JFileChooser chooser = new JFileChooser();
		File file = null;
		
		int result = chooser.showOpenDialog(null); //showsavedialog
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();//선택한 경로와 파일명
		}
		
		if(file == null) return;
		
		list.clear();
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			while(true) {
				try {
					ScoreDTO dto = (ScoreDTO)ois.readObject();
					list.add(dto);
				}catch(EOFException e) {
					break;
				}				
			}			
			ois.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
