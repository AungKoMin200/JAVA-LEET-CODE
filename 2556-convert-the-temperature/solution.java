class Solution {
    public double[] convertTemperature(double celsius) {
        double K, F;
        K= celsius + 273.15;
        F= celsius * 1.80 + 32.00;

        return new double[]{K,F};
    }
}
