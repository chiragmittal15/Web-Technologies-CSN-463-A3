import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
        System.out.print("Enter size of array: ");  
        int n = sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("Enter the Elements: ");  
        for(int i=0; i<n; i++)  
            arr[i]=sc.nextInt();  
        System.out.println("Elements of the array: ");     
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");   
            
        }
        
	}
}