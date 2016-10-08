package trabalho2si;

public enum Peca {
	EMPTY("0"),
    PLAYER_1("1"),
    PLAYER_2("2");

    private String value;

    Peca(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
