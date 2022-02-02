package pluralsightpom.pages.search;

public enum SkillLevel {
    BEGINNER("Beginner"), INTERMEDIATE("intermediate"), ADVANCED("Advanced");

    private String value;

    SkillLevel(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
