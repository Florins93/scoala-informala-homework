import java.util.Date;

public class Product {
    int id;
    String name;
    String type;
    double price;
    int weight;
    Date validityDate;

    public Product(int id, String name, String type, double price, int weight, Date validityDate)
    {
        this.id=id;
        this.name=name;
        this.type = type;
        this.price=price;
        this.weight=weight;
        this.validityDate=validityDate;

    }

    public Product(){

    }


    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }



}
