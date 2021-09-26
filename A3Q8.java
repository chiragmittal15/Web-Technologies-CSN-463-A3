public class Main
{
	public static void main(String[] args) {
		int arr1[][] = {{1,2,3,6},{4,5,6,8},{7,8,9,5}};
        int arr2[][] = {{1,4,7},{2,6,2},{5,9,3},{4,7,8}};
        int output[][] = new int[arr1.length][arr2[1].length];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[1].length; j++){
                output[i][j] = 0;
                for(int k = 0; k < arr1[i].length; k++){      
                    output[i][j] += arr1[i][k]*arr2[k][j];      
                }
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
	}
}