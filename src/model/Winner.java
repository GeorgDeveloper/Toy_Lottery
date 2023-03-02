package model;

public class Winner {
    String nameWinner;
    String toyWinner;

    public Winner(String nameWinner, String toyWinner) {
        this.nameWinner = nameWinner;
        this.toyWinner = toyWinner;
    }

    public String getNameWinner() {
        return nameWinner;
    }

    public void setNameWinner(String nameWinner) {
        this.nameWinner = nameWinner;
    }

    public String getToyWinner() {
        return toyWinner;
    }

    public void setToyWinner(String toyWinner) {
        this.toyWinner = toyWinner;
    }
}
