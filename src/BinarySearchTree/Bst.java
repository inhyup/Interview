package BinarySearchTree;

public class Bst {

	
	private Bst left;
	private Bst right;
	private Integer data;
	
	public Bst(Integer data) 
	{
		this.data = data;
	}

	public Bst getLeft() {
		return left;
	}

	public void setLeft(Bst left) {
		this.left = left;
	}

	public Bst getRight() {
		return right;
	}

	public void setRight(Bst right) {
		this.right = right;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}
}
