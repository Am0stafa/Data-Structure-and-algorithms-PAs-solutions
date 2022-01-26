import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
		newTree.root = idealTopologyhelper(a, 0, a.length-1);
		return newTree;
			

	}


	private Node idealTopologyhelper(int[] a ,int lower, int upper) {

		if(lower>upper)
			return null;
		
		int mid = (lower+upper)/2;
		Node ras = new Node(a[mid]);
		ras.left = idealTopologyhelper(a, lower, mid-1);
		ras.right = idealTopologyhelper(a,mid+1 , upper);
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
			return 1 + leftDepth;
		}
		int rightDepth = level(cur.right, key);
		if(rightDepth != -1)
			return 1 + rightDepth;
		return -1;
	}
	
	public int size() {
		return sizehelper(root);
	
	}
	
	private int sizehelper(Node current) {
		if(current == null)
			return 0;
		
	
		return 1 + sizehelper(current.left) + sizehelper(current.right);
		
	}
	
	
	public int numLeaves() {
		return numLeaveshelper(root);
		
	}
	private int numLeaveshelper(Node current) {
		if(current == null)
			return 0;
		
		if(current.left == null && current.right == null)
			return 1;
		
		return numLeaveshelper(current.left) + numLeaveshelper(current.right);
	}
	
//	public int sum() {
//		return sumhelper(root);
//		 
//	 }
//	
//	private int sumhelper(Node current) {
//		
//		if(current == null)
//			return 0;
//		int totalSum = ((Integer) current.data).intValue();
//		totalSum+= sumhelper(current.left);
//		totalSum+= sumhelper(current.right);
//		return totalsum;
//		
//	} 

	
//	public boolean isBST() {
//		return isBSThelper(root);
//
//	}
//
//	private boolean isBSThelper(Node current) {
//		if(current == null)
//			return true;
//		if(current.left!=null && current.data.compareTo(current.left.data)<0 )
//			return false;
//		if(current.right!=null &&  current.data.compareTo(current.right.data)>0 )
//			return false;
//
//		return isBSThelper(current.left) && isBSThelper(current.right);
//
//	}
	
	public int numLeftChildNodes() {
		return	numLeftChildNodeHelper(root);
	
	}
	
	private int numLeftChildNodeHelper(Node current) {
		if(current == null)
			return 0;
		if(current.left != null && current.right== null)
			return 1 + numLeftChildNodeHelper(current.left);
		return numLeftChildNodeHelper(current.left) + numLeftChildNodeHelper(current.right);
		
	}
	
//	 public int countOccur(Comparable key) {
//		return countOccurHelper(key,root);
//
//	 }
//
//	 private int countOccurHelper(Comparable key, Node current) {
//
//		 if(current == null)
//			 return 0;
//		 if(key.compareTo(current.data)==0)
//			 return 1+ countOccurHelper(key, current.left) +countOccurHelper(key, current.right);
//
//		 return countOccurHelper(key, current.left) +countOccurHelper(key, current.right);
//
//
//
//	 }

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
	//memo
	public int getHight(){
		return getHightHelper(root);

	}
	private int getHightHelper(Node current){
		if(current == null)
			return 0;

		return 1 + Math.max(getHightHelper(current.left),getHightHelper(current.right));

	}

	public ArrayList<Integer> printAtLevel(int level){
		//return array
		ArrayList<Integer> levelarray = new ArrayList<Integer>();
		return printAtLevelHelper(root, level, levelarray);

	}
	private ArrayList<Integer> printAtLevelHelper(Node current , int level,ArrayList<Integer> levelarray){

		if(current == null)
			return null;
		if(level ==0) {
			levelarray.add(current.data);
		}
		printAtLevelHelper(current.left, level-1,levelarray );
		printAtLevelHelper(current.right, level-1,levelarray );
		return levelarray;

	}
	public void printElementAtlevel(int level){

		printElementAtlevelHelper(root, level);

	}
	private void printElementAtlevelHelper(Node current , int level){

		if(current == null)
			return;
		if(level ==0)
			System.out.print(current.data+" ");

		printElementAtlevelHelper(current.left , level-1);
		printElementAtlevelHelper(current.right , level-1);

	}
	public void printAtEachLevel(){
		printAtEachLevelHelper(root);


	}
	private void printAtEachLevelHelper(Node current){

		if(current == null)
			return;
		int height = getHight();
		for(int i =0; i<height; i++) {
			printElementAtlevel(i);
			System.out.println();
		}

	}
	public void levelOrdertrav(){
		Queue<Integer> levelq = new LinkedList<Integer>();

		levelOrdertravHelper(root,levelq );

	}
	private void levelOrdertravHelper(Node current, Queue<Integer> levelq) {
		if(current == null )
			return;


			levelq.add(current.data);

				while(!(levelq.isEmpty())){
					System.out.println(levelq.poll());
					if(current.left != null)
						levelq.add(current.left.data);
					if(current.right != null)
						levelq.add(current.right.data);

				}




	}
	public void leftView(){
		leftViewHelper(root , 0 );


	}
