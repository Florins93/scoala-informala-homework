import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Menu {

    DataSource dataSource;

    public Menu()
    {
        dataSource = new DataSource();
    }

    public void MainMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please select an option");

        System.out.println("1. Create product and add it to stock");

        System.out.println("2. Sell product");

        System.out.println("3. Display daily sales report");

        System.out.println("4. Exit");

        int optiune = scan.nextInt();

        while(optiune!= 4){
            switch(optiune){
                case 1: createProduct();
                break;

                case 2: sellProduct();
                break;

                case 3:displayDailySalesReport();
                break;

                case 4: return;


                default:
                    System.out.println("Optiune invalida");
                    break;

            }


        }



    }

    private void createProduct() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Product type (1 - animal; 2 - vegetable; 3 - addToStock; 4 - back ");
        int optiune = scan.nextInt();

        while(optiune != 3)
        {
            switch(optiune){
                case 1: createAnimalProduct();
                    break;

                case 2: createVegetalProduct();
                    break;

                case 3: addToStock();
                    break;

                case 4:return;

                default:
                    System.out.println("Optiune invalida");
                    break;

            }

        }

    }

    private void addToStock() {

        for( int i=0;i< dataSource.products.size()-1;i++){
            System.out.print(i+1 + ". ");
            System.out.print(dataSource.products.get(i).getName() + ":");
            System.out.println(dataSource.productsCount.get(i) + " on stock");
        }
        dataSource.addMoreItemsToStock();
    }

    //1.1 :
    private void createAnimalProduct()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name :");
        String productName = scan.nextLine();

        System.out.println("Price :");
        double productPrice = scan.nextDouble();

        System.out.println("Weight :");
        int productWeight = scan.nextInt();

        System.out.println("Expiration Date: ");
        int day,month,year;

        System.out.println("Day: ");
        day = scan.nextInt();
        System.out.println("Month: ");
        month = scan.nextInt();
        System.out.println("Year: ");
        year = scan.nextInt();
        Date  validityProduct = new GregorianCalendar(year,month,day).getTime();

        scan.close();

        dataSource.addProduct(productName,"animal",productPrice,productWeight, validityProduct);

    }

    //1.2 :
    private void createVegetalProduct()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name :");
        String productName = scan.nextLine();

        System.out.println("Price :");
        double productPrice = scan.nextDouble();

        System.out.println("Weight :");
        int productWeight = scan.nextInt();

        System.out.println("Expiration Date: ");
        int day,month,year;

        System.out.println("Day: ");
        day = scan.nextInt();
        System.out.println("Month: ");
        month = scan.nextInt();
        System.out.println("Year: ");
        year = scan.nextInt();
        Date  validityProduct = new GregorianCalendar(year,month,day).getTime();

        scan.close();

        dataSource.addProduct(productName,"vegetal",productPrice,productWeight, validityProduct);

    }

    public static void sellProduct() {

    }

    public static void displayDailySalesReport() {

    }

}
