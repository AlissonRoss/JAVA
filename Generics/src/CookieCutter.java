/*
 * Alisson Leiva Salazar
 */
//className<Type>
public class CookieCutter<T> {
	//Initializing 
	private T cookieCutter;
	
	//Getters/Accessors
	public T getCookieCutter() {
		return cookieCutter;
	}
	
	
	//Setters/Mutators
	public void setCookieCutter(T c) {
		cookieCutter=c;
	}
	
	//Constructors
	public CookieCutter(T c) {
		cookieCutter=c;
		
	}
	public String toString() {
		return (String) (this.getCookieCutter());
		
	}	
	
}
