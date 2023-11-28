import java.util.*;
import java.awt.*;

class RobotInAGrid {

    static ArrayList<Point> recursiveGetPath(boolean[][] maze) {
        if (maze == null || maze.length == 0) 
            return null;

        ArrayList<Point> path = new ArrayList<Point>();
        if (recursiveGetPath(maze, maze.length - 1, maze[0].length - 1, path)) {
            return path;
        }

        return null;
    }

    static boolean recursiveGetPath(boolean[][] maze, int row, int col, ArrayList<Point> path) {
        if (col < 0 || row < 0 || !maze[row][col])
            return false;
        boolean isAtOrigin = (row == 0) && (col == 0);

        if (isAtOrigin || recursiveGetPath(maze, row, col-1, path) || recursiveGetPath(maze, row-1, col, path)) {
            Point p = new Point(row, col);
            path.add(p);
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        ArrayList<Point> res = recursiveGetPath(new boolean[][]{{true, true, false}, {true, true, true}});
        for (Point p : res) {
            System.out.println(p);
        }
    }
}