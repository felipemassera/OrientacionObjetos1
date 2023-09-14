package ar.edu.unlp.info.oo1.Ejercicio7_MethodLookupConEmpleados;

public class RespuestasTeoricas {

}


/** 1- los metodos que se ejecutan cuando se envia el mensaje de AportesdeGerente;
 * 	primero se busca en  la clase gerente si existe el metodo aportes, como este existe en la clase se ejecuta
 * este metodo envia el mensaje <MONTO BASICO> , como la clase Gerente no conoce el mensaje, lo busca en la clase
 *  padre la clase padre (EmpleadoJerarquico) que esta inmediatamente en
 *  el nivel superior de la jerarquia, como esta clase no conoce el mesaje lo busca en la clase superior (Empleado),
 *  como conoce el metodo lo ejecuta, retornando el valor a la clase gerente (HEREDO SU COMPORTAMIENTO Y VARIABLE)
 * 
 * */

/**2- los valores que tendran las variables de aportesDeAlan() y sueldoBasicoDeAlan()
 *   	aportesDeAlan() = 57000*0.05;
 *   	sueldoBasicoAlan()= (35000+13500) + 8000;
 */
