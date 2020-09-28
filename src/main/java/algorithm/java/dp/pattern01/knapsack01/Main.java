package algorithm.java.dp.pattern01.knapsack01;

public class Main {
    public static void main(String[] args) {
        KnapSack knapSack = new KnapSackTopDown();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = knapSack.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = knapSack.solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }
}
