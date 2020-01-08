package FacitUppgift8;

public class SimpsonsIntegrator implements Integrator {
	private final int steps;

	public SimpsonsIntegrator(int steps) {
		this.steps = steps;
	}

	public double integrate(RealFunction f, double a, double b) {
		double sum = 0.0;
		double previous = f.fun(a);
		double delta = (b - a) / this.steps;
		for (int i = 1; i <= this.steps; i++) {
			double x = a + (b - a) * i / this.steps;
			double current = f.fun(x);
			/* Compute the integral through Simpson’s 3/8 rule. */
			sum += delta / 8
					* (previous + current + 3 * (f.fun((2 * (x - delta) + x) / 3.0) + f.fun((3 * x - delta) / 3.0)));
			previous = current;
		}
		return sum;
	}

	
}