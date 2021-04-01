package DS;

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
	
	// 중위 탐색(Inorder)
	private void inOrder()
	{
		if(this.left!=null)
		{
			System.out.print("(");
			this.left.inOrder();
			System.out.print(") ,");
		}
		if(this.value!=null)
		{
			System.out.print(this.value);
		}
		if(this.right!=null)
		{
			System.out.print(", (");
			this.right.inOrder();
			System.out.print(")");
		}
	}
	
	// String형 값 노드 갯수 찾기
	private int count(String input)
	{
		int result = 0;
		
		if(this.value.equals(input))
		{
			result++;
		}
		if(this.left!=null)
		{
			result += this.left.count(input);
		}
		if(this.right!=null)
		{
			result += this.right.count(input);
		}
		
		return result;
	}
	
	// 트리 꽉 차있는 지 검사
	private int isFull()
	{
		int left = 0;
		int right = 0;
		
		if(this==null)
		{
			return 0;
		}
		if(this.isLeaf())
		{
			left++;
			right++;
		}
		if(this.left!=null)
		{
			left += this.left.isFull();
		}
		if(this.right!=null)
		{
			right += this.right.isFull();
		}
		
		return Math.max(left, right);
	}
	
	// leaf노드 개수
	private int numLeaves()
	{
		int result = 0;
		
		if(this.isLeaf())
		{
			result += 1;
		}
		if(this.left!=null)
		{
			result += this.left.numLeaves();
		}
		if(this.right!=null)
		{
			result += this.right.numLeaves();
		}		
		
		return result;
	}
	
	// 트리의 높이
	private int height()
	{
		int left = 0;
		int right = 0;
		
		if(this.isLeaf())
		{
			left = 1;
			right = 1;
		}
		if(this.left!=null)
		{
			left += 1 + this.left.height();
		}
		if(this.right!=null)
		{
			right += 1 + this.right.height();
		}
		
		return Math.max(left, right);
	}
	
	// 트리의 노드 개수
	private int size()
	{
		int result = 0;
		
		if(this==null)
		{
			result = 0;
		}
		if(this.isLeaf())
		{
			result = 1;
		}
		if(this.left!=null)
		{
			result += this.left.size();
		}
		if(this.right!=null)
		{
			result += this.right.size();
		}
		
		return result;
	}
	
	// leaf노드 여부
	private boolean isLeaf()
	{
		return (this.left==null && this.right==null)?true:false;
	}
	
	public static void main(String[] args) 
	{
		binaryTree treeA2 = new binaryTree("A");
		binaryTree treeE = new binaryTree("E");
		binaryTree treeD = new binaryTree("D");
		binaryTree treeC = new binaryTree("C", treeD, treeE);
		binaryTree treeB = new binaryTree("B", treeA2, null);
		binaryTree treeA = new binaryTree("A", treeB, treeC);
		
		
		System.out.print("Print node value by InOrder\n(");
		treeA.inOrder();
		System.out.print(")\n\n");
		
		System.out.println("count(A) : " + treeA.count("A"));
		System.out.print("isFull : ");
		System.out.println(treeA.isFull()==0?"True":"False");
		System.out.println("size : " + treeA.size());
		System.out.println("height : " + treeA.height());
		System.out.println("numLeaves : " + treeA.numLeaves());
		System.out.println("isFull : " + treeA.isFull());
	}
}