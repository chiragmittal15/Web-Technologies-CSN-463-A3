import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        System.out.println("FIBONACCI SERIES:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for(int k = 2; k <= n; k++){
            arr[k] = arr[k-1] + arr[k-2];
            System.out.println(arr[k]);
        }
	}
}