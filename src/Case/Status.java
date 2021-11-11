package Case;

public enum Status {
    DONE(true),
    NOT_DONE(false);

    private boolean value;

    Status(boolean value) {
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public Status getByString(String str) {
        if (str.equals("выполнено")) {
            return DONE;
        }
        return NOT_DONE;
    }

    public String getByStatus(Status status) {
        if (status == DONE) {
            return "выполнено";
        }
        return "не выполнено";
    }
}
