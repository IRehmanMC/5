import java.util.ArrayList;
import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException;

public class MorseCodeConverter {
	private static MorseCodeTree tree = new MorseCodeTree();
	
	public static String convertToEnglish(File codeFile) throws FileNotFoundException {
		Scanner inFile = new Scanner(codeFile);
		String out = "";
		
		while(inFile.hasNext()) {
			out += convertToEnglish(inFile.nextLine());
		}
		inFile.close();
		return out;
	}
	
	public static String convertToEnglish(String morseCode) {
		String[] wCode;
		String[] lCode;
		String out = "";
		wCode = morseCode.split("/");
		
		for(int i = 0; i < wCode.length; i++) {
			wCode[i] = wCode[i].trim();
			lCode = wCode[i].split(" ");
			for(int j = 0; j < lCode.length; j++) {
				out += tree.fetch(lCode[j]);
			}
			out += " ";
		}
		out = out.trim();
		return out;
	}

	public static String printTree() {
		tree = new MorseCodeTree();
		String out = "";
		for (String letter : tree.toArrayList())
		{
			out += letter + " ";
		}
		return out.substring(0, out.length() - 1);
	}
}
