class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       
        boolean valid=true;
        int numOfRows=board.length;
        int numOfCols=board[0].length;
        Set<String> checkForInvalidSet=new HashSet();
        for(int i=0;i< numOfRows;i++) {
        	for(int j=0;j<numOfCols;j++) {
        		if(board[i][j] != '.')
        		{
        		String elemForRow="ROW".concat(String.valueOf(i)).concat(String.valueOf(board[i][j]));
        		String elemForCol="COL".concat(String.valueOf(j)).concat(String.valueOf(board[i][j]));
        		int box=(i/3)*3 + j/3;
        		String elemForBox="BOX".concat(String.valueOf(box)).concat(String.valueOf(board[i][j]));
        		if(!checkForInvalidSet.add(elemForRow) || 
        		   !checkForInvalidSet.add(elemForCol) ||
                   !checkForInvalidSet.add(elemForBox)) {
        			return false;
        		}
        	}
        	}
        }
        
        return valid;
    
    
    }
}