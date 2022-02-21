//2) Java Program to find the frequency of each element in the array

class Practice
{
	public static void main(String[] args) 
	{
		//2) Java Program to find the frequency of each element in the array
		int[] arr1 = {102,32,21,234,212,32,102,21};
					//102,32,21,234,212,
		int len = arr1.length;
		
		int[] arr2 = new int[len];
		
		int visited = -1;
		//to store frquency of 
		for(int i=0;i<len;i++){
			int count = 1;
			for(int j=i+1;j<len;j++){
				if(arr1[i] == arr1[j]){
					count++;
					//To Avoid Counting the same element again.
					arr2[j] = visited;
				}
			}
			if(arr2[i] != visited){
				arr2[i] = count;
			}
		}

		//print the array with frquency
		for(int k=0;k<arr2.length;k++){
			if(arr2[k] != visited)
				System.out.println(arr1[k] + " " + arr2[k]);
		}

		System.out.println("--------------------------------------------");
	}
}
