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
    
    public void setPorcentajeAdicional(double x){
        porcentajeAdicional = x;
    }       
    
    public double getPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Ariendo de Local Comida\n"
                + "Nombre Arrendatario: %s\n"
                + "Cuota base: %.2f\n"
                + "Valor luz: %.2f\n"
                + "Valor agua: %.2f\n"
                + "Porcentaje iva: %.2f\n"
                + "Arriendo Total: %.2f\n", 
                obtenerNombreArrendatario(),
                obtenerCuotaBase(),
                obtenerValorLuz(),
                obtenerValorAgua(),
                obtenerIva(),
                obtenerArriendoMensual());
        
        return cadena;
    }
}