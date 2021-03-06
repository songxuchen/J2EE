package dp2;

public class RobotPath {
	    public static int ways(int[][] arr, int x, int y) {
	        if (x == arr.length - 1 || y == arr[0].length - 1) {
	          return 1;
	        }
	        
	        if (arr[x][y] == 1) {
	            return 0;
	        }
	        
	        return ways(arr, x+1, y) + ways(arr, x, y+1);
	    }

	    public static void main(String []args){
	        System.out.println("Hello World");
	        /*
	        0 0 1
	        0 0 0
	        0 0 0
	        */
	        
	        int[][] input = new int[3][3];
	        input[0][0] = 0;
	        input[0][1] = 0;
	        input[0][2] = 1;
	        input[1][0] = 0;
	        input[1][1] = 0;
	        input[1][2] = 0;
	        input[2][0] = 0;
	        input[2][1] = 0;
	        input[2][2] = 0;
	        
	        System.out.println(ways(input, 0 , 0));
	    }
	     
}
