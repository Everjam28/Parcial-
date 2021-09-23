/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

/**
 *
 * @author Ever Arias
 */
public class Host {
    private String nombreHost;
    private String SistemaOperativo;

    public Host() {
    }

    Host(String ever) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombreHost() {
        return nombreHost;
    }

    public void setNombreHost(String nombreHost) {
        this.nombreHost = nombreHost;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String SistemaOperativo) {
        this.SistemaOperativo = SistemaOperativo;
    }
    
    
}
