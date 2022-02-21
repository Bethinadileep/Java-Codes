//1) Java Program to copy all elements of one array into another array
class Practice 
{
	public static void main(String[] args) 
	{
		//1) Java Program to copy all elements of one array into another array
		int arr1[] = {1,2,3,4,5};
		int len = arr1.length;
		int arr2[] = new int[len];
		for(int i=0;i<len;i++){
			arr2[i] = arr1[i];

		}

		//print the copied array
		for(int i=0;i<len;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}
