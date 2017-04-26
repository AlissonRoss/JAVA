/*
 * Alisson Leiva Salazar
 */
package carpet;

public class RoomDimension {
	//PRIVATES
	private double width;
	private double length;
	
	//GETTERS/ACCESSORS
	public double getWidth(){
		return this.width;
	}
	public double getLength(){
		return this.length;
	}
	//SETTERS/MUTATORS
	public void setWidth(double w){
		width=w;
		
	}
	public void setLength(double l){
		length=l;
		
	}
	
	//CONSTRUCTORS
	
	public RoomDimension(double l, double w){
		this.length=l;
		this.width=w;
	}
	
	public RoomDimension(RoomDimension room){
		width=room.width;
		length=room.length;
		
	}
	
	
	public double getArea(){
		double area=length*width;
		return area;
		
		
	}
	

}
