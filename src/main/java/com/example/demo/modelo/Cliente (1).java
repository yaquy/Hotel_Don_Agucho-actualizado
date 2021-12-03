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
@Table(name = "CLIENTES")
@XmlRootElement
@NamedQueries({
	   	 @NamedQuery(name = "Funciones.findAll", query = "SELECT c FROM CLIENTES c")
	   , @NamedQuery(name = "Funciones.findByCLI_ID", query = "SELECT c FROM CLIENTES c WHERE c.CLI_ID = :CLI_ID")
	   , @NamedQuery(name = "Funciones.findByCLI_NOMBRES", query = "SELECT c FROM CLIENTES c WHERE c.CLI_NOMBRES = :CLI_NOMBRES")
	   , @NamedQuery(name = "Funciones.findByCLI_APELLIDO_PAT", query = "SELECT c FROM CLIENTES c WHERE c.CLI_APELLIDO_PAT= :CLI_APELLIDO_PAT")
	   , @NamedQuery(name = "Funciones.findByCLI_APELLIDO_MAT", query = "SELECT c FROM CLIENTES c WHERE c.CLI_APELLIDO_MAT = :CLI_APELLIDO_MAT")
	   , @NamedQuery(name = "Funciones.findByCLI_DIRECCION", query = "SELECT c FROM CLIENTES c WHERE c.CLI_DIRECCION= :CLI_DIRECCION")
	   , @NamedQuery(name = "Funciones.findByCLI_DNI", query = "SELECT c FROM CLIENTES c WHERE c.CLI_DNI= :CLI_DNI")
	   , @NamedQuery(name = "Funciones.findByCLI_CORREO", query = "SELECT c FROM CLIENTES c WHERE c.CLI_CORREO= :CLI_CORREO")
	   , @NamedQuery(name = "Funciones.findByCLI_TEL_MOVIL", query = "SELECT c FROM CLIENTES c WHERE c.CLI_TEL_MOVIL= :CLI_TEL_MOVIL")	   	 
})
public class Cliente implements Serializable {
		private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "CLI_ID")
	    private Integer CLI_ID;
	    @Basic(optional = false)
	    @Column(name = "CLI_NOMBRES")
	    private String CLI_NOMBRES;
	    @Basic(optional = false)
	    @Column(name = "CLI_APELLIDO_PAT")
	    private String CLI_APELLIDO_PAT;
	    @Basic(optional = false)
	    @Column(name = "CLI_APELLIDO_MAT")
	    private String CLI_APELLIDO_MAT;
	    @Basic(optional = false)
	    @Column(name = "CLI_DIRECCION")
	    private String CLI_DIRECCION;
	    @Basic(optional = false)
	    @Column(name = "CLI_DNI")
	    private String CLI_DNI;
	    @Basic(optional = false)
	    @Column(name = "CLI_CORREO")
	    private String CLI_CORREO;
	    @Basic(optional = false)
	    @Column(name = "CLI_TEL_MOVIL")
	    private String CLI_TEL_MOVIL;

	    public Cliente() {

		}

		public Integer getCLI_ID() {
			return CLI_ID;
		}

		public void setCLI_ID(Integer cLI_ID) {
			CLI_ID = cLI_ID;
		}

		public String getCLI_NOMBRES() {
			return CLI_NOMBRES;
		}

		public void setCLI_NOMBRES(String cLI_NOMBRES) {
			CLI_NOMBRES = cLI_NOMBRES;
		}

		public String getCLI_APELLIDO_PAT() {
			return CLI_APELLIDO_PAT;
		}

		public void setCLI_APELLIDO_PAT(String cLI_APELLIDO_PAT) {
			CLI_APELLIDO_PAT = cLI_APELLIDO_PAT;
		}

		public String getCLI_APELLIDO_MAT() {
			return CLI_APELLIDO_MAT;
		}

		public void setCLI_APELLIDO_MAT(String cLI_APELLIDO_MAT) {
			CLI_APELLIDO_MAT = cLI_APELLIDO_MAT;
		}

		public String getCLI_DIRECCION() {
			return CLI_DIRECCION;
		}

		public void setCLI_DIRECCION(String cLI_DIRECCION) {
			CLI_DIRECCION = cLI_DIRECCION;
		}

		public String getCLI_DNI() {
			return CLI_DNI;
		}

		public void setCLI_DNI(String cLI_DNI) {
			CLI_DNI = cLI_DNI;
		}

		public String getCLI_CORREO() {
			return CLI_CORREO;
		}

		public void setCLI_CORREO(String cLI_CORREO) {
			CLI_CORREO = cLI_CORREO;
		}

		public String getCLI_TEL_MOVIL() {
			return CLI_TEL_MOVIL;
		}

		public void setCLI_TEL_MOVIL(String cLI_TEL_MOVIL) {
			CLI_TEL_MOVIL = cLI_TEL_MOVIL;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
	    
	    
}