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

public class MorseCodeTreeTestSTUDENT {
	MorseCodeTree tree;
	@BeforeEach
	void setUp() throws Exception {
		tree = new MorseCodeTree();
	}

	@AfterEach
	void tearDown() throws Exception {
		tree = null;
	}
	@Test
	void testAddNode() {
		tree.addNode(tree.getRoot(), "-.-", "k");
		assertEquals("k", tree.fetch("-.-"));
	}

	@Test
	void testBuildTree() {
	tree.buildTree();
		
		assertEquals("k", tree.fetch("-.-"));
		assertEquals("d", tree.fetch("-.."));
		assertEquals("s", tree.fetch("..."));
	}
	
	@Test
	void testFetch() {
		assertEquals("k", tree.fetch("-.-"));

	}

	@Test
	void testFetchNode() {
		tree.buildTree();
		assertEquals("k", tree.fetchNode(tree.getRoot(), "-.-"));

	}

	@Test
	void testGetRoot() {
		TreeNode<String> root = tree.getRoot();
		assertEquals("", root.getData());
	}

	@Test
	void testInsert() {
		 tree.insert("...", "s");
	}

	@Test
	void testLNRoutputTraversal() {
		tree.buildTree();
		ArrayList<String> list = tree.toArrayList();
		String tree = "";
		
		for(String letter : list) {
			tree += letter;
		}
		assertEquals("hsvifuelrapwjbdxnckytzgqmo", tree);
	}

	@Test
	void testSetRoot() {
		TreeNode<String> node = new TreeNode<String>("b");
		tree.setRoot(node);
		
		assertEquals("b", tree.getRoot().getData());
	}

	@Test
	void testToArrayList() {
		tree.buildTree();
		ArrayList<String> list = tree.toArrayList();
		String tree = "";
		
		for(String letter : list) {
			tree += letter;
		}
		assertEquals("hsvifuelrapwjbdxnckytzgqmo", tree);
	}

}
