package trabalho2si;

public enum Peca {
	EMPTY(0),
    PLAYER_1(1),
    PLAYER_2(2);

    private int value;

    Peca(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
