/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package festivalburbujas;

/**
 *
 * @author aba7500
 */
public class Assistent {
    private String codiTicket;
    private String nom;
    private int edat;
    private boolean VIP;

    public Assistent(String codiTicket, String nom, int edat, boolean VIP) {
        this.codiTicket = codiTicket;
        this.nom = nom;
        this.edat = edat;
        this.VIP = VIP;
    }

    public Assistent(String codiTicket, String nom, int edat) {
        this.codiTicket = codiTicket;
        this.nom = nom;
        this.edat = edat;
        this.VIP = false;
    }

    public String getCodiTicket() {
        return codiTicket;
    }

    public void setCodiTicket(String codiTicket) {
        this.codiTicket = codiTicket;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    @Override
    public String toString() {
        
        String vipSINO = "";
        
        if (VIP ==  true) {
            vipSINO = "SI";
        } else{
            vipSINO = "NO";
        }
        
        return "Codigo " + codiTicket  + " nombre: " + nom + " edad: " + edat + " VIP-> " + vipSINO;
    }
  
    
}
