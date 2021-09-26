import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
        int[] arr= new int[20];  
        for(int i = 0; i < 20; i++)  
            arr[i] = sc.nextInt();
        System.out.println(arr[1]); 
        
	}
}