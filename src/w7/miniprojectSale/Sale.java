package miniprojectSale;

public class Sale {
    private SalesLine[] lines = new SalesLine[100];
    private int nrOfSalesLines;

    public Sale(){
        nrOfSalesLines = 0;
    }

    public void add(SalesLine line){
        lines[nrOfSalesLines++] = line;
    }

//    Towel                                     quantity:  2  price: € 25,00  VAT: € 6,25  total: € 31,25
//    Troubled Blood                            quantity:  1  price: € 19,90  VAT: € 1,19  total: € 21,09
//    The Ickabog                               quantity:  1  price: € 21,90  VAT: € 1,31  total: € 23,21
//    Chinese Fireworks                         quantity:  5  price: €227,50  VAT: €56,88  total: €284,38
//    Chanel N°5                                quantity:  2  price: €239,90  VAT: € 0,00  total: €239,90
//
//    Total VAT exclusive: €534,20
//    VAT                : € 65,63
//    Total VAT inclusive: €599,83

    public void printVatTotal(){
        double vatTotal = 0;
        for(int i = 0; i < nrOfSalesLines; i++){
            SalesLine line = lines[i];
            vatTotal += line.getProduct().getPrice() * (line.getProduct().getVatPercentage() * 0.01);
        }
        System.out.printf("VAT Total: %.2f\n", vatTotal);
    }

    public void printTotal(){
        double total = 0;
        for(int i = 0; i < nrOfSalesLines; i++){
            SalesLine line = lines[i];
            total += line.getProduct().getPrice();
        }
        System.out.printf("Total: %.2f\n", total);
    }

    public void printTotalVatInclusive(){
        double totalVatInclusive = 0;
        for(int i = 0; i < nrOfSalesLines; i++){
            SalesLine line = lines[i];
            totalVatInclusive += line.getProduct().getPrice() + (line.getProduct().getVatPercentage() * (line.getProduct().getVatPercentage() * 0.01));
        }
        System.out.printf("Total VAT inclusive: %.2f\n", totalVatInclusive);
    }

    public void printTotalImportTaxes(){
        double totalImportTaxes = 0;
        for(int i = 0; i < nrOfSalesLines; i++){
            SalesLine line = lines[i];
            Product p = lines[i].getProduct();
            if(p instanceof ImportProduct) {
                ImportProduct ip = (ImportProduct) p;
                totalImportTaxes += (ip.getImportTax() * 0.01) * lines[i].getQuantity();
            }
        }
        System.out.printf("Total import taxes: %.2f\n", totalImportTaxes);
    }

    public void printInvoice(){
        for(int i=0; i < nrOfSalesLines; i++){
           lines[i].show();
        }

        printTotal();
        printVatTotal();
        printTotalVatInclusive();
    }

    @Override
    public String toString() {
        StringBuilder sale = new StringBuilder();
        for(int i = 0; i < nrOfSalesLines; i++){
            sale.append(lines[i].toString()).append("\n");
        }
        return sale.toString();
    }
}
