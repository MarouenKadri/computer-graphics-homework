package Rasterizing_Lines;



public class Draw_line {  
Point A ; 
Point B ;  
float c= 0 ; 


Draw_line(Point A,Point B) 
{
	this.A=A ; 
	this.B=B ; 
	
}   




float getX_max(Point A,Point B) 
{
	
return A.x>B.x ? A.x:B.x;
		
}  
float getX_min(Point A, Point B)  

{
return A.x>B.x ? B.x:A.x ; 
	
}

float getY_max(Point A,Point B) 
{
	return A.y>B.y ?A.y:B.y ; 
}  
float getY_min(Point A,Point B) 
{
	return A.y>B.y ?B.y:A.y ; 
}    



	
	
	
	

}

	

	



