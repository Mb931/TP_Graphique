package Entities;

public class Action {
    private int idAction;
    private String nomAction;

    public Action(int idAction, String nomAction){
        this.setIdAction(idAction);
        this.setNomAction(nomAction);
    }

    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    public String getNomAction() {
        return nomAction;
    }

    public void setNomAction(String nomAction) {
        this.nomAction = nomAction;
    }
}
