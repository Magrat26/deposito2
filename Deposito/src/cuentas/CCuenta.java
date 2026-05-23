package cuentas;

/**
 * Clase CCuenta es una cuenta de banco
 * @author Eva 
 * 
 */
public class CCuenta {

	    private String nombre;
	    private String cuenta;
	    private double saldo;
	    private double tipoInterés;

	    public CCuenta()
	    {
	    }
/**
 * constructor de cuenta
 * @param nom nombre
 * @param cue cuenta
 * @param sal  saldo 
 * @param tipo tipo de interes
 */
	    public CCuenta(String nom, String cue, double sal, double tipo)
	    {
	        nombre =nom;
	        cuenta=cue;
	        saldo=sal;
	    }
	    /**
		 * metodo estado 
		 * @return double saldo
		 */
	    public double estado()
	    {
	        return saldo;
	    }
	    /**
		 * metodo estado 
		 * @param double cantidad
		 * @return void
		 */
	    public void ingresar(double cantidad) throws Exception
	    {
	        if (cantidad<0)
	            throw new Exception("No se puede ingresar una cantidad negativa");
	        saldo = saldo + cantidad;
	    }
	    /**
		 * metodo retirar 
		 * @param double cantidad
		 * @return void
		 */
	    public void retirar(double cantidad) throws Exception
	    {
	        if (cantidad <= 0)
	            throw new Exception ("No se puede retirar una cantidad negativa");
	        if (estado()< cantidad)
	            throw new Exception ("No se hay suficiente saldo");
	        saldo = saldo - cantidad;
	    }
	    /**
	    * metodo getNombre
	   * devuelve el nombre
	    * */
		public String getNombre() {
			return nombre;
		}
	    /**
		    * metodo setNombre
		   * recibe nombre y lo asigna a nombre
		    * */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		    * metodo getCuenta
		   * devuelve el cuenta
		    * */
		public String getCuenta() {
			return cuenta;
		}
		/**
		    * metodo setCuenta
		   * recibe cuenta y lo asigna a cuenta
		    * */
		public void setCuenta(String cuenta) {
			this.cuenta = cuenta;
		}
		/**
		    * metodo getSaldo
		   * devuelve el saldo
		    * */
		public double getSaldo() {
			return saldo;
		}
		/**
		    * metodo setSaldo
		   * recibe saldo y lo asigna a saldo
		    * */
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		/**
		    * metodo getTipoInterés
		   * devuelve el tipoInterés
		    * */
		public double getTipoInterés() {
			return tipoInterés;
		}
		/**
		    * metodo setTipoInterés
		   * recibe setTipoInterés y lo asigna a setTipoInterés
		    * */
		public void setTipoInterés(double tipoInterés) {
			this.tipoInterés = tipoInterés;
		}
	    
	    
	}
	


