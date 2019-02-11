import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataSource {

    int lastValidID;
    List<Product> products;
    List<Integer> productsCount;
    List<Integer> soldProducts;

    public DataSource()
    {
        lastValidID = 0;
        products = new ArrayList<>();
        productsCount = new ArrayList<>();
        soldProducts = new ArrayList<>();
    }

    public void addProduct(String name, String type, double price,int weight, Date validityDate)//"animal","vegetal"
    {
        lastValidID++;
        products.add(new Product(lastValidID, name, type, price, weight, validityDate));
        productsCount.add(0);
        soldProducts.add(0);
    }

    public void addMoreItemsToStock(int itemIndex, Integer count) {

        Integer currentValue = productsCount.get(itemIndex);
        productsCount.set(itemIndex, currentValue + count);


    }

}
