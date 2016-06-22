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
public class movimiento {
    private int idmovimiento;
    private int producto_idproducto;
    private int tipomov;
    private String fechmov;
    private int nrofacmov;

    public movimiento(int idmovimiento, int producto_idproducto, int tipomov, String fechmov, int nrofacmov) {
        this.idmovimiento = idmovimiento;
        this.producto_idproducto = producto_idproducto;
        this.tipomov = tipomov;
        this.fechmov = fechmov;
        this.nrofacmov = nrofacmov;
    }

    public movimiento(int producto_idproducto, int tipomov, String fechmov, int nrofacmov) {
        this.producto_idproducto = producto_idproducto;
        this.tipomov = tipomov;
        this.fechmov = fechmov;
        this.nrofacmov = nrofacmov;
    }

    public movimiento() {
    }

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public int getProducto_idproducto() {
        return producto_idproducto;
    }

    public void setProducto_idproducto(int producto_idproducto) {
        this.producto_idproducto = producto_idproducto;
    }

    public int getTipomov() {
        return tipomov;
    }

    public void setTipomov(int tipomov) {
        this.tipomov = tipomov;
    }

    public String getFechmov() {
        return fechmov;
    }

    public void setFechmov(String fechmov) {
        this.fechmov = fechmov;
    }

    public int getNrofacmov() {
        return nrofacmov;
    }

    public void setNrofacmov(int nrofacmov) {
        this.nrofacmov = nrofacmov;
    }
    
}
