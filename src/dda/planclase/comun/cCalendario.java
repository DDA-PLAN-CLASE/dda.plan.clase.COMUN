/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dda.planclase.comun;

/**
 *
 * @author Cristian
 */
public class cCalendario {
    private String strfechainicio;
    private String strfechafin;
    private String strhorainicio;
    private String strhorafin;
    private String strmotivo;
    private String strdocumento;
    private String strid;
    private String strestado;
    private String strperiodo;

    public String getStrperiodo() {
        return strperiodo;
    }

    public void setStrperiodo(String strperiodo) {
        this.strperiodo = strperiodo;
    }
    
    public cCalendario() {
        this.strfechainicio = "";
        this.strfechafin = "";
        this.strhorainicio = "";
        this.strhorafin = "";
        this.strmotivo = "";
        this.strdocumento = "";
        this.strid = "";
        this.strestado = "";
        this.strperiodo = "";
    }

    public String getStrfechainicio() {
        return strfechainicio;
    }

    public void setStrfechainicio(String strfechainicio) {
        this.strfechainicio = strfechainicio;
    }

    public String getStrfechafin() {
        return strfechafin;
    }

    public void setStrfechafin(String strfechafin) {
        this.strfechafin = strfechafin;
    }

    public String getStrhorainicio() {
        return strhorainicio;
    }

    public void setStrhorainicio(String strhorainicio) {
        this.strhorainicio = strhorainicio;
    }

    public String getStrmotivo() {
        return strmotivo;
    }

    public void setStrmotivo(String strmotivo) {
        this.strmotivo = strmotivo;
    }

    public String getStrdocumento() {
        return strdocumento;
    }

    public void setStrdocumento(String strdocumento) {
        this.strdocumento = strdocumento;
    }

    public String getStrid() {
        return strid;
    }

    public void setStrid(String strid) {
        this.strid = strid;
    }

    public String getStrhorafin() {
        return strhorafin;
    }

    public void setStrhorafin(String strhorafin) {
        this.strhorafin = strhorafin;
    }
    
    public String getStrestado() {
        return strestado;
    }

    public void setStrestado(String strestado) {
        this.strestado = strestado;
    }
}
