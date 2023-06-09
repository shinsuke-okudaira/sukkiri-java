package suukiri_java_15;

public class Ex_15_2 {

	public String concatPath(String folder, String file) {
		
		if(!folder.endsWith("\\")) {
			
			folder += "\\";
					
		}
		
		return folder + file;
		
	}
	
	

}
