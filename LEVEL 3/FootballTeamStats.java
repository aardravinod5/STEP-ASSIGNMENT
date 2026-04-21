class FootballTeamStats {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    public static double calculateMean(int[] heights) {
        return (double) calculateSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) min = height;
        }
        return min;
    }
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) max = height;
        }
        return max;
    }
    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        System.out.println(calculateSum(heights));
        System.out.println(calculateMean(heights));
        System.out.println(findShortest(heights));
        System.out.println(findTallest(heights));
    }
}