import javax.swing.JOptionPane;

/*
 * Alisson Leiva Salazar
 */
public class partitionQuick {
	
	
	private static int leftSubList;
	private static int endOfLeftList;

	public static void main(String[] args) {
		
		//This is my array
		//this array will be modified after partitioning
		int[] array= { 30, 4, 70, 60, 40, -5,80,100};

		//start and end are for the sublist
		//start and end index are reusable for the left sublist and right sublist
		//This is the starting index 
		int startIndex=0;
				
		//This is the ending index 
		int endIndex=array.length -1;
		
		
		partitionQuickSort(array, startIndex, endIndex);
			
		for(int index=0; index < array.length; index++) {
			//JOptionPane.showMessageDialog(null,array[index]);
			System.out.println(array[index]);
			
		}
	
	}
	
	//Partition Method
	public static void partitionQuickSort(int[] array, int startIndex, int endIndex){
			
	
		
		//I take the pivot value as the midpoint
		int pivotVal=array[startIndex];
		int endLeftSubList=startIndex;
		
		//loop= the startIndex plus 1 (Position is now [1])
		//for index position is less than endIndex, increment the index by 1
		for(int loop= startIndex+1;loop <= endIndex; loop++){
		
			
			//if the array element in the current index position is less than the pivotVal, then move the element
			//to the left sublist
			if (array[loop] < pivotVal) {
				++endLeftSubList;
				//swapping
				//swap holds the element
				int swap;
				//temporary var swap holds the element at array[startIndex]
				swap=array[startIndex]; 
				//array[endIndex] is swapped with array[startIndex]
				array[startIndex]=array[endLeftSubList];
				array[endLeftSubList]=swap;
				
				
			}
			//if(array[endIndex] > pivotVal){
				//move element to the left.
				//endIndex--;	
					
			//}
		
		
			
		}
		
		
	}
	

}
