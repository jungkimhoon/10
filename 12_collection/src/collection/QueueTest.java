package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueTest {

	public static void main(String[] args) {
		String[] item = {"소나타","렉스톤","제규어"};
		LinkedList<String> q =new LinkedList<String>();
		
		for(String n : item)
			q.offer(n);
		
		out.println("q의 크기 : "+q.size()+"\n");
		String data="";
		
		while( (data = q.poll()) != null ){ //q안의 데이터를 집어 넣음 q.poll
			out.println(data+" 삭제!");
			out.println("q의 크기 : "+q.size()+"\n");
		}//while

	}

}
