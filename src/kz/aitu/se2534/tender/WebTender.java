package kz.aitu.se2534.tender;

public final class WebTender {
    private final double budget;
    private final String region;
    private final String category;
    private final String description;

    WebTender(double budget, String region, String category, String description) {
        this.budget = budget;
        this.region = region;
        this.category = category;
        this.description = description;
    }

    public double getBudget() { return budget; }
    public String getRegion() { return region; }
    public String getCategory() { return category; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return "WebTender{" +
                "budget=" + budget +
                ", region='" + region + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
