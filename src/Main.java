public class Main {
    public static void main(String[] args) {

        Product redbull = new Product("Eneregtic","Redbull");
        Product redbull2 = new Product("Eneregtic","Redbull");
        Product cola = new Product("Drink", "Coca-Cola");

        System.out.println(redbull.equals(redbull2));
        System.out.println(redbull.equals(cola));


    }
}