/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.conexion;
import entity.producto;
import interfaces.operacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 */
public class productoDao implements operacion <producto>{
    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
    private final String sql_readall="SELECT * FROM producto";
    private final String sql_update="UPDATE producto SET nombproducto = ? , descproducto = ? , cantproducto = ? ,priceproducto = ? WHERE idproducto= ?";
    private final String sql_read ="SELECT *FROM producto WHERE idproducto=?";
    private final String sql_create ="INSERT INTO producto (idusuario, nombproducto, descproducto,cantproducto,priceproducto)" +
                        "VALUES (NULL, ?,?,?,?);";
    @Override
    public int create(producto e) {
        int r=0;
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_create);
            ps.setString(1, e.getNombproducto());
            ps.setString(2, e.getDescproducto());
            ps.setInt(3,e.getCantproducto());
            ps.setDouble(4,e.getPriceproducto());
            r = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return r;
    }

    @Override
    public int update(producto e) {
        int r=0;
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_update);
            ps.setString(1, e.getNombproducto());
            ps.setString(2, e.getDescproducto());
            ps.setInt(3, e.getCantproducto());
            ps.setDouble(4, e.getPriceproducto());
            ps.setInt(5, e.getIdproducto());
            r = ps.executeUpdate();
        } catch (Exception ex) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return r;
        
    }

    @Override
    public int delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<producto> readAll() {
        List<producto> lista=new ArrayList <>();
        try{
            cx=conexion.getConexion();
            ps=cx.prepareStatement(sql_readall);
            rs=ps.executeQuery();
            while(rs.next()){
                producto p=new producto();
                p.setIdproducto(rs.getInt("idproducto"));
                p.setNombproducto(rs.getString("nombproducto"));
                p.setDescproducto(rs.getString("descproducto"));
                p.setCantproducto(rs.getInt("cantproducto"));
                p.setPriceproducto(rs.getDouble("priceproducto"));
                lista.add(p);
            }
        }catch(Exception e){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        return lista;
    }

    @Override
    public List<producto> read(Object key) {
        List<producto> lista = new ArrayList<>();
        try {
            cx = conexion.getConexion();
            ps = cx.prepareStatement(sql_read);
            ps.setInt(1, (int)key);
            rs = ps.executeQuery();
            while(rs.next()){
                producto p=new producto();
                p.setIdproducto(rs.getInt("idproducto"));
                p.setNombproducto(rs.getString("nombproducto"));
                p.setDescproducto(rs.getString("descproducto"));
                p.setCantproducto(rs.getInt("cantproducto"));
                p.setPriceproducto(rs.getDouble("priceproducto"));
                lista.add(p);
            }
        } catch (Exception e) {
        
        }
        return lista;
    }
    
}
