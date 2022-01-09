class Node{

	public int data;
	public Node left,right;

	public Node (int data){
		this(data, null, null);
	}

	public Node(int data, Node left, Node right){

		this.data = data;
		this.left = left;
		this.right = right;
	}		
}
class BTree {
	private Node root;

	public BTree() {
		root = null;
	}


	public void add(int key) {
		Node current = root, parent = null;
		while (current != null) {
			if (key<current.data) {
				parent = current;
				current = current.left;
			}

			else{
				parent = current;
				current = current.right;
			}
		}

		if (parent == null)
			root = new Node(key);

		else {
			if (key<parent.data)
				parent.left = new Node(key);

			else
				parent.right = new Node(key);
		}
	}

	public boolean delete(int key) {
        if (root == null)
               return false;
        Node current = root;
        Node parent = root;
        boolean right = true;
        // searching for the node to be deleted
        while ((key != current.data)) {
               if (key<current.data) {
               			right = false;
                     parent = current;
                     current = current.left;
               } else {
                     right = true;
                     parent = current;
                     current = current.right;
               }
               if (current == null)
                     return false;
        }

        Node substitute = null;
        //  case 1: Node to be deleted has no children
        if (current.left == null && current.right == null)
               substitute = null;

        //  case 2: Node to be deleted has one child
        else if (current.left == null)
               substitute = current.right;
        else if (current.right == null)
               substitute = current.left;
        else // case 3: Node to be deleted has two children
        {
               Node successor = current.right;
               Node successorParent = current;
               //  searching for the inorder successor of the node to be deleted
               while (successor.left != null) {
                     successorParent = successor;
                     successor = successor.left;
               }
               substitute = successor;
               if (successorParent == current) {
                     if (successor.right == null)
                            successorParent.right = null;
                     else
                            successorParent.right = successor.right;
               } else {
                     if (successor.right == null)
                            successorParent.left = null;
                     else
                            successorParent.left = successor.right;
               }
               successor.right = current.right;
               successor.left = current.left;
               substitute = successor;
        } // case 3 done
        if (current == root) // Replacing the deleted node
               root = substitute;
        else if (right)
               parent.right = substitute;
        else
               parent.left = substitute;
        return true;

 }

	public void displayTree()
	{
		java.util.Stack<Node> globalStack = new java.util.Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println(
		"......................................................");
		while(isRowEmpty==false)
		{
			java.util.Stack<Node> localStack = new java.util.Stack<Node>();
			isRowEmpty = true;

			for(int j=0; j<nBlanks; j++)
				System.out.print(' ');

			while(globalStack.isEmpty()==false)
			{
				Node temp = globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.data);
					localStack.push(temp.left);
					localStack.push(temp.right);

					if(temp.left != null ||
							temp.right != null)
						isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<nBlanks*2-2; j++)
					System.out.print(' ');
			}  // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while(localStack.isEmpty()==false)
				globalStack.push( localStack.pop() );
		}  // end while isRowEmpty is false
		System.out.println(
		"......................................................");
	}
	
	
	
	public BTree idealTopology(int[] a) {
		BTree newTree = new BTree();
		newTree.root = helper(a, 0, a.length-1);
		return newTree;
			

	}


	private Node helper(int[] a ,int lower, int upper) {

		if(lower>upper)
			return null;
		
		int mid = (lower+upper)/2;
		Node ras = new Node(a[mid]);
		ras.left = helper(a, lower, mid-1);
		ras.right = helper(a,mid+1 , upper);
		return ras;

	}
	public int max(){
		return maxhelper(root,-1);
		
	}


	private int maxhelper(Node current, int max) {
	//	if(current == null)
			
			return max;
		
		//if(current.data.compareTo(max))
		
	}
	public int level(int key) {
		return level(root, key);
	}

	public int level(Node cur, int key) {
		if(cur == null)
			return -1;
		if(cur.data == key)
			return 0;
		int leftDepth = level(cur.left, key);
		if(leftDepth != -1){
			//System.out.println(leftDepth);
			return 1 + leftDepth;}
		int rightDepth = level(cur.right, key);
		if(rightDepth != -1)
			return 1 + rightDepth;
		return -1;
	}

	public int getSum(){
		return getSumHelper(root);


	}
	private int getSumHelper(Node current){
		if(current == null)
			return 0;

		return current.data + getSumHelper(current.left) + getSumHelper(current.right);

	}
	public int numberOfNodes(){
		return numberOfNodesHelper(root);

	}
	private int numberOfNodesHelper(Node current){
		if(current == null)
			return 0;
		return 1+ numberOfNodesHelper(current.left)+ numberOfNodesHelper(current.right);
	}


	public int numOfLeaves(){
		return numberOfNodesHelper(root);

	}
	private int numOfLeavesHelper(Node current){
		if(current == null)
			return 0;
		if(current.left == null && current.right == null)
			return 1;

		return numOfLeavesHelper(current.left)+numOfLeavesHelper(current.right);


	}

}