package taller11;

public class MenuEconomico extends Menu{
    
    private double porcentajeDescuento;
    
    public MenuEconomico(String nombre,double vIM, double vP) {
        super(nombre, vIM);
        porcentajeDescuento = vP;        
    }

    @Override
    public void setValorMenu(){
        valorMenu = valorInicialMenu - porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(){
        porcentajeDescuento = valorInicialMenu * 0.10;
    }

    @Override
    public String toString(){
        String cadena = String.format("\nMenu del dia.-\n"
                + "Nombre del plato: %s\n"                
                + "Valor inicial del menu: %.2f\n"
                + "Valor de postre: %.2f\n"
                + "Valor de bebida: %.2f\n"
                + "Valor del menu: %.2f\n",
                getNombrePlato(),getValorInicialMenu(),getValorPostre(),
                getValorBebida(),getValorMenu());
        
        return cadena;
    }
}