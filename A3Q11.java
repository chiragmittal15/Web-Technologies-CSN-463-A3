public class Main
{
     public static void main(String[] args) {
        int arr[][] = {{4,27,32},{6,9,21},{8,7,1}};
        //Using first column
        int a=(arr[0][0] * (arr[1][1] * arr[2][2] - arr[1][2] * arr[2][1]));
        int b=(arr[0][1] * (arr[1][0] * arr[2][2] - arr[1][2] * arr[2][0]));
        int c=(arr[0][2] * (arr[1][0] * arr[2][1] - arr[1][1] * arr[2][0]));
        int det= a - b + c;
        System.out.println("Determinant: " + det);
    }
}
