public class maxProd {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int prod = 1;

            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                maxProduct = Math.max(maxProduct, prod);
            }
        }

        return maxProduct;;
    }
}
