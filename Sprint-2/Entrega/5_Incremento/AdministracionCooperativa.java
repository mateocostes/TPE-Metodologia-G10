import java.util.ArrayList;

public class AdministracionCooperativa {
	private String usuario, contrasenia;
	private String direccionCooperativa;
	private ArrayList<Solicitud> solicitudes;
	private ArrayList<Material> materiales;
	private Criterio critAceptacion; //implementar
	private boolean logueado;
	private ArrayList<Cartonero> cartoneros;
	
	public AdministracionCooperativa(String direccion, Criterio crit, String usuario, String contrasenia) {
		this.solicitudes= new ArrayList<Solicitud>();
		this.direccionCooperativa=direccion;
		this.critAceptacion=crit;
		this.materiales= new ArrayList<Material>();
		this.usuario=usuario;
		this.contrasenia=contrasenia;
		this.logueado=false;
	}

	public ArrayList<Solicitud> mostrarListaSolicitudes() { //Tarea: devolver la lista de solicitudes
		ArrayList<Solicitud> nuevaLista = new ArrayList<Solicitud>();
		if (logueado) 
			for (Solicitud s: this.solicitudes)
				nuevaLista.add(s);
		return nuevaLista;
	}
	
	public void addMaterial(Material material){
		if (logueado)
			if (!materiales.contains(material))
				materiales.add(material);
	}

    public void removeMaterial(Material material){
    	if (logueado) 
	        if (materiales.contains(material))
	            materiales.remove(material);
    }
    
    public void modificarMaterial(String nombre, String descripcionEntrega, String descripcionMaterial) {
    	if (logueado) 
	    	for(Material mat: this.materiales) {
	    		if(mat.getNombre()==nombre) {
	    			mat.setDescripcionEntrega(descripcionEntrega);
	    			mat.setDescripcionMaterial(descripcionMaterial);
	    		}
	    	}
    }

	public boolean addSolicitud(Solicitud s) {
		ArrayList<Material> matAux= s.getMateriales();
		for(Material mat: matAux)
			if(!matAux.contains(mat))
				return false;
		boolean cumpleCriterio= this.critAceptacion.evaluar(s);
		if(cumpleCriterio)
			this.solicitudes.add(s);
		return true;
	}
	
	public void removeSolicitud(Solicitud s) {
		if (logueado) 
			this.solicitudes.remove(s);
	}
	
	public String getDireccionCooperativa() {
		return direccionCooperativa;
	}

	public Criterio getCritAceptacion() {
		return critAceptacion;
	}

	public void setCritAceptacion(Criterio critAceptacion) {
		if (logueado) 
			this.critAceptacion = critAceptacion;
	}
	
	public void cambiarUsuarioYContrasenia(String usuario, String contrasenia) {
		if (logueado) {
			this.usuario=usuario;
			this.contrasenia=contrasenia;
		}
	}
	
	public void logIn(String usuario, String contra){
		this.logueado=(usuario.equals(this.usuario)&&contra.equals(this.contrasenia));
	}
	
	public void acopiarCartonero(Material mat, Float peso, int idCart) {
		if (logueado)
			for(Cartonero c: cartoneros) {
				if(c.getIdCartonero()==idCart) {
					c.acopiar(mat, peso);
					break;
				}
			}
	}
}
