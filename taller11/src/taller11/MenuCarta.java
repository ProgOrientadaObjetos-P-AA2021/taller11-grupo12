package taller11;

public class MenuCarta extends Menu{
    
    public double valorGuarnicion;
    public double valorBebida;
    public double porcentajeAdicional;
            
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
}