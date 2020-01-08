package Assignment4;

public class Integrator  {
	
	private final int steps ; 
	
	public Integrator(int steps) {
		this.steps = steps ; 
	}
	
	public double integrate(IntegratorStrategy strat, double a, double b) {		
		double sum = 0.0;
		double previous = strat.function(a) ; 
		double delta = (b - a) / steps;
		for (int i = 1; i <= steps; i++) {
			double x = a + (b - a) * i / steps;
			double current = strat.function(x);
			// Compute the integral through Simpson’s 3/8 rule.
			sum += delta / 8
					* (previous + current + 3 * (strat.function((2 * (x - delta) + x) / 3.0) + strat.function((3 * x - delta) / 3.0)));
			previous = current;
		}
		return sum;
	}

	

}
