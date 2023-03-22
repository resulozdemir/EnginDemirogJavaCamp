package staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductMenager productMenager = new ProductMenager();
        Product product = new Product();
        product.name = "mouse";
        product.price = 10;

        productMenager.add(product);

        DatabaseHelper.Crud.delete();
    }
}
