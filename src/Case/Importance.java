package Case;

public enum Importance {
    IMPORTANT("важно"),
    UNCRITICAL("некритично"),
    UNIMPORTANT("неважно"),
    UNKNOWN("неизвестно");

    private String value;

    Importance(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Importance getByString(String str) {
        return switch (str) {
            case "важно" -> IMPORTANT;
            case "некритично" -> UNCRITICAL;
            case "неважно" -> UNIMPORTANT;
            default -> UNKNOWN;
        };
    }

    public String getByImportance(Importance importance) {
        return switch (importance) {
            case IMPORTANT -> "важно";
            case UNCRITICAL -> "некритично";
            case UNIMPORTANT -> "неважно";
            default -> "неизвестно";
        };
    }
}
