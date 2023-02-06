package leetCode.easy;

/*
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
the i(th) customer has in the j(th) bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomer_1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int wealth = 0;
        for (int[] account : accounts) {
            for (int i : account) {
                wealth += i;
            }
            if (max < wealth) {
                max = wealth;
            }
            wealth = 0;
        }
        return max;
    }
}
