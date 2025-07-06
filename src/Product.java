import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private int product_id;

    private double price;

    private String category;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Product(int product_id, double price, String category) {
        this.product_id = product_id;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public static void main(String[] args) {


        Product product = new Product(1, 100, "footWear");
        Product product5 = new Product(2, 300, "footWear");
        Product product1 = new Product(3, 300, "something");
        Product product2 = new Product(4, 400, "pop");
        Product product3 = new Product(5, 600, "hello");
        Product product4 = new Product(6, 500, "dd");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        List<Product> resultList = null;

        resultList=productList.stream().filter(ele->ele.getCategory().equals("footWear")).map(ele->{
            ele.setPrice(priceCalculate(ele.getPrice()));
            return ele;
        }).toList();
        System.out.println(resultList);
    }

    public static  double priceCalculate(double price){
        return price-(price*15/100);
    }


}