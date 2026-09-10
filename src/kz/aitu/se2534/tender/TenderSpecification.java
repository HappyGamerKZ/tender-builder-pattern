package kz.aitu.se2534.tender;

public final class TenderSpecification {
    private final String content;

    TenderSpecification(String content) {
        this.content = content;
    }

    public String getContent() { return content; }

    @Override
    public String toString() {
        return content;
    }
}
