package com.eglobal.tramites.entity;
// default package
// Generated 11/01/2021 10:39:43 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblComerciosAdqId generated by hbm2java
 */
@Embeddable
public class TblComerciosAdqId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String noAfiliacion;
	private String idAdquirente;

	public TblComerciosAdqId() {
	}

	public TblComerciosAdqId(String noAfiliacion, String idAdquirente) {
		this.noAfiliacion = noAfiliacion;
		this.idAdquirente = idAdquirente;
	}

	@Column(name = "no_afiliacion", nullable = false, length = 8)
	public String getNoAfiliacion() {
		return this.noAfiliacion;
	}

	public void setNoAfiliacion(String noAfiliacion) {
		this.noAfiliacion = noAfiliacion;
	}

	@Column(name = "id_adquirente", nullable = false, length = 3)
	public String getIdAdquirente() {
		return this.idAdquirente;
	}

	public void setIdAdquirente(String idAdquirente) {
		this.idAdquirente = idAdquirente;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TblComerciosAdqId))
			return false;
		TblComerciosAdqId castOther = (TblComerciosAdqId) other;

		return ((this.getNoAfiliacion() == castOther.getNoAfiliacion()) || (this.getNoAfiliacion() != null
				&& castOther.getNoAfiliacion() != null && this.getNoAfiliacion().equals(castOther.getNoAfiliacion())))
				&& ((this.getIdAdquirente() == castOther.getIdAdquirente())
						|| (this.getIdAdquirente() != null && castOther.getIdAdquirente() != null
								&& this.getIdAdquirente().equals(castOther.getIdAdquirente())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNoAfiliacion() == null ? 0 : this.getNoAfiliacion().hashCode());
		result = 37 * result + (getIdAdquirente() == null ? 0 : this.getIdAdquirente().hashCode());
		return result;
	}

}
