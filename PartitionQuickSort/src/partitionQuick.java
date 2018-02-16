import javax.swing.JOptionPane;

/*
 * Alisson Leiva Salazar
 */
public class partitionQuick {
	
	
	public static void main(String[] args) {
		
		//This is my array
		//this array will be modified after partitioning
		int[] array= { 30, 4, 70, 60, 40, -5};

		//start and end are for the sublist
		//start and end index are reusable for the left sublist and right sublist
		//This is the starting index 
		int startIndex=0;
				
		//This is the ending index 
		int endIndex=array.length -1;
		
		
		partitionQuickSort(array, startIndex, endIndex);
			
		for(int index=0; index < array.length; index++) {
			JOptionPane.showMessageDialog(null,array[index]);
		}
	
	}
	
	//Partition Method
	public static void partitionQuickSort(int[] array, int startIndex, int endIndex){
			
	
		
		//I take the pivot value as the midpoint
		int pivotVal=array[0];
		
		//loop= the startIndex plus 1 (Position is now [1])
		//for index position is less than endIndex, increment the index by 1
		for(int loop= startIndex+1;loop <= endIndex; loop++){
			
			//if the array element in the current index position is less than the pivotVal, then move the element
			//to the left sublist
			if (array[startIndex] < pivotVal) {
				//you are actually moving the index to the right; not the element
				startIndex++;
			
			}
			if(array[endIndex] > pivotVal){
				//move element to the left.
				endIndex--;
				//swapping 
				//swap holds the element
				int swap;
				
				swap=array[startIndex]; 
				array[startIndex]=array[endIndex];
				array[endIndex]=swap;
				
			}
			//swapping
			//swap holds the element
			int swap;
			//temporary var swap holds the element at array[startIndex]
			swap=array[startIndex]; 
			//array[endIndex] is swapped with array[startIndex]
			array[startIndex]=array[endIndex];
			array[endIndex]=swap;
			
		}
		
		
	}
	

}
