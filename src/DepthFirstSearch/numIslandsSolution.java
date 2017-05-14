package DepthFirstSearch;

public class numIslandsSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myIsland = {{1,1,1,1,0},
							{1,1,0,1,0},
							{1,1,0,0,0},
							{0,0,0,0,0}
							};
		int[][] myIsland2 = {{1,1,0,0,0},
							 {1,1,0,0,0},
							 {0,0,1,0,0},
							 {0,0,0,1,1}
							 };
		numIslandsSolution s = new numIslandsSolution();
		
		System.out.println(s.numIslands(myIsland2));
		

	}
	
	public int numIslands(int[][] grid){
		int[][] gridCopy;
		
		//set grid copy to the current grid
		gridCopy = grid;
		
		//initialise number of islands to zero
		int numberOfIslands = 0;
		
		//iterate through every index of the grid
		for(int i =0; i < grid.length; i++){
			
			for(int j = 0; j < grid[0].length; j++){
				//attempts to sink the current index of the grid
				numberOfIslands += sink(gridCopy, i, j);
			}
			
		}
		
		//return the total number of islands
		return numberOfIslands;
	}

	private int sink(int[][] grid, int i, int j) {
		//check the bounds of i and j and if the current index is an island or not (1 or 0)
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
			return 0;
		}
		
		//set current index to 0 to mark it so that you do not revisit
		grid[i][j] = 0;
		
		// sink all neighbours of current index
		sink(grid, i+1, j);
		sink(grid, i-1, j);
		sink(grid, i, j+1);
		sink(grid, i, j-1);
		
		//increment number of islands
		return 1;
	}

}
