package FacitUppgift8;

public class TestIntegrator {
	
	public static void main(final String[] args) {
		final RealFunction f1 = new Function1();
		final Integrator integrator = new SimpsonsIntegrator(1000);
		System.out.println(integrator.integrate(f1, 10, 20));
	
		// Exempel med anonym klass, det typiska idiomet innan Java 8:
		final RealFunction fOld = new RealFunction() {
			@Override
			public double fun(double x) {
				return Math.cos(Math.sin(x));
			}
		};
		System.out.println(integrator.integrate(fOld, 10, 20));
		// Det mer korrekta för Java >= Java 8.
		// Skapar en anonym funktion via lambda closure, se t.ex. här:
		// http://tutorials.jenkov.com/java/lambda-expressions.html
		final RealFunction fNew = x -> Math.cos(Math.sin(x));
		System.out.println(integrator.integrate(fNew, 10, 20));

	}
}
