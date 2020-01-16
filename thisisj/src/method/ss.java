package method;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append(0);
		sb.append(0);
		sb.append(0);
		sb.append(0);
		sb.append(0);
		sb.append(0);
		sb.delete(0, sb.length());
		sb.append(0);
		if(sb.equals("0")) System.out.println(sb.toString());
	}

}
