public class Main
{
	public static void main(String[] args) {
		int arr[][] = {{4,2,23,6},{7,9,12,3},{1,4,7,21},{6,23,8,7}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Trace: " + sum);
	}
}