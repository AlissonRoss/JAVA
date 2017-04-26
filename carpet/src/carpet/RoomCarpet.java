/*
 * Alisson Leiva Salazar
 */
package carpet;

public class RoomCarpet {
	//PRIVATES
	private RoomDimension size;
	private double carpetCost;
	
	//GETTERS/ACCESSORS
	public RoomDimension getSize(){
		return this.size;
	}
	public double getCarpetCost(){
		return this.carpetCost;
	}
	
	//CONSTRUCTORS
	
	public RoomCarpet(RoomDimension dim,double cost ){
		this.size=dim;
		this.carpetCost=cost;
	}
	
	//Clone
	public RoomCarpet(RoomCarpet rc){
		size=rc.size;
		carpetCost=rc.carpetCost;
		
	}
	public double getTotalCost(){
		return size.getArea()*carpetCost;
	}
	
	public String toString(){
		String output= "Total: "
				+this.getTotalCost();
		return output;
	}
	

}
