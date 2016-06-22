/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import config.conexion;
import dao.productoDao;
import entity.producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 */
public class test {
    private static productoDao hola=new productoDao();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conex();
        listar();
    }
    public static void conex(){
        if(conexion.getConexion()!=null){
            System.out.println("hola");
        }else{
            System.out.println("no hay");
        }
    }
    public static void listar(){
        List<producto> lista=new ArrayList<>();
        lista=hola.readAll();
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i).getNombproducto());
        }
    }
}
