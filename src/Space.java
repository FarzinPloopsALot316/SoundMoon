public class Space {
    private String symbol;

    public Space (String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol () {
        return symbol;
    }

    public void setSymbol (String newSymbol) {
        symbol = newSymbol;
    }

    public String toString() {
        return symbol;
    }

    // added this
}
