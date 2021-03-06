package com.mario.pojo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private int idusuario;
	private String usuario;
	private String clave;
	private String permiso;
	private Timestamp fechaCreacion;
	
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getPermiso() {
		return permiso;
	}
	
	public void setPermiso(String permiso) {
		this.permiso = permiso;
	}
	
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", usuario=" + usuario
				+ ", clave=" + clave + ", fechaCreacion=" + fechaCreacion + "]";
	}
	
	

}
