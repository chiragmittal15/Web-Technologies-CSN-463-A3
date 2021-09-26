public class Main
{
     static void transpose(int mat[][], int tr[][], int N){
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                tr[i][j] = mat[j][i];
    }
     
    static boolean isSymmetric(int mat[][], int N){
        int tr[][] = new int[N][N];
        transpose(mat, tr, N);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (mat[i][j] != tr[i][j])
                    return false;
        return true;
    }

    static boolean isSkewSymmetric(int mat[][], int N) {
        int tr[][] = new int[N][N];
        transpose(mat, tr, N); 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                if (mat[i][j] != -tr[i][j]) 
                    return false; 
        return true; 
    } 

    public static void main(String[] args) { 
        int arr[][] = {{1,1,-1},{1,2,0},{-1,0,5},{4,5,6}};
        if(arr.length!=arr[0].length){
        System.out.println("Matrix is neither Skew-Symmetric nor Symmetric");
        return;
        }
        if(isSymmetric(arr, arr.length)){
            System.out.println("Matrix is Symmetric");
        } else if(isSkewSymmetric(arr, arr.length)){
            System.out.println("Matrix is Skew-Symmetric");
        } else {
            System.out.println("Matrix is neither Skew-Symmetric nor Symmetric");
        }
    }
}
