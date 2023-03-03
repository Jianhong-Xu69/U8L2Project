import java.util.Arrays;

public class DupeChecker {
    public static boolean dupesColumn(int[][] grid){ //this method sucks and doesn't work if 0 exists
        boolean hasDupes = false;
        for (int r = 0; r < grid.length; r++) {
            int[] temp = new int[grid.length];
            for (int c = 0; c < grid[r].length; c++) {
                for (int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[i].length; j++) {
                        if (i != r && j != c) {
                            for (int k = 0; k < temp.length; k++) {
                                 if (temp[k] == grid[j][i]){
                                     hasDupes = true;
                                 }
                            }
                        }
                    }
                    temp[c] = grid[c][r];
                }
            }
        }
        return hasDupes;
    }

    public static boolean dupesColumnAlt(int[][] grid){
        boolean hasDupes = false;

        return hasDupes;
    }
}