package taller11;

import java.util.ArrayList;

public class Cuenta {
    
    private String nombreCliente;
    private ArrayList<Menu> menus;
    private double valorTotal;
    private double subTotal;
    private double iva;
    
    public void setNombreCliente(String x){
        nombreCliente = x;
    }       
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public void setMenus(ArrayList<Menu> x){
        menus = x;
    }       
    
    public ArrayList<Menu> getMenus(){
        return menus;
    }
    
    public void setValorTotal(double x){
        valorTotal = x;
    }       
    
    public double getValorTotal(){
        return valorTotal;
    }
    
    public void setSubTotal(double x){
        subTotal = x;
    }       
    
    public double getSubTotal(){
        return subTotal;
    }
    
    public void setIva(){
        iva = 0.12;
    }       
    
    public double getIva(){
        return iva;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Cuenta a pagar.-\n"
                + "Nombre del cliente: %s\n"
                + "Listado de todos los menus ordenados: %s\n"
                + "Subtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Valor total a pagar: %.2f\n",
                getNombreCliente(),getMenus(),
                getSubTotal(),getIva(),
                getValorTotal());
        
        return cadena;
    }
}