package Assignment4;

public class Function1 implements IntegratorStrategy {

	@Override
	public double function(double x) {
		return Math.pow(2, -Math.pow(x, 2));

	}


}
