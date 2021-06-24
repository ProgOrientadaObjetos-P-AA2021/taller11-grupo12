package taller11;

public class MenuDia extends Menu{
    
    public double valorPostre;
    public double valorBebida;   

    public MenuDia(String nombre, double vMenu, double vIM, double vP,
            double vB) {
        super(nombre, vMenu, vIM);
        valorPostre = vP;
        valorBebida = vB;
    }
            
    public void setValorPostre(double x){
        valorPostre = x;
    }       
    
    public double getValorPostre(){
        return valorPostre;
    }
    
    public void setValorBebida(double x){
        valorBebida = x;
    }       
    
    public double getValorBebida(){
        return valorBebida;
    }
        
}