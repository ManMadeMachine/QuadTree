
import java.io.*;
import java.util.Scanner;
import java.awt.Point;
public class Tira{ 
   public static void main(String[] args) throws IOException  {
     
    //We just have ten points.
	Point [] Data= new Point[10];
	
	Scanner s = null;
     //Read in the points from a textfile.
        try {
            s = new Scanner(new BufferedReader(new FileReader("testdata.txt")));
            int counter=0;
            while (s.hasNext()) {
			
			int x=Integer.parseInt(s.next());
            int y=Integer.parseInt(s.next());    
			Point p =new Point(x,y);
			Data[counter]=p;
			counter++;
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    
	for (int i=0; i<10; i++)
		System.out.println(Data[i].x+ " "+Data[i].y);
	
	 //Build your program such that it uses the code below and remove the comments.
	QuadTree qt=new QuadTree(1024);
	
	for(int i=0; i<10; i++){	   
		  qt.Insert(Data[i]);
	}
		
	System.out.println("Nyt pitäis tapahtua jotain:");
	qt.Find(Data[0]);
	qt.Find(Data[3]);
	qt.Remove(Data[1]);
	qt.Remove(Data[5]);
		 
   } 
}
