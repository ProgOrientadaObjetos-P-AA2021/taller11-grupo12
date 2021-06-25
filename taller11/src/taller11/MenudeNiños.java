/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author jamil
 */
public class MenudeNiños {
    private double valorHelado;
    private double valorPastel;

    public MenudeNiños(String nP, double vM, double vI, double vH, double vP) {
        super(nP, vM, vI);
        valorHelado = vH;
        valorPastel = vP;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public void establecerValorHelado(double vH) {
        valorHelado = vH;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    public void establecerValorPastel(double vP) {
        valorPastel = vP;
    }

    public String toString() {
        return String.format("Nombre del plato: %s\nValor del menu: %.2f\n"
                + "Valor inicial del menu: %.2f\n"
                + "valor de porcion de helado: %.2f\n"
                + "Valor de porcion de pastel: %.2f\n",
                 obtenerNombrePlato(), obtenerValorMenu(),
                obtenerValorInicial(), obtenerValorHelado(), obtenerValorPastel());
    }
}
