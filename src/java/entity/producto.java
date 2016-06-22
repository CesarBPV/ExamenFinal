/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author FIA-LAB1D6
 */
public class producto {
    private int idproducto;
    private String nombproducto;
    private String descproducto;
    private int cantproducto;
    private double priceproducto;

    public producto(int idproducto, String nombproducto, String descproducto, int cantproducto, double priceproducto) {
        this.idproducto = idproducto;
        this.nombproducto = nombproducto;
        this.descproducto = descproducto;
        this.cantproducto = cantproducto;
        this.priceproducto = priceproducto;
    }

    public producto(String nombproducto, String descproducto, int cantproducto, double priceproducto) {
        this.nombproducto = nombproducto;
        this.descproducto = descproducto;
        this.cantproducto = cantproducto;
        this.priceproducto = priceproducto;
    }

    public producto() {
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombproducto() {
        return nombproducto;
    }

    public void setNombproducto(String nombproducto) {
        this.nombproducto = nombproducto;
    }

    public String getDescproducto() {
        return descproducto;
    }

    public void setDescproducto(String descproducto) {
        this.descproducto = descproducto;
    }

    public int getCantproducto() {
        return cantproducto;
    }

    public void setCantproducto(int cantproducto) {
        this.cantproducto = cantproducto;
    }

    public double getPriceproducto() {
        return priceproducto;
    }

    public void setPriceproducto(double priceproducto) {
        this.priceproducto = priceproducto;
    }
    
}
