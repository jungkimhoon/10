package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println("NAVER IP = " +naver.getHostAddress());
		System.out.println();
		
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("LOCAL HOST IP = "+local.getHostAddress());
		
		InetAddress[] daum = InetAddress.getAllByName("www.daum.net");

		for(InetAddress data : daum) {
			System.out.println("DaumIP = "+data.getHostAddress());
		}
		
				
				
		
	}

}
