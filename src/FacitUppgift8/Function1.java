package FacitUppgift8;

public class Function1 implements RealFunction {
	
	@Override
	public double fun(double x) {
		return Math.pow(2, -Math.pow(x, 2));
	}
}