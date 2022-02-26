package functions;

import java.io.File;

public class FilesList {

	private static Directory Filedirectory = new Directory();
	
	public static void printfiles() {
		
		Filedirectory.fillFiles();
	
		int num = 1;	
		
		for (File f : FilesList.getFileDirectory().getFiles() ) 
		{
			System.out.println("\t"+num+"."+f.getName());
			++num;
		}
		
	}
	
    public static Directory getFileDirectory() {
        return Filedirectory;
    }
    
    public static void setFileDirectory(Directory Filedirectory) {
		FilesList.Filedirectory = Filedirectory;
    	
    }
    
}
