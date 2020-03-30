package herencia;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
* Clase Java para implementar un cliente
* que emplea la jerarquía de herencia de la persona,
* el empleado y el estudiante para mostrar los cálculos
* de cada uno de los respectivos procesos implementados
* por cada clase
*/
public class SistemaInformacion
{
/********************************/
/********************************/
/********************************/
//Constructor de la clase
public SistemaInformacion() {
// TODO Auto-generated constructor stub
}
/**
* @param args
*/
public static void main(String[] args)
{

int opcion = 0;
Persona sistemaInformacion = new Persona();
try
{
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
do{

opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado\n, la opcion 2 para procesar datos de estudiantes \n y  3 para salir: ");
if (opcion == 1)
{
JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
Empleado manejadorEmpleado = new Empleado();
//Leemos los datos
manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
manejadorEmpleado.imprimirReporteEstadoEmpleado();
}
else if(opcion == 2){
    JOptionPane.showMessageDialog(null,"Procesando datos del alumno");
Estudiante alumno = new Estudiante();
//Leemos los datos
alumno=alumno.datosestud();
int not,cot=0,notas,asig=1;
        for(int i=0;i<alumno.getNumMaterias();i++){
            not=Integer.parseInt(JOptionPane.showInputDialog("digite la nota"+asig));
            cot=cot+not;
            asig++;
        }
        notas=cot/alumno.getNumMaterias();
 alumno.imprimirdatosEstud(notas);
}
if (opcion == 3)
{
JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
break ;
}

} while (opcion != 1 || opcion != 3 || opcion !=2 );//fin del do-while
}//Fin del try
catch (Exception errorMain)
{
JOptionPane.showMessageDialog(null,"Error en la digitación: ");
errorMain.printStackTrace();
}
/********************************/
}


}


