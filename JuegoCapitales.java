/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectos;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */

public class JuegoCapitales {
    public static void main(String[] args) {
        String[][] paisesCapitales = {
            {"nicaragua", "managua"},
            {"el salvador", "san salvador"},
            {"guatemala", "ciudad de guatemala"},
            {"honduras", "tegucigalpa"},
            {"panama", "panama"},
            {"argentina", "buenos aires"},
            {"ecuador", "quito"},
            {"chile", "santiago"},
            {"colombia", "bogota"},
            {"peru", "lima"},
            {"trinidad y tobago", "puerto españa"},
            {"uruguay", "montevideo"},
            {"antigua y barbuda", "saint john"},
            {"barbados", "bridgetown"},
            {"cuba", "la habana"},
            {"jamaica", "kingston"},
            {"san cristobal y granadinas", "basseterre"},
            {"venezuela", "caracas"},
            {"santa lucia", "castries"},
            {"españa", "madrid"},
            {"mexico", "ciudad de mexico"},
            {"francia", "paris"},
            {"italia", "roma"},
            {"alemania", "berlin"},
            {"reino unido", "london"},
            {"canada", "ottawa"},
            {"estados unidos", "washington"},
            {"eslovaquia", "bratislava"},
            {"portugal", "lisboa"},
            {"eslovenia", "liubliana"},
            {"serbia", "belgrado"},
            {"polonia", "varsovia"},
            {"croacia", "zagreb"},
            {"irlanda", "dublin"},
            {"grecia", "atenas"},
            {"turquia", "ankara"},
            {"belgica", "bruselas"},
            {"suecia", "estocolmo"},
            {"austria", "vienna"},
            {"finlandia", "helsinki"},
            {"dinamarca", "copenhague"}
        };

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        boolean jugando = true;

        while (jugando) {
            int indice = random.nextInt(paisesCapitales.length);
            String pais = paisesCapitales[indice][0];
            String capital = paisesCapitales[indice][1];

            System.out.print("Capital de " + pais + ": ");
            String intento = teclado.nextLine().trim().toLowerCase();

            if (intento.equals(capital)) {
                System.out.println("Correcto");
            } else {
                System.out.println("Mal! Era " + capital);
                jugando = false;
            }
        }
    }
}

