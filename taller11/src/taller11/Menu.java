package taller11;

public abstract class Menu {
    
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;
    
    public Menu(String nombre,double vIM){
        nombrePlato = nombre;        
        valorInicialMenu = vIM;
    }
    
    public void setNombrePlato(String x){
        nombrePlato = x;
    }       
    
    public String getNombrePlato(){
        return nombrePlato;
    }
    
    public abstract void setValorMenu();       
    
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