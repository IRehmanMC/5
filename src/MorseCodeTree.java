import java.util.ArrayList;

public class MorseCodeTree implements LinkedConverterTreeInterface<String> {
	private TreeNode<String> root;

	public MorseCodeTree() {
		root = null;
		buildTree();
	}
	
	public void addNode(TreeNode<String> root, String code, String letter) {
		if(code.length() > 1) {
			if(code.charAt(0) == '-') {
				addNode(root.right, code.substring(1), letter);
			}
			else {
				addNode(root.left, code.substring(1), letter);
			}
		}
		else {
			if(code.equals(".")) {
				root.left = new TreeNode<String>(letter);
			}
			else {
				root.right = new TreeNode<String>(letter);
			}
		}
		
	}
	
	public void buildTree() {
		insert("","");
		insert(".","e");
		insert("-","t");
		insert("..","i");
		insert(".-","a");
		insert("-.","n");
		insert("--","m");
		insert("...","s");
		insert("..-","u");
		insert(".-.","r");
		insert(".--","w");
		insert("-..","d");
		insert("-.-","k");
		insert("--.","g");
		insert("---","o");
		insert("....","h");
		insert("...-","v");
		insert("..-.","f");
		insert(".-..","l");
		insert(".--.","p");
		insert(".---","j");
		insert("-...","b");
		insert("-..-","x");
		insert("-.-.","c");
		insert("-.--","y");
		insert("--..","z");
		insert("--.-","q");
	}
	
	public MorseCodeTree delete(String data) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	public String fetch(String code) {
		String holder = fetchNode(root, code);
		return holder;
	}
	
	public String fetchNode(TreeNode<String> root, String code) {
		String holder = "";
		if(code.length() > 1) {
			if(code.charAt(0) == '.') {
				holder += fetchNode(root.left, code.substring(1));
			}
			else {
				holder += fetchNode(root.right, code.substring(1));
			}
		}
		else {
			if(code.equals(".")) {
				holder += root.left.getData();
				return holder;
			}
			else { 
				holder += root.right.getData();
				return holder;
			}
		}
		return holder;
	}

	public TreeNode<String> getRoot() {
		return root;
	}

	public void insert(String code, String letter) {
		if(root == null){
			root = new TreeNode<String>(letter);
		}
		else {
			addNode(root, code, letter);
		}
	}
	
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
		if(root.left == null && root.right == null) {
			list.add(root.getData());
		}
		else {
			if(root.left != null) {
				LNRoutputTraversal(root.left, list);
				list.add(root.getData());
			}
			if(root.right != null) {
				LNRoutputTraversal(root.right, list);
			}
		}
	}
	
	public void setRoot(TreeNode<String> newNode) {
		root = new TreeNode<String>(newNode);
	}

	public ArrayList<String> toArrayList() {
		ArrayList<String>list = new ArrayList<String>();
		LNRoutputTraversal(root, list);
		return list;
	}
	
	public MorseCodeTree update() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
}