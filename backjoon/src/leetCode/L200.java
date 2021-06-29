package leetCode;

class L200 {
	
	static boolean[][] isVisited;
	static int[] xArr = {0, 1, 0, -1};
	static int[] yArr = {-1, 0, 1, 0};
	
    public int numIslands(char[][] grid) {
        
    	isVisited = new boolean[grid.length][grid[0].length];
    	int ans = 0;
    	
    	for (int y = 0; y < grid.length; y++) {
			
    		for (int x = 0; x < grid[0].length; x++) {
				
    			if(grid[y][x] == '1' && !isVisited[y][x]) {
    				dfs(y, x, grid);
    				ans++;
    			}
    			
			}
		}
    	
    	return ans;
    }

	private void dfs(int y, int x, char[][] grid) {

		isVisited[y][x] = true;
		
		int nextX, nextY;
		
		for (int i = 0; i < 4; i++) {
			
			nextX = x + xArr[i];
			nextY = y + yArr[i];
			
			if(0 <= nextX && nextX < grid[0].length && 0 <= nextY && nextY < grid.length) {
				
				if(grid[nextY][nextX] == '1' && !isVisited[nextY][nextX]) {
					dfs(nextY, nextX, grid);
				}
			}
		}
		
	}
}