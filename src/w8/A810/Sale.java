package A810;

public class Sale {
    private int nrOfSalesLines;
    private SalesLine lines[];

    public Sale() {
        lines = new SalesLine[100];
        nrOfSalesLines = 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void add(SalesLine salesLine) {
        lines[nrOfSalesLines++] = salesLine;
    }

    public void printVatTotal(){

    }
    public void printTotal(){

    }
    public void printTotalVatInclusive(){

    }
    public void printTotalImportTaxes(){

    }
    public void printInvoice(){
        lines[nrOfSalesLines-1].show();
    }

}
