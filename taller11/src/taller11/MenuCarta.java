package taller11;

public class MenuCarta extends Menu{
    
    public double valorGuarnicion;
    public double valorBebida;
    public double porcentajeAdicional;

    public MenuCarta(String nombre, double vMenu, double vIM, double vG,
            double vB) {
        super(nombre, vMenu, vIM);
        valorGuarnicion = vG;
        valorBebida = vB;
    }
    
    @Override
    public void setValorMenu(){
        valorMenu = valorGuarnicion + valorBebida + porcentajeAdicional;
    } 
            
    public void setValorGuarnicion(double x){
        valorGuarnicion = x;
    }       
    
    public double getValorGuarnicion(){
        return valorGuarnicion;
    }
    
    public void setValorBebida(double x){
        valorBebida = x;
    }       
    
    public double getValorBebida(){
        return valorBebida;
    }
    
    public void setPorcentajeAdicional(){
        porcentajeAdicional = valorInicialMenu;
    }       
    
    public double getPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu a la carta\n"
                + "Nombre del plato: %s\n"
                + "Valor del menu: %.2f\n"
                + "Valor inicial del menu: %.2f\n"
                + "Valor porcion de guarnicion: %.2f\n"
                + "Valor de bebida: %.2f\n",
                getNombrePlato(),getValorMenu(),
                getValorInicialMenu(),getValorGuarnicion(),
                getValorBebida());
        
        return cadena;
    }    
}