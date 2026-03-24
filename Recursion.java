public class Recursion
{

    
    public static long fibLoop(int n)
    {
        long[] nums = new long[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 2; i <= n; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }


    public static long fibRec(int n){
        // base case
        if(n == 0 || n == 1)
        {
            return n;
        }
        // recursive call
        return fibRec(n-1) + fibRec(n-2);
    }


    public static int sumFrom1To(int n){
        if(n == 1){
            return n;
        }
        return sumFrom1To(n-1) + n;
    }


    public static void printBinary(int length, String current)
    {
        // if we have a String that is the correct length
        if(current.length() == length){
            // print it
            System.out.println(current);
        // we need to continue building
        }else{
            // try adding both 0 and 1 to the String
            printBinary(length, current + "0");
            printBinary(length, current + "1");
        }
    }


    public static void permute(String letters, String current){
        // if no letters left to place
        if(letters.length() == 0){
            System.out.println(current);
            // stop the void method and return back
            return;
        }
        // for each letter left
        for(int i = 0; i < letters.length(); i++){
            // get the letter
            char singleLetter = letters.charAt(i);
            // get the letters before and after to remove the single letter
            String before = letters.substring(0, i);
            String after = letters.substring(i+1);
            // recursive call add before and letter together for what is left
            // add the current letter to the String for the "new word"
            permute(before+after, current + singleLetter);
        }
    }

    public static boolean solveMaze(char[][] maze, int endX, int endY,int x, int y){
        // out of bounds
        if(x >= maze.length || y >= maze[0].length || x < 0 || y < 0){
            return false;
        // hit a wall
        }else if (maze[x][y] == 'W'){
            return false;
        // already travelled here
        }else if(maze[x][y] == 'X'){
            return false;
        // found the solution
        }else if(x == endX && y == endY){
            printMaze(maze);
            return true;
        }
        // mark movement
        maze[x][y] = 'X';
        // try all directions around us
        boolean right = solveMaze(maze, endX, endY, x+1, y);
        boolean down = solveMaze(maze, endX, endY, x, y+1);
        boolean left = solveMaze(maze, endX, endY, x-1, y);
        boolean up = solveMaze(maze, endX, endY, x, y-1);
        // if a solution was found, we are done
        if(down || up || right || left){
            return true;
        }
        // if not, undo move and backtrack
        maze[x][y] = ' ';
        // no solution found
        return false;
    }

    private static void printMaze(char[][] maze){
        for(int row = 0; row < maze[0].length; row++){
            for(int col = 0; col < maze.length; col++){
                System.out.print(maze[row][col]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        permute("ABC", "");
    }
}