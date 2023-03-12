import java.awt.event.*;
public interface VistaCuenta {
	String INGRESO = "INGRESO";
	String GASTO = "GASTO";
	String SALDO = "SALDO";
/** Obtenemos la cantidad a ingresar
*
@return double con la cantidad a ingresar
*/
	double obtenerCantidad();
/** Establecemos el saldo de la cuenta.
*
@param saldo double con el saldo de la cuenta.
*/
	void saldo(double saldo);
/** Mostramos un mensaje de información.
	