package com.eglobal.tramites.entity;
// default package
// Generated 11/01/2021 10:39:43 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TblComerciosAdq generated by hbm2java
 */
@Entity
@Table(name = "tbl_comercios_adq", schema = "dbo", catalog = "Catalogos_adq")
public class TblComerciosAdq implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TblComerciosAdqId id;
	private String razonSocial;
	private String calleNo;
	private String colonia;
	private String ciudad;
	private String codEstado;
	private String codPostal;
	private String telefono1;
	private String idGiro;
	private String statusReg;
	private String idSucursal;
	private String feAlta;
	private String plataforma;
	private String catCred;
	private String catDeb;
	private String contacto;
	private String noTerm;
	private String dirWeb;
	private String email;
	private String marcaProm;
	private String idGrupo;
	private String cadena;
	private String marcaPropia;
	private String tipoCom;
	private Character idTasaDeb;
	private Character idAutDigitar;
	private Character idLimPiso;
	private String impLimPiso;
	private String califCom;
	private Character banCash;
	private Character banAntad;
	private Character banMoto;
	private String motoCashMpLs;
	private String motoCashDebLs;
	private String motoCashCredLs;
	private String marcaFimpe;
	private Character ban5;
	private Integer idPromocion;
	private Character fonacot;
	private Character idDcc;

	public TblComerciosAdq() {
	}

	public TblComerciosAdq(TblComerciosAdqId id) {
		this.id = id;
	}

	public TblComerciosAdq(TblComerciosAdqId id, String razonSocial, String calleNo, String colonia, String ciudad,
			String codEstado, String codPostal, String telefono1, String idGiro, String statusReg, String idSucursal,
			String feAlta, String plataforma, String catCred, String catDeb, String contacto, String noTerm,
			String dirWeb, String email, String marcaProm, String idGrupo, String cadena, String marcaPropia,
			String tipoCom, Character idTasaDeb, Character idAutDigitar, Character idLimPiso, String impLimPiso,
			String califCom, Character banCash, Character banAntad, Character banMoto, String motoCashMpLs,
			String motoCashDebLs, String motoCashCredLs, String marcaFimpe, Character ban5, Integer idPromocion,
			Character fonacot, Character idDcc) {
		this.id = id;
		this.razonSocial = razonSocial;
		this.calleNo = calleNo;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.codEstado = codEstado;
		this.codPostal = codPostal;
		this.telefono1 = telefono1;
		this.idGiro = idGiro;
		this.statusReg = statusReg;
		this.idSucursal = idSucursal;
		this.feAlta = feAlta;
		this.plataforma = plataforma;
		this.catCred = catCred;
		this.catDeb = catDeb;
		this.contacto = contacto;
		this.noTerm = noTerm;
		this.dirWeb = dirWeb;
		this.email = email;
		this.marcaProm = marcaProm;
		this.idGrupo = idGrupo;
		this.cadena = cadena;
		this.marcaPropia = marcaPropia;
		this.tipoCom = tipoCom;
		this.idTasaDeb = idTasaDeb;
		this.idAutDigitar = idAutDigitar;
		this.idLimPiso = idLimPiso;
		this.impLimPiso = impLimPiso;
		this.califCom = califCom;
		this.banCash = banCash;
		this.banAntad = banAntad;
		this.banMoto = banMoto;
		this.motoCashMpLs = motoCashMpLs;
		this.motoCashDebLs = motoCashDebLs;
		this.motoCashCredLs = motoCashCredLs;
		this.marcaFimpe = marcaFimpe;
		this.ban5 = ban5;
		this.idPromocion = idPromocion;
		this.fonacot = fonacot;
		this.idDcc = idDcc;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "noAfiliacion", column = @Column(name = "no_afiliacion", nullable = false, length = 8)),
			@AttributeOverride(name = "idAdquirente", column = @Column(name = "id_adquirente", nullable = false, length = 3)) })
	public TblComerciosAdqId getId() {
		return this.id;
	}

	public void setId(TblComerciosAdqId id) {
		this.id = id;
	}

	@Column(name = "razon_social", length = 25)
	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Column(name = "calle_no", length = 30)
	public String getCalleNo() {
		return this.calleNo;
	}

	public void setCalleNo(String calleNo) {
		this.calleNo = calleNo;
	}

	@Column(name = "colonia", length = 30)
	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	@Column(name = "ciudad", length = 13)
	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "cod_estado", length = 2)
	public String getCodEstado() {
		return this.codEstado;
	}

	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}

	@Column(name = "cod_postal", length = 5)
	public String getCodPostal() {
		return this.codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	@Column(name = "telefono_1", length = 13)
	public String getTelefono1() {
		return this.telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	@Column(name = "id_giro", length = 4)
	public String getIdGiro() {
		return this.idGiro;
	}

	public void setIdGiro(String idGiro) {
		this.idGiro = idGiro;
	}

	@Column(name = "status_reg", length = 2)
	public String getStatusReg() {
		return this.statusReg;
	}

	public void setStatusReg(String statusReg) {
		this.statusReg = statusReg;
	}

	@Column(name = "id_sucursal", length = 4)
	public String getIdSucursal() {
		return this.idSucursal;
	}

	public void setIdSucursal(String idSucursal) {
		this.idSucursal = idSucursal;
	}

	@Column(name = "fe_alta", length = 4)
	public String getFeAlta() {
		return this.feAlta;
	}

	public void setFeAlta(String feAlta) {
		this.feAlta = feAlta;
	}

	@Column(name = "plataforma", length = 3)
	public String getPlataforma() {
		return this.plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Column(name = "cat_cred", length = 2)
	public String getCatCred() {
		return this.catCred;
	}

	public void setCatCred(String catCred) {
		this.catCred = catCred;
	}

	@Column(name = "cat_deb", length = 2)
	public String getCatDeb() {
		return this.catDeb;
	}

	public void setCatDeb(String catDeb) {
		this.catDeb = catDeb;
	}

	@Column(name = "contacto", length = 30)
	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@Column(name = "no_term", length = 4)
	public String getNoTerm() {
		return this.noTerm;
	}

	public void setNoTerm(String noTerm) {
		this.noTerm = noTerm;
	}

	@Column(name = "dir_web", length = 30)
	public String getDirWeb() {
		return this.dirWeb;
	}

	public void setDirWeb(String dirWeb) {
		this.dirWeb = dirWeb;
	}

	@Column(name = "email", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "marca_prom", length = 2)
	public String getMarcaProm() {
		return this.marcaProm;
	}

	public void setMarcaProm(String marcaProm) {
		this.marcaProm = marcaProm;
	}

	@Column(name = "id_grupo", length = 6)
	public String getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(String idGrupo) {
		this.idGrupo = idGrupo;
	}

	@Column(name = "cadena", length = 6)
	public String getCadena() {
		return this.cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	@Column(name = "marca_propia", length = 2)
	public String getMarcaPropia() {
		return this.marcaPropia;
	}

	public void setMarcaPropia(String marcaPropia) {
		this.marcaPropia = marcaPropia;
	}

	@Column(name = "tipo_com", length = 2)
	public String getTipoCom() {
		return this.tipoCom;
	}

	public void setTipoCom(String tipoCom) {
		this.tipoCom = tipoCom;
	}

	@Column(name = "id_tasa_deb", length = 1)
	public Character getIdTasaDeb() {
		return this.idTasaDeb;
	}

	public void setIdTasaDeb(Character idTasaDeb) {
		this.idTasaDeb = idTasaDeb;
	}

	@Column(name = "id_aut_digitar", length = 1)
	public Character getIdAutDigitar() {
		return this.idAutDigitar;
	}

	public void setIdAutDigitar(Character idAutDigitar) {
		this.idAutDigitar = idAutDigitar;
	}

	@Column(name = "id_lim_piso", length = 1)
	public Character getIdLimPiso() {
		return this.idLimPiso;
	}

	public void setIdLimPiso(Character idLimPiso) {
		this.idLimPiso = idLimPiso;
	}

	@Column(name = "imp_lim_piso", length = 5)
	public String getImpLimPiso() {
		return this.impLimPiso;
	}

	public void setImpLimPiso(String impLimPiso) {
		this.impLimPiso = impLimPiso;
	}

	@Column(name = "calif_com", length = 8)
	public String getCalifCom() {
		return this.califCom;
	}

	public void setCalifCom(String califCom) {
		this.califCom = califCom;
	}

	@Column(name = "ban_cash", length = 1)
	public Character getBanCash() {
		return this.banCash;
	}

	public void setBanCash(Character banCash) {
		this.banCash = banCash;
	}

	@Column(name = "ban_antad", length = 1)
	public Character getBanAntad() {
		return this.banAntad;
	}

	public void setBanAntad(Character banAntad) {
		this.banAntad = banAntad;
	}

	@Column(name = "ban_moto", length = 1)
	public Character getBanMoto() {
		return this.banMoto;
	}

	public void setBanMoto(Character banMoto) {
		this.banMoto = banMoto;
	}

	@Column(name = "moto_cash_mp_ls", length = 5)
	public String getMotoCashMpLs() {
		return this.motoCashMpLs;
	}

	public void setMotoCashMpLs(String motoCashMpLs) {
		this.motoCashMpLs = motoCashMpLs;
	}

	@Column(name = "moto_cash_deb_ls", length = 5)
	public String getMotoCashDebLs() {
		return this.motoCashDebLs;
	}

	public void setMotoCashDebLs(String motoCashDebLs) {
		this.motoCashDebLs = motoCashDebLs;
	}

	@Column(name = "moto_cash_cred_ls", length = 5)
	public String getMotoCashCredLs() {
		return this.motoCashCredLs;
	}

	public void setMotoCashCredLs(String motoCashCredLs) {
		this.motoCashCredLs = motoCashCredLs;
	}

	@Column(name = "marca_fimpe", length = 2)
	public String getMarcaFimpe() {
		return this.marcaFimpe;
	}

	public void setMarcaFimpe(String marcaFimpe) {
		this.marcaFimpe = marcaFimpe;
	}

	@Column(name = "ban_5", length = 1)
	public Character getBan5() {
		return this.ban5;
	}

	public void setBan5(Character ban5) {
		this.ban5 = ban5;
	}

	@Column(name = "id_promocion")
	public Integer getIdPromocion() {
		return this.idPromocion;
	}

	public void setIdPromocion(Integer idPromocion) {
		this.idPromocion = idPromocion;
	}

	@Column(name = "fonacot", length = 1)
	public Character getFonacot() {
		return this.fonacot;
	}

	public void setFonacot(Character fonacot) {
		this.fonacot = fonacot;
	}

	@Column(name = "ID_DCC", length = 1)
	public Character getIdDcc() {
		return this.idDcc;
	}

	public void setIdDcc(Character idDcc) {
		this.idDcc = idDcc;
	}

}
