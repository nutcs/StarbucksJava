public class NewOrder2 {
    // menu drink
    private String drinks;

    private String size;
    private int priceSize = 0;

    private String CoffeeShot;

    private String milk;
    private int priceMilk = 0;
    //private String sweet;


    //select
    public void setDrinks(String item_drinks){
        drinks = item_drinks;
    }
    public void setSite(String item_size, int price){
        size = item_size;
        priceSize += price;
    }
    public void setCoffeeShot(String nameCoffeeShot){
        CoffeeShot = nameCoffeeShot;
    }

    public void setMilk(String nameMilk, int priceMilks){
        milk = nameMilk;
        priceMilk = priceMilks;
    }
    /* 
    public void setSweet(String levelSweet){
        sweet = levelSweet;
    }*/


    //use data
    public String useDrinks(){
        return drinks;
    }
    public String useSize(){
        return size;
    }
    public int usePriceSize(){
        return priceSize;
    }
    public String useCoffeeShot(){
        return CoffeeShot;
    }
    
    public String useMilk(){
        return milk;
    }
    public int usePriceMilk(){
        return priceMilk;
    }
    
    /* 
    public String useSweet(){
        return sweet;
    }
    */


    public int PriceTotal(){
        return priceSize + priceMilk;
    }

}
