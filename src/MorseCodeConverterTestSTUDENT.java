import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser; 
import javax.swing.JOptionPane;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MorseCodeConverterTestSTUDENT {
	File testFile;
	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertToEnglishString() {
		String test = MorseCodeConverter.convertToEnglish(".. .-.. -.-- .- ... .-. . .... -- .- -.");
		assertEquals("ilyasrehman", test);
		test = MorseCodeConverter.convertToEnglish("-... .-.. .- .... / -... .-.. .- .... / -- -.-- / -. .- -- . / .. ... / . .-.. ..");
		assertEquals("blah blah my name is eli", test);
	}

	@Test
	public void testConvertToEnglishFile() throws FileNotFoundException {
		File testFile1 = new File("src/howDoILoveThee.txt"); 
		String file1 = MorseCodeConverter.convertToEnglish(testFile1);
		assertEquals("how do i love thee let me count the ways", file1);
		
		File testFile2 = new File("src/LoveLooksNot.txt"); 
		String file2 = MorseCodeConverter.convertToEnglish(testFile2);
		assertEquals("love looks not with the eyes but with the mind", file2);
	}
	


}
