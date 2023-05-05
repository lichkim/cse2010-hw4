package cse2010.hw4;

public class Driver {
    public static void main(String[] args) {
        Maze maze;

        int[][] testMaze = new int[][] {
                { 0, 1, 0, 1, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 0 },
                { 0, 1, 1, 1, 0 }
        };

        maze = new Maze(testMaze, new Location(0, 0), new Location(4, 4));
        System.out.println(maze.findPath());
        System.out.println(maze.showPath());
    }
}
