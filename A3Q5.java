public class Main
{
	public static void main(String[] args) {
		int[] arr = {23,6,47,35,2,14};
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0)
                System.out.println(arr[i]);
        }
	}
}