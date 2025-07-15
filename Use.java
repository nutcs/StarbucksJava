public class Use {
    public static void main(String[] args) {
        Use run = new Use();
        Receipt receipt = new Receipt();
        receipt.bill(run.useOrder2());
    }

    public void useOrder1(){
        Order order = new Order();
        order.setDrinks("Coffees");
        order.setMilk("soy", 15);
        order.setShotEspresso("Decaf");
        order.setSite("Grande", 155);
        order.setSweet("Less Sweet");
        order.setTopping(null,"Mocha Sauce", 15);
        
        System.out.println(order.useMilk());
    }

    public NewOrder2 useOrder2(){
        NewOrder2 order = new NewOrder2();
        order.setDrinks("Americano");
        order.setSite("Large", 135);
        order.setCoffeeShot("Decaf");
        order.setMilk("Oat Milk", 15);
        System.out.println("SPECIAL PROMOTION 10% OFF\nTotal amount: " + Math_find_percentageOf(order.PriceTotal(), 10) + " ฿");
        return order;
    }

    public int Math_find_percentageOf(int number, int percentage){
        // คำนวนราคาที่หัก % แล้ว
        return  number - number * percentage / 100;
    }
}
