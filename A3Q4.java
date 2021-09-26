import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {23,6,47,35,2,14};
        Arrays.sort(arr);
        System.out.println("Second Largest Element: " + arr[arr.length-2]); 
        
	}
}