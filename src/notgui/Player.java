package notgui;

public class Player {
    private final Account account;
    private final String name;
    public Player(String name, int sold) {
        this.name = name;
        this.account = new Account(sold);
    }
    public String getName() {
        return name;
    }
    public Account getAccount() {
        return account;
    }
}
