public class Order{
    // menu drink
    private String drinks;

    private String size;
    private int priceSize = 0;

    private String espressoShot;
    private int addEspresso = 0;
    private int priceShotEspresso = 0;

    private int addHalfDecaf = 0;
    private int priceShotHalfDecaf = 0;
    
    private int addDecaf = 0;
    private int priceShotDecaf = 0;

    private String milk;
    private int priceMilk = 0;

    private String sweet;

    private String OptionTopping;
    private String topping;
    private int priceTopping = 0;


    //select
    public void setDrinks(String item_drinks){
        drinks = item_drinks;
    }
    public void setSite(String item_size, int siteprice){
        size = item_size;
        priceSize += siteprice;
    }
    public void setShotEspresso(String item_shot){
        espressoShot = item_shot;
    }
    public void setMilk(String nameMilk, int priceMilks){
        milk = nameMilk;
        priceMilk = priceMilks;
    }
    
    public void setSweet(String levelSweet){
        sweet = levelSweet;
    }
    public void setTopping(String Option, String ExtraTopping, int priceToppings){
        OptionTopping = Option;
        topping = ExtraTopping;
        priceTopping = priceToppings;
    }


    // add shot
    public void plusEspresso(){
        addEspresso += 1;
        priceShotEspresso = addEspresso * 20;
    }
    public void plusHalfDecaf(){
        addHalfDecaf += 1;
        priceShotHalfDecaf = addHalfDecaf * 20;
    }
    public void plusDecaf(){
        addDecaf += 1;
        priceShotDecaf = addDecaf * 20;
    }
    // add shot

    // minus shot
    public void minusEspresso(){
        if(addEspresso > 0){
            addEspresso  -= 1;
            priceShotEspresso = addEspresso * 20;
        }  
    }
    public void minusHalfDecaf(){
        if(addHalfDecaf > 0){
            addHalfDecaf  -= 1;
            priceShotHalfDecaf = addHalfDecaf * 20;
        }
    }
    public void minusDecaf(){
        if(addDecaf > 0){
            addDecaf  -= 1;
            priceShotDecaf = addDecaf * 20;
        }
    }
    // minus shot
    

    
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
    
    public String useEspressoShot(){
        return espressoShot;
    }
    public int useAddEspresso(){
        return addEspresso;
    }
    public int usePriceShotEspresso(){
        return priceShotEspresso;
    }
    
    public int useAddHalfDecaf(){
        return addHalfDecaf;
    }
    public int usePriceShotHalfDecaf(){
        return priceShotHalfDecaf;
    }
    
    public int useAddDecaf(){
        return addDecaf;
    }
    public int usePriceShotDecaf(){
        return priceShotDecaf;
    }

    public String useMilk(){
        return milk;
    }
    public int usePriceMilk(){
        return priceMilk;
    }
    
    public String useSweet(){
        return sweet;
    }
    
    public String useOptionTopping(){
        return OptionTopping;
    }
    public String useTopping(){
        return topping;
    }
    public int usepP(){
        return priceTopping;
    }

}
