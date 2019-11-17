package huffman;

public class NodeData {
    private int frecuency;
    private int symbol;

    public NodeData(){};

    public NodeData(int frecuency, int symbol) {
        this.frecuency = frecuency;
        this.symbol = symbol;
    }

    public int getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(int frecuency) {
        this.frecuency = frecuency;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }
}
