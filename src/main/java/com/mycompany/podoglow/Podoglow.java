package com.mycompany.podoglow;
import javax.swing.JOptionPane;
public class Podoglow {

    public static void main(String[] args) {
        final double POD = 70.00, MANICURAT = 20.00, MANICURAG = 40.00, TRAT = 100.00, PEDI = 50.00;
        String pregunta;
        
        do{
            double ventaTotal = 0.0, subtotal;
            int opc, cantServ = 0;
        
            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión PodoGlow");
        
            do{
                opc = Integer.parseInt(JOptionPane.showInputDialog(
                                       """
                                       --- CATÁLOGO DE SERVICIOS ---
                                       Seleccione una opción:
                                       1. Podología S/70.00
                                       2. Manicura tradicional S/20.00
                                       3. Manicura gel S/40.00
                                       4. Tratamiento de Hongos S/100.00
                                       5. Pedicura S/50.00
                                       6. FINALIZAR Y COBRAR
                                       """
                ));

                if(opc>0 && opc<6){
                    while(true){
                        cantServ = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos servicios realizó"));

                        if(cantServ>0)
                            break;

                        JOptionPane.showMessageDialog(null, "La cantidad de servicios debe ser mayor a 0");
                    }
                }

                switch(opc){
                    case 1:
                        subtotal = POD*cantServ;
                        ventaTotal += subtotal;
                        JOptionPane.showMessageDialog(null, "Agregado: S/ " + subtotal +
                                                            "\nTotal acumulado: S/ " + ventaTotal
                        );
                        break;

                    case 2:
                        subtotal = MANICURAT*cantServ;
                        ventaTotal += subtotal;
                        JOptionPane.showMessageDialog(null, "Agregado: S/ " + subtotal +
                                                            "\nTotal acumulado: S/ " + ventaTotal
                        );
                        break;

                    case 3:
                        subtotal = MANICURAG*cantServ;
                        ventaTotal += subtotal;
                        JOptionPane.showMessageDialog(null, "Agregado: S/ " + subtotal +
                                                            "\nTotal acumulado: S/ " + ventaTotal
                        );
                        break;

                    case 4:
                        subtotal = TRAT*cantServ;
                        ventaTotal += subtotal;
                        JOptionPane.showMessageDialog(null, "Agregado: S/ " + subtotal +
                                                            "\nTotal acumulado: S/ " + ventaTotal
                        );
                        break;

                    case 5:
                        subtotal = PEDI*cantServ;
                        ventaTotal += subtotal;
                        JOptionPane.showMessageDialog(null, "Agregado: S/ " + subtotal +
                                                            "\nTotal acumulado: S/ " + ventaTotal
                        );
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, 
                            "==============================\n" +
                            "       RESUMEN DE VENTA       \n" +
                            "==============================\n" +
                            "TOTAL A PAGAR: S/ " + ventaTotal + "\n" +
                            "==============================\n" +
                            "¡Gracias por su visita a PodoGlow!"
                        );
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }while(opc!=6);
            
            while (true){
                pregunta = JOptionPane.showInputDialog("¿Desea ingresar consumo de otro usuario?"+
                                                   "\nSi"+
                                                   "\nNo"
                );
                if (pregunta.equalsIgnoreCase("Si")|| pregunta.equalsIgnoreCase("No"))
                    break;
                
                JOptionPane.showMessageDialog(null, "Opción no válida: solo puede ingresar (SI o NO)");
            }
            
        }while(pregunta.equalsIgnoreCase("Si"));
    }
    
}
