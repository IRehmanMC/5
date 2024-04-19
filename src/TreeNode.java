
public class TreeNode<T> {
	private T data;
	public TreeNode<T> left;
	public TreeNode<T> right;
	
	public TreeNode(T dataNode) {
		data = dataNode;
		left = null;
		right = null;
	}
	
	public TreeNode(TreeNode<T> node) {
		data = node.getData();
		left = node.left;
		right = node.right;
	}

	public T getData() {
		return data;
	}
}