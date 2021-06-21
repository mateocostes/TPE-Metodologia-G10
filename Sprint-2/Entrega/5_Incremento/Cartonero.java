import java.util.HashMap;

public class Cartonero {
	private int idCartonero;
	private HashMap<Material, Float> acopiado;
	
	public Cartonero(int id) {
		this.acopiado=new HashMap<Material, Float>();
		this.idCartonero=id;
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

}
