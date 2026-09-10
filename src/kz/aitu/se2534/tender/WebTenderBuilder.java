package kz.aitu.se2534.tender;

public class WebTenderBuilder implements TenderBuilder{
    private double budget;
    private String region;
    private String category;
    private String description;

    @Override
    public WebTenderBuilder setBudget(double budget) {
        this.budget = budget;
        return this;
    }

    @Override
    public WebTenderBuilder setRegion(String region) {
        this.region = region;
        return this;
    }

    @Override
    public WebTenderBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public WebTenderBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public WebTender getResult(){
        if(budget <= 0){
            throw new IllegalArgumentException("Budget must be greater than zero");
        }
        if(region == null || region.isEmpty()){
            throw new IllegalArgumentException("Tender region is required");
        }
        if(category == null || category.isEmpty()){
            throw new IllegalArgumentException("Tender category is required");
        }
        if(description == null || description.isEmpty()){
            throw new IllegalArgumentException("Tender description is required");
        }

        return new WebTender(budget, region, category, description);
    }

}
