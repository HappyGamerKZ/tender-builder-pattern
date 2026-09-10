package kz.aitu.se2534.tender;

public class Main {
    static void main(String[] args) {
        TenderDirector director = new TenderDirector();

        WebTenderBuilder WebBuilder = new WebTenderBuilder();
        director.makeAgroTender(WebBuilder);
        WebTender agroTender = WebBuilder.getResult();

        System.out.println("--- Representation 1: Java Object ---");
        System.out.println(agroTender);

        System.out.println();

        TenderSpecificationBuilder specBuilder = new TenderSpecificationBuilder();
        director.makeAgroTender(specBuilder);
        TenderSpecification specSheet = specBuilder.getResult();

        System.out.println("--- Representation 2: Tender Specification ---");
        System.out.println(specSheet);
    }
}
