package Practice;

import java.util.concurrent.TimeUnit;

public class Queens8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0}};
		/*int[][] grid = {{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0}};*/

		//System.out.println(isSafe(grid, 3, 3));
		System.out.println(Solve(grid, 0));
	}
	
	private static boolean Solve(int[][]grid, int col){
		
		//Base Case
		if(col >= grid.length){
			printGrid(grid);
			return true;
		}
			
		//For how many options you have	
		//Check if safe to put the queen, 
		//be optimistic and put it. 
		for(int rowToTry = 0; rowToTry < grid.length; rowToTry++){
			if(isSafe(grid, rowToTry, col)){
				//PlaceQueen
				grid[rowToTry][col] = 1;
				System.out.println("////////////////////////////");
				printGrid(grid);
				System.out.println("////////////////////////////");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(Solve(grid, col + 1))
					return true;
				//Remove the Queen
				grid[rowToTry][col] = 0;
				System.out.println("////////////////////////////");
				printGrid(grid);
				System.out.println("////////////////////////////");
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		}
		//Backtracking
		return false;
	}
	
	private static boolean isSafe(int[][] grid, int rowToTry, int col){
		if(checkCol(grid, col) && checkRow(grid, rowToTry) && checkDiagonal(grid, rowToTry, col)){
			return true;
		}
		return false;
	}
	
	private static boolean checkCol(int[][] grid, int col){
		for(int[] i : grid){
			if(i[col] == 1)
				return false;
		}
		return true;
	}
	private static boolean checkRow(int[][] grid, int rowToTry){
		for(int i : grid[rowToTry]){
			if(i == 1)
				return false;
		}
		return true;
	}
	
	private static boolean checkDiagonal(int[][] grid, int rowToTry, int col){
		int count = Math.abs(rowToTry - col);
		if(rowToTry > col){
			for(int i = 0; i < grid.length - rowToTry + col; i++){
				if(grid[count][i] == 1)
					return false;
				count++;
			}
		}
		else{
			for(int i = 0; i < grid.length - col + rowToTry; i++){
				if(grid[i][count] == 1)
					return false;
				count++;
			}
		}
		return true;
	}
	
	private static void printGrid(int[][] grid){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}
