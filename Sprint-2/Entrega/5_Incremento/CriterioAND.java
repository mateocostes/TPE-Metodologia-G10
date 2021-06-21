

public class CriterioAND implements Criterio{
	private Criterio c1;
	private Criterio c2;
	
	public CriterioAND(Criterio c1, Criterio c2) {
		this.c1=c1;
		this.c2=c2;
	}
	
	public boolean evaluar(Solicitud s) {
		return (c1.evaluar(s) && c2.evaluar(s));
	}
}
