package taller11;

public class Menu {
    
    private String nombrePlato;
    private double valorMenu;
    private double valorInicialMenu;
    
    public void setNombrePlato(String x){
        nombrePlato = x;
    }       
    
    public String getNombrePlato(){
        return nombrePlato;
    }
    
    public void setValorMenu(double x){
        valorMenu = x;
    }       
    
    public double getValorMenu(){
        return valorMenu;
    }
    
    public void setValorInicialMenu(double x){
        valorInicialMenu = x;
    }       
    
    public double getValorInicialMenu(){
        return valorInicialMenu;
    }
}