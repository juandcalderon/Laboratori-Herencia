/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Xiomara
 */
public class Estudiante extends Persona{
    protected int numMaterias;
    protected String carnet;
     protected double prom;
     private int notas;
 
      public Estudiante() {
       
    }
    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }
    public Estudiante(String nombre, String apellido, int edad, int peso,
int numMaterias,String carnet, double prom){
        super(nombre, apellido, edad, peso);
        this.numMaterias=numMaterias;
        this.carnet=carnet;
    }


    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
   
    public Estudiante datosestud()
    {
Estudiante unestudiante= new Estudiante();
String nombre = "";
String apellido = "";   
int edad = 0;
double peso = 0.0;
int numMaterias=0;
String carnet;
double prom;
nombre = leerDatoTipoCadena("Ingrese el nombre del alumno: ");
apellido = leerDatoTipoCadena("Ingrese el apellido del alumno: ");
edad = leerDatoTipoEntero("Ingrese la edad del alumno: ");
peso = leerDatoTipoReal("Ingrese el peso del alumno: ");
carnet=leerDatoTipoCadena("ingrese el numero de serie del carnet");
numMaterias=leerDatoTipoEntero("Ingresar el numero de materias");
unestudiante.setApellido(apellido);
unestudiante.setCarnet(carnet);
unestudiante.setEdad(edad);
unestudiante.setNombre(nombre);
unestudiante.setNumMaterias(numMaterias);
unestudiante.setPeso(peso);

return (unestudiante);
    }
public void imprimirdatosEstud(double notas){
    imprimirDatosPersona();
    JOptionPane.showMessageDialog(null,"el numero de serie del carnet es"+"\n"
            +carnet+"\n"+
            "su promedio es de:"+notas);
            
}

    
}
