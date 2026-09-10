package kz.aitu.se2534.tender;

public class TenderSpecificationBuilder implements TenderBuilder {
    private final StringBuilder sb = new StringBuilder("=== TENDER SPECIFICATION SHEET ===\n");
    private boolean hasContent = false;

    @Override
    public TenderSpecificationBuilder setBudget(double budget) {
        sb.append("BUDGET:     $").append(String.format("%.2f", budget)).append("\n");
        hasContent = true;
        return this;
    }

    @Override
    public TenderSpecificationBuilder setRegion(String region) {
        sb.append("REGION:     ").append(region).append("\n");
        hasContent = true;
        return this;
    }

    @Override
    public TenderSpecificationBuilder setCategory(String category) {
        sb.append("CATEGORY:   ").append(category).append("\n");
        hasContent = true;
        return this;
    }

    @Override
    public TenderSpecificationBuilder setDescription(String description) {
        sb.append("DESCRIPTION:").append(description).append("\n");
        hasContent = true;
        return this;
    }

    public TenderSpecification getResult() {
        if (!hasContent) {
            throw new IllegalStateException("Cannot generate spec sheet for an empty tender");
        }
        return new TenderSpecification(sb.toString());
    }
}
