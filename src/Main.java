public class Main {
    public static void main(String[] args)
    {
        double priceOfPurchase = 100;
        double SALES_TAX = 0.05;
        double costOfTax = priceOfPurchase * SALES_TAX;
        double totalCost = costOfTax + priceOfPurchase;
        System.out.println("The initial cost of the item is $" + priceOfPurchase);
        System.out.println("The sales tax is $" + costOfTax);
        System.out.println("The total cost is $" + totalCost);
    }
}