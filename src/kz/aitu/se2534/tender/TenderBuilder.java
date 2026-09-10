package kz.aitu.se2534.tender;

public interface TenderBuilder {
    TenderBuilder setBudget(double budget);
    TenderBuilder setRegion(String region);
    TenderBuilder setCategory(String category);
    TenderBuilder setDescription(String description);
}
