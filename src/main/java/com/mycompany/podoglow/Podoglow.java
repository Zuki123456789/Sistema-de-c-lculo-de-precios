package com.mycompany.podoglow;
    import javax.swing.JOptionPane;
public class Podoglow {
    public static void main(String[] args) {
        // 1. Catálogo de servicios y precios (Solución a la desinformación)
        String[] servicios = {
            "Podología", 
            "Manicura tradicional", 
            "Manicura gel", 
            "Tratamiento de Hongos", 
            "Pedicura"
        };
        double[] precios = {70.0, 20.0, 40.0, 100.0, 50.0};
        
        double totalVenta = 0;
        int opcion = 0;

        // Mensaje de bienvenida profesional
        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Gestión PodoGlow");

        // 2. Ciclo de selección múltiple (Permite elegir varios servicios)
        do {
            String menu = "--- CATÁLOGO DE SERVICIOS ---\nSeleccione una opción:\n";
            for (int i = 0; i < servicios.length; i++) {
                menu += (i + 1) + ". " + servicios[i] + " (S/ " + precios[i] + ")\n";
            }
            menu += (servicios.length + 1) + ". FINALIZAR Y COBRAR";

            // Captura la opción del menú
            try {
                String input = JOptionPane.showInputDialog(menu);
                if (input == null) break; // Si presiona cancelar, sale del programa
                
                opcion = Integer.parseInt(input);

                if (opcion >= 1 && opcion <= servicios.length) {
                    // 3. Captura de cantidad por servicio
                    int index = opcion - 1;
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                        "Has seleccionado: " + servicios[index] + "\n¿Cuántos servicios realizó?"
                    ));

                    if (cantidad > 0) {
                        double subtotal = precios[index] * cantidad;
                        totalVenta += subtotal; // Acumulador del total final
                        JOptionPane.showMessageDialog(null, "Agregado: S/ " + subtotal + "\nTotal acumulado: S/ " + totalVenta);
                    }
                } else if (opcion != (servicios.length + 1)) {
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números.");
            }

        } while (opcion != (servicios.length + 1));

        // 4. Resultado final (Elimina errores manuales y profesionaliza el cobro)
        JOptionPane.showMessageDialog(null, 
            "==============================\n" +
            "       RESUMEN DE VENTA       \n" +
            "==============================\n" +
            "TOTAL A PAGAR: S/ " + totalVenta + "\n" +
            "==============================\n" +
            "¡Gracias por su visita a PodoGlow!", 
            "Cierre de Caja", JOptionPane.INFORMATION_MESSAGE);
    }
}
