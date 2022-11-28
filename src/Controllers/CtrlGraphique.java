package Controllers;

import Tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CtrlGraphique {

    private Connection cnx;
    private PreparedStatement ps;
    private ResultSet rs;
    public CtrlGraphique() {
        cnx = ConnexionBDD.getCnx();
    }

    public HashMap<String, Integer> GetPrixAchatAction(){
        HashMap<String, Integer> datas = new HashMap<>();

        try{
            ps=cnx.prepareStatement("SELECT ");
            rs= ps.executeQuery();
        }
        catch (SQLException ex){
            Logger.getLogger(CtrlGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datas;
    }


}
