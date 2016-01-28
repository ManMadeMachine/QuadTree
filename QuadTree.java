import java.awt.Point;
import java.awt.Rectangle;

/*	QuadTree - class
*
*	Holds the actual tree structure.
*	Contains the methods Find, Insert and Remove,
*	which do appropriate stuff to the tree
*/
public class QuadTree
{
	//Size of the QuadTree area itself
	private Rectangle maxArea;
	Node root;
	
	//The tree nodes
	Node[] tree;
	
	//List of Nodes in the QuadTree.
	//TODO: Rakennin, funktiot, toiminnallisuus
	//Constructor for the QuadTree. Takes the size of the area
	public QuadTree(int areaSize)
	{
		maxArea = new Rectangle(0,0, maxArea-1, maxArea-1);
		root = new Node(maxArea);
		tree = new Node[maxArea];
		tree[0] = root;
	}
	
	public boolean Find(Point p)
	{
	
	}
	
	public boolean Insert(Point p)
	{
		if (p.x < 0 || p.y < 0 || p > maxArea.width || maxArea.height)
			return false
		else
		{
			//TODO: Lisäys. 
			for (int i = 0; i < tree.length(); ++i){
				if (
			}
		}
	}
	
	public boolean Remove(Point p)
	{
	
	}
}