package Rasterizing_Lines;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

   

public class Main { 
	
	
	
	
	
public static void main(String[] args)  
{    

	BufferedImage image=new BufferedImage(101,101,BufferedImage.TYPE_INT_RGB) ;
	Point A=new Point (0,0) ;  
	Point B=new Point(0,100) ; 
	float b=0 ; 
	float a=0 ; 
	Draw_line line = new Draw_line(A,B) ;      
	b=B.y-a*B.x;
	if(line.getX_max(A, B)==line.getX_min(A, B))
	{
		for(int i=(int)line.getY_min(A, B) ;i<line.getY_max(A,B);i++ ) 
		{  
	      image.setRGB((int)line.getX_max(A, B), i, 0xFF0000);
		}
		
	}
	else if( line.getY_max(A, B)==line.getX_min(A,B) )    
	{
	    
			 for(int i=(int)line.getX_min(A, B) ;i<line.getX_max(A,B);i++ ) 
				{  
			      image.setRGB((int)i,(int)line.getY_max(A, B)       ,0xFF0000);
				}
		
	}   
	else 
	{
		a=(A.y-B.y)/(A.x-B.x) ; 

		 for(int i=(int)line.getX_min(A, B) ;i<line.getX_max(A,B);i++ ) 
			{  
			 float y=a*i+b;
		      image.setRGB((int)i,(int)y   ,0xFF0000);
			}

		 for(int i=(int)line.getX_min(A, B) ;i<line.getX_max(A,B);i++ ) 
			{  
		      image.setRGB((int)i,(int)line.getY_max(A, B)       ,0xFF0000);
			}
	}

	   
	System.out.println("X max : " + line.getX_max(A, B))  ;     
	System.out.println("X min : " + line.getX_min(A, B)) ; 
	System.out.println("Y max :" + line.getY_max(A, B))  ; 
	System.out.println("Y min :" + line.getY_min(A, B))  ;  
	System.out.println("C  : " +line.c  ); 
	
	
	

   
try  
{
 ImageIO.write(image,"png",new File("res.png") ) ; 
}  
catch (Exception e) 
{
  e.printStackTrace();
}

	
}

}
