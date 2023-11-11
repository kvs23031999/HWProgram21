class Drinks {

    public static final int COFFEE_PRICE = 23;
    public static final int TEA_PRICE = 20;
    public static final int LEMONADE_PRICE = 15;
    public static final int MOCHITO_PRICE = 20;
    public static final int MINERAL_PRICE = 16;
    public static final int COCA_COLA_PRICE = 22;

    private static int totalAmount = 0;
    private static int totalDrinks = 0;

    public static void makeDrinks(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                System.out.println("Making coffee...");
                break;
            case TEA:
                System.out.println("Making tea...");
                break;
            case LEMONADE:
                System.out.println("Making lemonade...");
                break;
            case MOCHITO:
                System.out.println("Making mochito...");
                break;
            case MINERAL_WATER:
                System.out.println("Making mineral water...");
                break;
            case COCA_COLA:
                System.out.println("Making cola cola...");
                break;
            default:
                System.out.println("Invalid drinks choice");
        }
        totalDrinks ++;
    }
    public static void calculateTotalAmount(DrinksMachine drinks){
        switch (drinks){
            case COFFEE:
                totalAmount += COFFEE_PRICE;
                break;
            case TEA:
                totalAmount += TEA_PRICE;
                break;
            case LEMONADE:
                totalAmount += LEMONADE_PRICE;
                break;
            case MOCHITO:
                totalAmount += MOCHITO_PRICE;
                break;
            case MINERAL_WATER:
                totalAmount += MINERAL_PRICE;
                break;
            case COCA_COLA:
                totalAmount += COCA_COLA_PRICE;
                break;
        }

    }
    public static void displayTotal(){
        System.out.println("Total drinks: " + totalDrinks);
        System.out.println("Total Amount: " + totalAmount);
    }
}
