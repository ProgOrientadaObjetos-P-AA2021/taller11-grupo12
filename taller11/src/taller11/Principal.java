package taller11;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Menu> listaMenus = new ArrayList<>();
        
        MenuDia menuDia1 = new MenuDia("Mixta con pollo",8,2,2);
        menuDia1.getValorMenu();
        
        MenuCarta menuCarta1 = new MenuCarta("Mixta con pollo",8,2,2);
        menuDia1.getValorMenu();
        
        listaMenus.add(arriendoComida);
        listaMenus.add(arriendoComercial);
        listaMenus.add(arriendoSesiones);
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
        }
        
        CentroComercial centro = new CentroComercial("La Pradera", 
                listaArriendos);
        centro.establecerTotalArriendosBaseMensual();
        centro.establecerTotalArriendosFinalMensual();
        System.out.println(centro);
        
    }
}