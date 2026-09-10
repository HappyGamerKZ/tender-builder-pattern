package kz.aitu.se2534.tender;

public class TenderDirector {

    public void makeAgroTender(TenderBuilder builder) {
        builder.setCategory("Agroculture")
                .setBudget(50000.0)
                .setRegion("Akmola Region")
                .setDescription("Supply of combine harvesters and wheat seeds");
    }

    public void makeConstructionTender(TenderSpecificationBuilder builder) {
        builder.setCategory("Construction")
                .setBudget(100000.0)
                .setRegion("Almaty Region")
                .setDescription("Construction of a new office building");
    }
}
