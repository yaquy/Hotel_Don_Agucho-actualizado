package com.example.demo.modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name = "HABITACIONES")
@XmlRootElement
@NamedQueries({
	   	 @NamedQuery(name = "Funciones.findAll", query = "SELECT h FROM HABITACIONES h")
	   , @NamedQuery(name = "Funciones.findByHAB_ID", query = "SELECT h FROM HABITACIONES h WHERE h.HAB_ID= :HAB_ID")
	   , @NamedQuery(name = "Funciones.findByHAB_NUMERO", query = "SELECT h FROM HABITACIONES h WHERE h.HAB_NUMERO = :HAB_NUMERO")
	   , @NamedQuery(name = "Funciones.findByHAB_OCUPADA", query = "SELECT h FROM HABITACIONES h WHERE h.HAB_OCUPADA= :HAB_OCUPADA")
	   , @NamedQuery(name = "Funciones.findByTIPO_HAB_ID", query = "SELECT h FROM HABITACIONES h WHERE h.TIPO_HAB_ID= :TIPO_HAB_ID")
})
public class Habitacion implements Serializable {
		private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "HAB_ID")
	    private Integer HAB_ID;
	    @Basic(optional = false)
	    @Column(name = "HAB_NUMERO")
	    private int HAB_NUMERO;
	    @Basic(optional = false)
	    @Column(name = "HAB_OCUPADA")
	    private String HAB_OCUPADA;
	    @Basic(optional = false)
	    @Column(name = "TIPO_HAB_ID")
	    private int TIPO_HAB_ID;
	    
	    
	    public Habitacion() {
	    	
	    }
	    
	    public Habitacion(Integer HAB_ID, int HAB_NUMERO, String HAB_OCUPADA, int TIPO_HAB_ID) {
	        this.HAB_ID = HAB_ID;
	        this.HAB_NUMERO= HAB_NUMERO;
	        this.HAB_OCUPADA = HAB_OCUPADA;
	        this.TIPO_HAB_ID = TIPO_HAB_ID;
	    }
	    
		public Integer getHAB_ID() {
			return HAB_ID;
		}
		public void setHAB_ID(Integer hAB_ID) {
			HAB_ID = hAB_ID;
		}
		public int getHAB_NUMERO() {
			return HAB_NUMERO;
		}
		public void setHAB_NUMERO(int hAB_NUMERO) {
			HAB_NUMERO = hAB_NUMERO;
		}
		public String getHAB_OCUPADA() {
			return HAB_OCUPADA;
		}
		public void setHAB_OCUPADA(String hAB_OCUPADA) {
			HAB_OCUPADA = hAB_OCUPADA;
		}
		public int getTIPO_HAB_ID() {
			return TIPO_HAB_ID;
		}
		public void setTIPO_HAB_ID(int tIPO_HAB_ID) {
			TIPO_HAB_ID = tIPO_HAB_ID;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    

}