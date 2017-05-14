package Practice;

public class recursiveMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,1,1,0,1,1,0},
						{0,0,1,0,0,1,0},
						{0,0,1,1,1,1,0},
						{0,0,1,0,0,0,0},
						{0,0,1,1,1,1,100}};
		
		System.out.println("Maze layout before Finding Path");
		printMaze(grid);
		
		if(FindPath(grid, 0 , 0)){
			System.out.println("The maze path is : ");
			printMaze(grid);
		}
		else{
		System.out.println("There is no solution");
		printMaze(grid);
		}

	}
	
	private static void printMaze(int[][] grid){
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
	
	private static boolean FindPath(int[][]grid, int row , int col){
				
		if(valid(grid, row, col)){
			
			/*If it works out, you are done! You have reached the goal!
			/*For 8 queens problem, you can check here to see if all queens are being placed*/
			if(grid[row][col] == 100){
				grid[row][col] = 5;
				return true;
			}
			
			//Mark the path as VISITED
			grid[row][col] = 9;
			
			/*if(row == grid.length - 1 && col == grid[0].length - 1){
				grid[row][col] = 5;
				return true;
			}*/		
			
			//CHOICES!!!!
			/*For 8 queens problem, you can check here if it is save to put the queen such 
			that it is not threatened.*/
			if(FindPath(grid, row - 1, col)){ //North
				//Mark the path as the solution path
				grid[row][col] = 5;
				return true; 
			}
			if(FindPath(grid, row, col + 1)){ //East
				//Mark the path as the solution path
				grid[row][col] = 5;
				return true;
			}
			if(FindPath(grid, row + 1, col)){ //South
				//Mark the path as the solution path
				grid[row][col] = 5;
				return true; 
			}
			if(FindPath(grid, row, col - 1)){ //West
				//Mark the path as the solution path
				grid[row][col] = 5;
				return true; 
			}
		}
		//Backtracking!!!!
		return false;		
	}
	
	private static boolean valid(int[][] grid, int row, int col){
		
		boolean result = false;
		
		//Check if the cell is in the bounds of the matrix
		if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length){
			//Check if cell is not blocked and not previously VISITED. If it is visited, it will be 9
			if(grid[row][col] == 1 || grid[row][col] == 100){				
				result = true;
			}
		}	
		return result;		
	}

}
