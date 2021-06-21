import java.util.ArrayList;

public class AdministracionCooperativa {
	private String direccionCooperativa;
	private ArrayList<Solicitud> solicitudes;
	private ArrayList<Material> materiales;
	private Criterio critAceptacion; //implementar
	
	public AdministracionCooperativa(String direccion, Criterio crit) {
		this.solicitudes= new ArrayList<Solicitud>();
		this.direccionCooperativa=direccion;
		this.critAceptacion=crit;
		this.materiales= new ArrayList<Material>();
	}

	public ArrayList<Solicitud> mostrarListaSolicitudes() { //Tarea: devolver la lista de solicitudes
		ArrayList<Solicitud> nuevaLista = new ArrayList<Solicitud>();
		for (Solicitud s: this.solicitudes)
			nuevaLista.add(s);
		return nuevaLista;
	}
	
	public void addMaterial(Material material){
       if (!materiales.contains(material)) {
           materiales.add(material);
       }
    }

    public void removeMaterial(Material material){
        if (materiales.contains(material)){
            materiales.remove(material);
        }
    }
    
    public void modificarMaterial(String nombre, String descripcionEntrega, String descripcionMaterial) {
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
		this.solicitudes.remove(s);
	}
	
	public String getDireccionCooperativa() {
		return direccionCooperativa;
	}

	public void setDireccionCooperativa(String direccionCooperativa) {
		this.direccionCooperativa = direccionCooperativa;
	}

	public Criterio getCritAceptacion() {
		return critAceptacion;
	}

	public void setCritAceptacion(Criterio critAceptacion) {
		this.critAceptacion = critAceptacion;
	}
	
}
