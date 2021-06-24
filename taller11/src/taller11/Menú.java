package taller11;

public class Menú {
    
    private String nombrePlato;
    private double valorMenú;
    private double valorInicialMenú;
    
    public void setNombrePlato(String x){
        nombrePlato = x;
    }       
    
    public String getNombrePlato(){
        return nombrePlato;
    }
    
    public void setValorMenú(double x){
        valorMenú = x;
    }       
    
    public double getValorMenú(){
        return valorMenú;
    }
    
    public void setValorInicialMenú(double x){
        valorInicialMenú = x;
    }       
    
    public double getValorInicialMenú(){
        return valorInicialMenú;
    }
}