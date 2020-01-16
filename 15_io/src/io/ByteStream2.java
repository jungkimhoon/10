package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) throws IOException{
		File file = new File("data.txt");
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		
		int size = (int)file.length(); // ���� ũ�� //file�� long�� , �迭�� long���� ����´�.
		byte[] ar = new byte[size]; 
		
		bis.read(ar, 0, size);
		System.out.println(ar);
		
		System.out.println(new String(ar)); // new String���� ���

		bis.close();
	}
}