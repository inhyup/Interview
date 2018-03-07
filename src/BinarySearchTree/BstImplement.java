package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BstImplement {
	
	private Bst root;	
	
	public boolean isEmpty() 
	{
		return (this.root == null);
	}
	
	
	// insert method
	public void insert(Integer data)
	{
		if (root == null)
		{
			this.root = new Bst(data);
			return;
		}
		
		insertNode(this.root, data);
	}
	
	private Bst insertNode(Bst root, Integer data)
	{
		Bst tmpNode = null;
		
		if (root.getData() >= data)
		{
			if (root.getLeft() == null)
			{
				root.setLeft(new Bst(data));
				return root.getLeft();
			}
			else 
			{
				tmpNode = root.getLeft();
			}
		}
		else 
		{
			if (root.getRight() == null)
			{
				root.setRight(new Bst(data));
				return root.getRight();
			}
			else 
			{
				tmpNode = root.getRight();
			}
		}
		return insertNode(tmpNode, data);
	}
	
	
	// find minValue
	public Integer findMinValue() 
	{
		return minValue(this.root);
	}
	
	private Integer minValue(Bst node)
	{
		if (node.getLeft() != null)
		{
			return minValue(node.getLeft());
		}
		return node.getData();
	}
	
	//find maxValue
	public Integer findMaxValue()
	{
		return maxValue(this.root);
	}
	
	private Integer maxValue(Bst node)
	{
		if (node.getRight() != null)
		{
			return maxValue(node.getRight());
		}
		return node.getData();
	}
	
	//find height
	public Integer findHeight()
	{
		return getHeight(this.root);
	}
	
	private Integer getHeight(Bst node)
	{
		if (node == null)
		{
			return -1;
		}
		return Math.max((getHeight(node.getLeft())), getHeight(node.getRight())) + 1;
	}
	
	//level order traversal (breadth first)
	public void levelOrderTraversal()
	{
		Queue<Bst> discovedNodeQueue = new LinkedList<>();
		
		if (this.root == null)
		{
			System.out.println("this tree is empty");
			return;
		}
		
		discovedNodeQueue.add(this.root);
		while(!discovedNodeQueue.isEmpty())
		{
			Bst tmpNode = discovedNodeQueue.remove();
			if (tmpNode.getLeft() != null)
			{
				discovedNodeQueue.add(tmpNode.getLeft());
			}
			if (tmpNode.getRight() != null)
			{
				discovedNodeQueue.add(tmpNode.getRight());
			}
			System.out.println(tmpNode.getData());
		}
		
	}
	
	//pre-order traversal (depth first)
	public void preOrderTraversal()
	{
		doPreOrder(this.root);
	}
	
	private void doPreOrder(Bst node)
	{
		if (root == null)
		{
			return;
		}
		System.out.println(root.getData());
		doPreOrder(root.getLeft());
		doPreOrder(root.getRight());
	}
	
	//post-order traversal (depth first)
	public void postOrderTraversal()
	{
		doPostOrder(this.root);
	}
	
	private void doPostOrder(Bst node)
	{
		if (root == null)
		{
			return;
		}
		doPostOrder(root.getLeft());
		doPostOrder(root.getRight());
		System.out.println(root.getData());
	}
	
	//in-order traversal (depth first)
	public void inOrderTraversal()
	{
		doInOrder(this.root);
	}
	
	private void doInOrder(Bst node)
	{
		if (root == null)
		{
			return;
		}
		doInOrder(root.getLeft());
		System.out.println(root.getData());
		doInOrder(root.getRight());
	}
	
	//delete BST
	public void delete(Integer data)
	{
		deleteNode(this.root, data);
	}
	
	private Bst deleteNode(Bst root, Integer data)
	{
		if (root == null)
		{
			return root;
		}
		
		if (data < root.getData()) 
		{
			root.setLeft(deleteNode(root.getLeft(), data));
		}
		else if (data > root.getData())
		{
			root.setRight(deleteNode(root.getRight(), data));
		}
		else
		{
			if (root.getLeft() == null && root.getRight() == null)
			{
				return null;
			}
			else if (root.getLeft() == null)
			{
				return root.getRight();
			}
			else if (root.getRight() == null)
			{
				return root.getLeft();
			}
			else 
			{
				Integer minValue = minValue(root.getRight());
				root.setData(minValue);
				root.setRight(deleteNode(root.getRight(), minValue));
			}
		}
		return root;
	}
	
	
	
	public static void main(String args[])
	{
		BstImplement bst = new BstImplement();
		
		bst.insert(10);
        bst.insert(20);
        bst.insert(21);
        bst.insert(8);
        bst.insert(6);
        bst.insert(16);
        bst.insert(23);
        bst.insert(2);
		
		//System.out.println(bst.findMinValue());
		//System.out.println(bst.findMaxValue());
		
		//System.out.println(bst.findHeight());
		
		bst.levelOrderTraversal();
	}
}
