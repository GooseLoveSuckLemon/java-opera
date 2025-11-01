package Person;

public enum Gender {
    MALE("муж"),
    FEMALE("жен");

    private final String gend;

    Gender(String gend) {
        this.gend = gend;
    }

    public String getGend() {
        return gend;
    }

}
