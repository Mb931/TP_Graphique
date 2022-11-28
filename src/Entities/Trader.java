package Entities;

public class Trader {
    private int idTrader;
    private String nomTrader;

    public Trader(int idTrader, String nomTrader){
        this.setIdTrader(idTrader);
        this.setNomTrader(nomTrader);
    }

    public int getIdTrader() {
        return idTrader;
    }

    public void setIdTrader(int idTrader) {
        this.idTrader = idTrader;
    }

    public String getNomTrader() {
        return nomTrader;
    }

    public void setNomTrader(String nomTrader) {
        this.nomTrader = nomTrader;
    }
}
