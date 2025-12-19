public class ProfitLossCalculation {
    public static void main(String[] args) {
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191");
        int selling_price = 191;
        int cost_price =129;
        int profit = selling_price - cost_price;
        // giving wrong answer
        //double profit_percentage = (profit/cost_price)*100;

        double profit_percentage = (profit * 100.0) / cost_price;
        System.out.println("The Profit is INR "  + profit + " and the Profit Percentage is " +  profit_percentage);
    }
}
