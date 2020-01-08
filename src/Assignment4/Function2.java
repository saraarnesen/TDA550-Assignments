package Assignment4;

public class Function2 implements IntegratorStrategy {

	@Override
	public double function(double x) {
		return Math.pow(x, x);
	}

}
