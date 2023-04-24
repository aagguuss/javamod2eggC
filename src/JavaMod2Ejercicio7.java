

import java.util.Scanner;



/**sadad
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario.
 * Las cadenas deben llegar con un formato fijo:
 * tienen que ser de un máximo de 5 caracteres de largo,
 * el primer carácter tiene que ser X y el último tiene que ser una O.
 Las secuencias leídas que respeten el formato se consideran correctas,
 * la secuencia especial “YYYYY” marca el final de los envíos (llamémosla FDE),
 * y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 Al finalizar el proceso, se imprime un informe indicando
 * la cantidad de lecturas correctas e incorrectas recibidas.
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
 * de Java   Substring(), Length(), equals().

 * @author agust
 */
//class  JavaMod2Ejercicio7 {

    /**
     *
     * @param args the command line arguments
     */
/*public static void main(String[] args) {
        boolean FDE=false;
        int contadorCorrecto;
        int contadorInconrrecto;
        contadorCorrecto=0;
        contadorInconrrecto=0;
        Scanner leer = new Scanner (System.in);

       do {
            System.out.println("Ingrese una cadena");
            String cadena = leer.nextLine();
            cadena = cadena.toUpperCase();
            if("X".equals(cadena.substring(0,1))){

            }
            else if (cadena.substring(4,5)=="O"){
            }
            else if  (cadena.length()==5){
                contadorCorrecto = contadorCorrecto+1;
                break;
            }
            if (cadena=="YYYYY"){
                FDE=true;
                break;
            }
            else {

                contadorInconrrecto=contadorInconrrecto+1;
            }

 } while (FDE=true);
        System.out.println("Informe:");
        System.out.println("La cantidad total de palabras ingresadas es de: "+ (contadorCorrecto+contadorInconrrecto) );
        System.out.println("La cantidad de palabras correctas es de :"+ contadorCorrecto);
        System.out.println("La cantidad de palabras Incorrectas es de :"+ contadorInconrrecto);
    }
}*/