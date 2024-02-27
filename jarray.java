package demo;
public class jarray {
    public static void main(String[] args) {	
	int arr[][] = new int[4][];
	arr[0] = new int[3];
	arr[1] = new int[2];
	arr[2] = new int[1];
	arr[3] = new int[4];
	int count = 5;
	for (int i = 0; i < arr.length; i++)
	    for (int j = 0; j < arr[i].length; j++) {
		arr[i][j] = count;
		count+=5; 	
	    }
	 // Displaying the values of 2D Jagged array
	 System.out.println("Contents of 2D Jagged Array");
	 for (int i = 0; i < arr.length; i++)	{
	    for (int j = 0; j < arr[i].length; j++)
		System.out.print(arr[i][j] + " ");
		System.out.println();  	
	    } 
	} 
}
