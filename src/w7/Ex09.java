import miniprojectSale.*;

public class Ex09 {
    public static void main(String[] args) {
        Product[] products = {
                new Product(100, "Towel", 12.5, 25),
                new Product(200, "Troubled Blood", 19.90, 6),
                new Product(201, "The Ickabog", 21.90, 6),
                new ImportProduct(400, "Chinese Fireworks", 45.50, 25, 15),
                new TaxfreeProduct(600, "Chanel N°5", 119.95)
        };

        Sale sale = new Sale();

        sale.add(new SalesLine(products[0], 2));
        sale.add(new SalesLine(products[1], 1));
        sale.add(new SalesLine(products[2], 1));
        sale.add(new SalesLine(products[3], 5));
        sale.add(new SalesLine(products[4], 2));

        System.out.println("\n---SALE TOSTRING---\n");
        System.out.print(sale);

        sale.printInvoice();
        System.out.println("\n---IMPORT TAXES---\n");
        sale.printTotalImportTaxes();
    }
}