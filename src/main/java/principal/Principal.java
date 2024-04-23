/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

import model.Ave;
import model.Cachorro;

/**
 *
 * @author joao
 */
public class Principal {

    public static void main(String[] args) {
        Cachorro viralata = new Cachorro();
        viralata.produzirSom();
        viralata.mover();
        Ave passaro = new Ave();
        passaro.mover();
        passaro.produzirSom();
    }
}
