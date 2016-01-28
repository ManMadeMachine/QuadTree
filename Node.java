import java.awt.Point;
import java.awt.Rectangle;

/*  Node - class
*	
*	Holds information about a single point in the QuadTree
*/
public class Node
{
	//Possible point in the Node
	//Each Node can have only one Point in it
	private Point pointData;
	
	//The Area covered by a single Node
	private Rectangle nodeArea;
	private Point areaCenter;
	private int halfDimension;
	
	//4 children Nodes, each start off as a null Node
	//If "this" Node contains some point data (pointData != null ??? ),
	//we need to create the child Nodes, each of which have
	//an area the size of a single quadrant of "this" Nodes area
	
	//TODO: tutki onko public/private soveltuvampi???
	public Node NW = null;
	public Node NE = null;
	public Node SE = null;
	public Node SW = null;
	
	//Constructor
	public Node(Rectangle area)
	{
		//TODO: Rakenna Node
		nodeArea = area;
		areaCenter = new Point(nodeArea.width / 2, nodeArea.height / 2);
		halfDimension = nodeArea.width / 2;
	}
	
	//Returns the possible point data
	public Point getPointData()
	{
		//Returns null, if there isn't any point data
		return pointData;
	}
	
	//Sets the point data (called in QT's Insert-method)
	public void setPointData(Point p)
	{
		if (this.p != null)
			this.pointData = p;
	}
	
	public boolean containsPoint(Point p)
	{
		if (p.x >= this.nodeArea.X && p.y >=
	}
	
	public Rectangle getNodeArea()
	{
		return nodeArea;
	}
	
	public void subdivide()
	{
		this.NW = new Node(new Rectangle(this.nodeArea.X, this.nodeArea.Y, areaCenter.X, areaCenter.Y));
		this.NE = new Node(new Rectangle(this.nodeArea.X, this.nodeArea.Y, this.nodeArea.width/2, this.nodeArea.height /2));
		this.SW = new Node(new Rectangle(this.nodeArea.X, this.nodeArea.Y, this.nodeArea.width/2, this.nodeArea.height /2));
		this.SE = new Node(new Rectangle(this.nodeArea.X, this.nodeArea.Y, this.nodeArea.width/2, this.nodeArea.height /2));
	}
}