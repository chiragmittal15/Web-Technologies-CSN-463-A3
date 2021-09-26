public class Main
{
	public static void main(String[] args) {
		int[] arr= {23,6,47,35,2,14};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Average: " + (sum/arr.length)); 
        
	}
}
