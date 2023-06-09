package suukiri_java_15;

public class Ex_15_1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 10; i++){
			
			sb.append(i + 1).append(",");
			
		}
		
		String s = sb.toString();
		
		String[] a = s.split("[,]");
			
		
		
	}
}
