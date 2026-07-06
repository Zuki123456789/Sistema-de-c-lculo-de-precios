package com.mycompany.podoglow;
import javax.swing.JOptionPane;
public class Podoglow {
    
    static double ventaTotal;

    public static void main(String[] args) {
        final double POD = 70.00, MANICURAT = 20.00, MANICURAG = 40.00, TRAT = 100.00, PEDI = 50.00;
        
        do{
            ventaTotal = 0.0;
            int opc, cantServ = 0;
        
            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión PodoGlow");
        
            do{
                opc = menu();
                
                if(opc < 6)
                    cantServ = validarInt("¿Cuántos servicios realizó", 1);
                
                switch(opc){
                    case 1:
                        calcularPrecio(POD, cantServ);
                        break;

                    case 2:
                        calcularPrecio(MANICURAT, cantServ);
                        break;

                    case 3:
                        calcularPrecio(MANICURAG, cantServ);
                        break;

                    case 4:
                        calcularPrecio(TRAT, cantServ);
                        break;

                    case 5:
                        calcularPrecio(PEDI, cantServ);
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
            
        }while(validarPregunta());
    }
  
    public static int menu(){
        int opc;
        while(true){
            opc = validarInt(
                    """
                    --- CATÁLOGO DE SERVICIOS ---
                    Seleccione una opción:
                    1. Podología S/70.00
                    2. Manicura tradicional S/20.00
                    3. Manicura gel S/40.00
                    4. Tratamiento de Hongos S/100.00
                    5. Pedicura S/50.00
                    6. FINALIZAR Y COBRAR
                    """, 1
            );
            
            if(opc<=6) return opc;
            
            JOptionPane.showMessageDialog(null, "Error: opción inválida");
        }
    }
    
    public static int validarInt(String mensaje, int numMin){
        int num;
        while(true){
            try{
                num = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                
                if(num>=numMin) return num;
                
                JOptionPane.showMessageDialog(null, "Error: el número ingresado debe ser igual o mayor a "+numMin);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: solo debe ingresar números");
            }
        }
    }
    
    public static void calcularPrecio(double precio, int cantidad){
        ventaTotal += (precio*cantidad);
        JOptionPane.showMessageDialog(null, "Agregado: S/ " + (precio*cantidad) +
                                            "\nTotal acumulado: S/ " + ventaTotal
        );
    }
    
    public static boolean validarPregunta(){
        String pregunta;
        while (true){
            pregunta = JOptionPane.showInputDialog("¿Desea ingresar consumo de otro usuario?"+
                                                   "\nSi"+
                                                   "\nNo"
            );
            if (pregunta.equalsIgnoreCase("Si")|| pregunta.equalsIgnoreCase("No"))
                return pregunta.equalsIgnoreCase("si");
                
            JOptionPane.showMessageDialog(null, "Opción no válida: solo puede ingresar (SI o NO)");
        }
    }
}
