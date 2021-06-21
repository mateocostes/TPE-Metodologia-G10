

public class CriterioDistancia implements Criterio{
	private float distancia;
	
	public CriterioDistancia(float dis) {
		this.distancia=dis;
	}
	public float getDistancia() {
		return distancia;
	}
	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	
	@Override
	public boolean evaluar(Solicitud s) {
		return this.distancia<=s.getDistancia(); //evaluar distancia de Solicitud. A pensar
	}
}
