import java.util.HashMap;

public class Cartonero {
	private int idCartonero;
	private HashMap<Material, Float> acopiado;
	private String nombre;
	private int telefono;
	private String direccion;
	private String categoriaVehiculo;

	public Cartonero(int id, String categoriaVehiculo, String nombre, String direccion) {
		this.acopiado=new HashMap<Material, Float>();
		this.idCartonero=id;
		this.categoriaVehiculo = categoriaVehiculo;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Cartonero(int id, String categoriaVehiculo, String nombre, String direccion, int telefono) {
		this.acopiado=new HashMap<Material, Float>();
		this.idCartonero=id;
		this.categoriaVehiculo = categoriaVehiculo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public void acopiar(Material mat, Float peso) {
		if(this.acopiado.containsKey(mat))
			this.acopiado.replace(mat, this.acopiado.get(mat)+peso);
		else
			this.acopiado.put(mat, peso);
	}

	public int getIdCartonero() {
		return idCartonero;
	}

	public void setCategoriaVehiculo(String categoriaVehiculo){
		this.categoriaVehiculo = categoriaVehiculo;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public void setTelefono(int telefono){
		this.telefono = telefono;
	}

	public String getCategoriaVehiculo(){
		return this.categoriaVehiculo;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getDireccion(){
		return this.direccion;
	}

	public int getTelefono(){
		return this.telefono;
	}

}
