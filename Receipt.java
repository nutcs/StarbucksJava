public class Receipt {
    public String address = "---- Receipt ----"
    + "\n9/1 Moo 5 Phaholyothin Road, Klong Nueng, Klong Luang, Pathumthani 12120"
    +"\n-------------------------------------------------------------------------";

    public void bill(NewOrder2 item_class){
        NewOrder2 order = item_class;
        Use mathPercen = new Use();
        System.out.println(address);
        System.out.println(order.useDrinks());
        System.out.println(order.useCoffeeShot());
        System.out.println(order.useMilk());
        System.out.println("Subtotal " + "฿" + order.PriceTotal());
        System.out.println("Discount 10 %  " +"฿" + order.PriceTotal() * 10 / 100);
        System.out.println("Total " +"฿" + mathPercen.Math_find_percentageOf(order.PriceTotal(), 10) );
    }
}
