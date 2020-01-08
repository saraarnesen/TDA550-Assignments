package Assignment4;

public class Function3 implements IntegratorStrategy{

	@Override
	public double function(double x) {
		return Math.sin(Math.sin(x)); 
	}

}
