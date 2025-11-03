//Add more cans to the machine -  public void fillUp(int cans)
//Insert a token and get a can - public void insertToken()
//Return number of cans left - public int getCanCount()
//Return number of tokens collected - public int getTokenCount()
//Reset/collect tokens - public void emptyTokens()

/**
 * Instance variables:
 * int cans
 * int tokens
 */

public class VendingMachine {
    private int cans;
    private int tokens;

    public VendingMachine() {
        this(10);
    }

    public VendingMachine(int cans) {
        this.cans = cans;
        this.tokens = 0;
    }

    public void insertToken() {
        if (cans > 0) {
            tokens++;
            cans--;
        } else {
            System.out.println("No cans left.");
        }
    }

    public void fillUp(int cans) {
        this.cans += cans;
    }

    public int getCanCount() {
        return cans;
    }

    public int getTokenCount() {
        return tokens;
    }

    public void emptyTokens() {
        tokens = 0;
    }
}