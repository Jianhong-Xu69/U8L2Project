public class DupeCheckRunner {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3,4},
                        {10,2,3,4},
                        {1,2,3,4},
                        {1,2,3,4}};
        System.out.println(DupeChecker.dupesColumn(grid));
    }
}
