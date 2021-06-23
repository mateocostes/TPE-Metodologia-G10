
public class Material {

    private String nombre;
    private String descripcionMaterial;
    private String descripcionEntrega;

    public Material(String nombre,String descripcionMaterial, String descripcionEntrega) {
        this.nombre = nombre;
        this.descripcionEntrega = descripcionEntrega;
        this.descripcionMaterial= descripcionMaterial;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDescripcionEntrega() {
        return descripcionEntrega;
    }


    public void setDescripcionEntrega(String descripcionEntrega) {
        this.descripcionEntrega = descripcionEntrega;
    }

    @Override
    public boolean equals(Object obj){
        Material miMaterial = (Material) obj;
        return (this.nombre == miMaterial.getNombre());
    }

	public String getDescripcionMaterial() {
		return descripcionMaterial;
	}

	public void setDescripcionMaterial(String descripcionMaterial) {
		this.descripcionMaterial = descripcionMaterial;
	}
	
	public void setDescripciones(Material material){
		this.setDescripcionEntrega(material.getDescripcionEntrega());
		this.setDescripcionMaterial(material.getDescripcionMaterial());
	}
}