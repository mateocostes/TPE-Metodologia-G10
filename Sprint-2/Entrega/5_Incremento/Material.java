
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

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionEntrega(String descripcionEntrega) {
        this.descripcionEntrega = descripcionEntrega;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public Material getCopia(){
        Material materialCopia = new Material(this.nombre, this.descripcionMaterial, this.descripcionEntrega);
        return materialCopia;
    }

    @Override
    public boolean equals(Object obj){
        Material miMaterial = (Material) obj;
        return (this.nombre == miMaterial.getNombre());
    }

}
