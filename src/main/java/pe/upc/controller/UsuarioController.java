package pe.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

import pe.upc.business.UsuarioBusiness;
import pe.upc.business.PaisBusiness;
import pe.upc.model.entity.Usuario;
import pe.upc.model.entity.Pais;
import pe.upc.util.Message;

@Named
@SessionScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioBusiness usuarioBusiness;

	@Inject
	private PaisBusiness paisBusiness;

	private Usuario usuario;
	private List<Usuario> usuarios;
	private Usuario usuarioselect;

	private Pais pais;
	private List<Pais> paises;

	private String filterName;

	@PostConstruct
	public void init() {
		usuario = new Usuario();
		usuarios = new ArrayList<Usuario>();

		pais = new Pais();
		paises = new ArrayList<>();

		getAllUsuarios();
	}

	public void getAllUsuarios() {
		try {
			usuarios = usuarioBusiness.getAll();
		} catch (Exception e) {	
			Message.messageError("Error Carga de Productos :" + e.getMessage());
		}
	}

	public String newUsuario() {

		try {
			this.paises = paisBusiness.getAll();

			resetForm();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return "insert.xhtml";
	}

	public String listUsuario() {
		return "list.xhtml";
	}

	public String saveUsuario() {
		String view = "";
		try {

			if (usuario.getIdUsuario()!= 0) {
				usuario.setPaisUsuario(pais);;
				usuarioBusiness.update(usuario);
				Message.messageInfo("Registro actualizado exitosamente");
			} else {
				usuario.setPaisUsuario(pais);
				usuarioBusiness.insert(usuario);
				Message.messageInfo("Registro guardado exitosamente");

			}
			this.getAllUsuarios();
			resetForm();
			view = "list";
		} catch (Exception e) {
			Message.messageError("Error Usuario :" + e.getStackTrace());
		}

		return view;
	}

	public String editUsuario() {
		String view = "";
		try {
			if (this.usuarioselect != null) {
				this.usuario = usuarioselect;

				view = "/usuario/update";
			} else {
				Message.messageInfo("Debe seleccionar un usuario");
			}
		} catch (Exception e) {
			Message.messageError("Error Usuario :" + e.getMessage());
		}

		return view;
	}

	public void searchUsuarioByCorreo() {
		try {

			usuarios = usuarioBusiness.getAllByCorreo(this.filterName.trim());
			resetForm();
			if (usuarios.isEmpty()) {
				Message.messageInfo("No se encontraron usuarios");

			}

		} catch (Exception e) {
			Message.messageError("Error Usuario Search :" + e.getMessage());
		}
	}

	public void selectUsuario(SelectEvent e) {
		this.usuarioselect = (Usuario) e.getObject();
	}

	public void resetForm() {
		this.filterName = "";
		this.usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuarioSelect() {
		return usuarioselect;
	}

	public void setUsuarioSelect(Usuario usuarioselec) {
		this.usuarioselect = usuarioselec;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFilterName() {
		return filterName;
	}

	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Pais> getPaises() {
		return paises;
	}

	public void setPaises(List<Pais> paises) {
		this.paises = paises;
	}
	
	
}
