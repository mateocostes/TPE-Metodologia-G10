import java.util.ArrayList;

public class Solicitud {
	private int horaInicio, horaFin;
	private ArrayList<Material> materiales;
	private float volumen;
	private Ciudadano ciudadano;
	private float distancia; //Se haría un mapeo para saber la distancia a la que está la solicitud

	public Solicitud(int horaInicio, int horaFin, float volumen, Ciudadano ciudadano, float distancia) {
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.volumen = volumen;
		this.ciudadano = ciudadano;
		this.distancia=distancia;
		this.materiales = new ArrayList<Material>();
	}

	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(int horaFin) {
		this.horaFin = horaFin;
	}
	public ArrayList<Material> getMateriales() {
		return materiales;
	}
	public void setMateriales(ArrayList<Material> materiales) {
		this.materiales = materiales;
	}
	public float getVolumen() {
		return volumen;
	}
	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	public Ciudadano getCiudadano() {
		return ciudadano;
	}
	
	public boolean equals(Solicitud s) {
		return this.ciudadano.getDireccion()==s.getCiudadano().getDireccion();
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}
	
}
