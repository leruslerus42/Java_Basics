public class mealCost {
    public static double calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return (result);
    }

    public static void main(String[] args){
        System.out.println("Your total meal price is " + calculateTotalMealPrice(15,  .02,  .08));
    }
}
