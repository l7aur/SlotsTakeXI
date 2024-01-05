package notgui;

public class Account {
    private int sold;
    public Account(int newSold) {
        this.sold = newSold;
    }
    public void updateSold(int value) {
        this.sold += value;
    }
    public boolean hasEnoughMoney(int value) {
        return (value < this.sold);
    }
    public int getSold() {
        return sold;
    }
}
