package taller11;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Menu> listaMenus = new ArrayList<>();
        
        MenuDia menuDia1 = new MenuDia("Mixta con pollo",8,2,2);
        menuDia1.getValorMenu();
        
        MenuCarta menuCarta1 = new MenuCarta("Bandera",8,2,2);
        menuCarta1.setPorcentajeAdicional();
        menuCarta1.getValorMenu();
        
        listaMenus.add(menuDia1);
        listaMenus.add(menuCarta1);        
        
        for (int i = 0; i < listaMenus.size(); i++) {
            listaMenus.get(i).setValorMenu();
        }
        
        Cuenta cuenta1 = new Cuenta("Jandry Jaramillo", listaMenus);
        cuenta1.setSubTotal();
        cuenta1.setIva();
        cuenta1.setValorTotal();
        System.out.println(cuenta1);
        
    }
}