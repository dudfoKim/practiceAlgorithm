package graph_20210422;

public class binaryTree 
{
	String value;
	binaryTree left, right;
	
	public binaryTree(String value)
	{
		this.value = value;
	}
	
	public binaryTree(String value, binaryTree left, binaryTree right)
	{
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public binaryTree(binaryTree input)
	{
		this.value = input.value;
		this.left = input.left;
		this.right = input.right;
	}
	
	// 전위 탐색(preOrder)
	private void preOrder()
	{
		System.out.print(this.value + " ");
		
		if(this.left!=null)
		{
			this.left.preOrder();
		}

		if(this.right!=null)
		{
			this.right.preOrder();
		}
	}
	
	// 중위 탐색(Inorder)
	private void inOrder()
	{
		if(this.left!=null)
		{
			this.left.inOrder();
		}
		
		System.out.print(this.value + " ");
		
		if(this.right!=null)
		{
			this.right.inOrder();
		}
	}
	
	// 후위 탐색(postOrder)
	private void postOrder()
	{
		if(this.left!=null)
		{
			this.left.postOrder();
		}

		if(this.right!=null)
		{
			this.right.postOrder();
		}
		
		System.out.print(this.value + " ");
		
	}
	
	public static void main(String[] args) 
	{
		// leaf node
		binaryTree tree8 = new binaryTree("8");
		binaryTree tree9 = new binaryTree("9");
		binaryTree tree10 = new binaryTree("10");
		binaryTree tree11 = new binaryTree("11");
		
		binaryTree tree12 = new binaryTree("12");
		binaryTree tree13 = new binaryTree("13");
		binaryTree tree14 = new binaryTree("14");
		binaryTree tree15 = new binaryTree("15");
		
		// leaf node를 포함한 노드 연결
		binaryTree tree4 = new binaryTree("4", tree8, tree9);
		binaryTree tree5 = new binaryTree("5", tree10, tree11);
		binaryTree tree6 = new binaryTree("6", tree12, tree13);
		binaryTree tree7 = new binaryTree("7", tree14, tree15);
		
		binaryTree tree2 = new binaryTree("2", tree4, tree5);
		binaryTree tree3 = new binaryTree("3", tree6, tree7);
		binaryTree tree = new binaryTree("1", tree2, tree3);
		
		// pre-order
		System.out.print("전위 순회 : ");
		tree.preOrder();

		// in-order
		System.out.print("\n중위 순회 : ");
		tree.inOrder();
		
		// post-order
		System.out.print("\n후위 순회 : ");
		tree.postOrder();

	}
}
