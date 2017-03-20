/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dda.planclase.comun;

/**
 *
 * @author User
 */
public class cDocente {

    private String strCedula;
    private String strId;

    public cDocente() {
        this.strCedula = "";
        this.strId = "";
    }

    public String getStrCedula() {
        return strCedula;
    }

    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public void setStrCedula(String strCedula) {
        this.strCedula = strCedula;
    }

}