int limit =0;
	private void leftViewHelper(Node current, int level){
		if(current == null)
			return;

		if(level>=limit){
			System.out.println(current.data);
			limit++;
		}

		leftViewHelper(current.left , level+1);
		leftViewHelper(current.right , level+1);

	}

	public int getNode(){
		return getNodeHelper(root);


	}
	int counter =0;
	private int getNodeHelper(Node current) {
		if(current == null)
			return 0;

		if(current.left == null && current.right == null)
			counter++;

		 getNodeHelper(current.right) ;
			getNodeHelper(current.left);
	return counter;
	}


	public void pathOfSum(int sum){

	}
	int res =0;
	Stack<Integer> stack = new Stack<>();
	private void pathOfSumHelper(Node current, int sum){
		if(current == null)
			return;
		if(sum == res){
			System.out.println(stack);
			return;
		}
		stack.push(current.data);
			res+=(current.data);

		pathOfSumHelper(current.left,sum);
		pathOfSumHelper(current.right,sum);
		stack.pop();
			res-=current.data;


	}

	public Node lowestCommonAncestor(Node n1, Node n2){
		return lowestCommonAncestorHelper(root, n1, n2);
	}
	Node left;
	Node right;
	private Node lowestCommonAncestorHelper(Node current,Node n1, Node n2){
		if(current == null)
			return null;
		//search
		if(current == n1 || current == n2)
			return current;
		left = lowestCommonAncestorHelper(current.left,n1,n2);
		right = lowestCommonAncestorHelper(current.right,n1,n2);
			if(left !=null && right != null)
				return current;
			else
				return (left == null? right:left);
			//as in the screenshot
	}
	public void printAllPaths(){


	}
	Stack<Integer> pph = new Stack<>();
	private void printAllPathsHelper(Node current){
		if(current == null)
			return;
		pph.push(current.data);
		printAllPathsHelper(current.left);
			if(current.left == null && current.right==null)
				System.out.println(pph);
			pph.pop();
		printAllPathsHelper(current.right);


	}
	//reverse a binary tree
	public void mirror(){


	}
	private void mirrorHelpper(Node current){
		if(current == null)
			return;
		Node temp = current.right;
		current.right = current.left;
		current.left = temp;


		mirrorHelpper(current.left);
		mirrorHelpper(current.right);
	}
	//check if two trees are identical
	public boolean identical(Node current){
		return 	identicalHelper(current ,root);
	}
	private boolean identicalHelper(Node current,Node ourRoot){
		if(current == null && ourRoot == null)
			return true;
		if(current == null || ourRoot == null)
			return false;
		if(current.data==ourRoot.data)
			return true;


		return  identicalHelper(current.left, ourRoot.left) && identicalHelper(current.right, ourRoot.right);
	}
	public boolean isFoldable(Node current){
		if(current == null)
			return true;
		return isFoldableHelper(current.left , current.right);
	}
	private boolean isFoldableHelper(Node leftNode , Node rightNode){
		if(leftNode == null && rightNode == null)
			return true;
		if(leftNode == null || rightNode == null )
			return false;

		return isFoldableHelper(leftNode.left, rightNode.right) && isFoldableHelper(leftNode.right , rightNode.left);
	}
	public boolean sameStructure(Node current){
		return 	sameStructure(current , root);
	}
	public boolean sameStructure(Node tree1 , Node tree2){
		if(tree1 == null && tree2 == null)
			return true;
		if(tree1 == null || tree2 == null)
			return false;
		return sameStructure(tree1.left , tree2.left) && sameStructure(tree1.right, tree2.right);
	}
	public boolean isIsomorphic(Node current){
		return isIsomorphicHelper(root, current);
	}
	private boolean isIsomorphicHelper(Node tree1, Node tree2){
		if(tree1 == null && tree2 == null)
			return true;
		if(tree1 == null || tree2 == null)
			return false;
		if(tree1.data != tree2.data )
			return false;
	return 	isIsomorphicHelper(tree1.left, tree2.left) && isIsomorphicHelper(tree1.right , tree2.left) ||
			isIsomorphicHelper(tree1.left , tree2.right) && isIsomorphicHelper(tree1.right,tree2.left);
	}
	public int getMinDistance(){
		return getMinDistanceHelper(root);
	}
	private int getMinDistanceHelper(Node current){
		if(current == null)
			return Integer.MAX_VALUE;
		if(current.left == null && current.right == null)
			return 0;
		return 1 + Math.min(getMinDistanceHelper(current.right), getMinDistanceHelper(current.left));
	}


}