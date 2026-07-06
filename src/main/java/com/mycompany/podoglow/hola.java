package com.mycompany.podoglow;
import javax.swing.JOptionPane;
public class hola {

    public static void main(String[] args) {
        /*int empleados;
        String nombre;
        
        empleados = validarInt("Ingrese la cantidad de usuarios:", 1);
        
        for(int empleado = 1; empleado <= empleados; empleado++){
            nombre = leer("Ingrese el nombre");
            int codigoEmpleado = validarInt("Ingrese su código", 1);
            double horasTrabajadas = validarDouble("Ingrese las horas trabajadas");
            double kilometros = validarDouble("Ingrese la cantidad de kilómetros recorridos");
            int accidentes = validarInt("Ingrese la cantidad de accidentes durante el mes", 0);
            double sueldo = validarDouble("Ingrese su sueldo");
            double eficiencia = calcularEficiencia(kilometros, horasTrabajadas);
            double bonificación =
            
        }
    }
    
    public static int validarInt(String mensaje, int numMin){
        int num;
        
        while(true){
            try{
                num = Integer.parseInt(leer(mensaje));
                
                if(num>=numMin)
                    return num;
                
                JOptionPane.showMessageDialog(null, "Error: la cantidad debe ser igual o mayor a "+numMin);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: solo debe ingresar números");
            }
        }
    }
    
    public static double validarDouble(String mensaje){
        double num;
        
        while(true){
            try{
                num = Double.parseDouble(leer(mensaje));
                
                if(num>0)
                    return num;
                
                JOptionPane.showMessageDialog(null, "Error: la cantidad debe ser mayor a 0");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: solo debe ingresar números");
            }
        }
    }
    
    public static void mostrarReporteConductor(){
        
    }
    
    public static String leer(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public static double calcularEficiencia(double km, double hrs){
        return km/hrs;
    }
    
    public static double calcularporcentajeZona(int zona, double sueldo){
        switch(zona){
            
        }*/
    }
}