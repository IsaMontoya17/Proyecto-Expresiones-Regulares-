package Vista;

import Bean.Punto3;
import Bean.Punto4;
import Bean.Punto5;
import Logica.LPunto5;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {

    public void Menu() {
        int opc = 0;
        VistaPunto1 vPunto1 = new VistaPunto1();
        VistaPunto2 vPunto2 = new VistaPunto2();
        VistaPunto3 vPunto3 = new VistaPunto3();
        VistaPunto5 vPunto5 = new VistaPunto5();
        VistaPunto4 vPunto4 = new VistaPunto4();
        LPunto5 lPunto5 = new LPunto5();
        ArrayList<Punto3> docentes = new ArrayList<>();
        ArrayList<Punto3> docentesSeptiembre = new ArrayList<>();
        ArrayList<Punto4> arrayPunto4 = new ArrayList<>();
        ArrayList<Punto5> tarjetaCredito = new ArrayList<>();

        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja una opción: \n"
                    + "1. Punto número uno \n"
                    + "2. Punto número dos \n"
                    + "3. Punto número tres \n"
                    + "4. Punto número cuatro \n"
                    + "5. Punto número cinco \n"
                    + "0. Salir \n", "Menú Principal", 1));

            switch (opc) {
                case 1:
                    vPunto1.VistaNumero();
                    break;
                case 2:
                    vPunto2.Vista2();
                    break;
                case 3:
                    vPunto3.vistaPunto3(docentes, docentesSeptiembre);
                    break;
                case 4:
                    vPunto4.vistaPunto4(arrayPunto4);
                    break;
                case 5:
                    tarjetaCredito = vPunto5.vistaPunto5(tarjetaCredito);
                    lPunto5.visaomaster(tarjetaCredito);
                    break;
            }

        } while (opc != 0);

    }//CIERRE DEL METODO

}//CIERRE DE LA CLASE
