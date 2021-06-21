import java.util.HashMap;

public class Cartonero {
	private HashMap<Material, Float> acopiado;
	
	public Cartonero() {
		this.acopiado=new HashMap<Material, Float>();
	}
	
	public void acopiar(Material mat, Float peso) {
		if(this.acopiado.containsKey(mat))
			this.acopiado.replace(mat, this.acopiado.get(mat)+peso);
		else
			this.acopiado.put(mat, peso);
	}
}
