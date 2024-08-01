package source;

public class Suvat {
	private double s, u, v, a, t;
	
	public Suvat(double s, double u, double v, double a, double t) {
		this.s = s;
		this.u = u;
		this.v = v;
		this.a = a;
		this.t = t;
		
	}
	
	public void initialise() {
		if (Double.isNaN(s)) {
			calculateS();
		}
		if (Double.isNaN(u)) {
			calculateU();
		}
		if (Double.isNaN(v)) {
			calculateV();
		}
		if (Double.isNaN(a)) {
			calculateA();
		}
		if (Double.isNaN(t)) {
			calculateT();
		}
	}
	
	public void displayValues() {
		System.out.println("S: " + s + "m");
		System.out.println("U: " + u + "m/s");
		System.out.println("V: " + v + "m/s");
		System.out.println("A: " + a + "m/s^2");
		System.out.println("T: " + t + "s");
	}
	
	public double getS() {
		return s;
	}
	
	public boolean calculateS() {
		if (Double.isNaN(u)) {
			s = (v * t) - (0.5 * (a * t * t));
		}
		else if (Double.isNaN(v)) {
			s = (u * t) + (0.5 * (a * t * t));
		}
		else if (Double.isNaN(a)) {
			s = 0.5 * (u + v) * t;
		}
		else if (Double.isNaN(t)) {
			s = ((v * v) - (u * u)) / (2 * a);
		}
		else {
			s = (u * t) + (0.5 * (a * t * t));
		}
		return true;
	}
	
	public void setS(double s) {
		this.s = s;
	}
	
	
	public double getU() {
		return u;
	}
	
	public boolean calculateU() {
		if (Double.isNaN(s)) {
			u = v - (a * t);
		}
		else if (Double.isNaN(v)) {
			u = (s - (0.5 * a * t * t)) / t;
		}
		else if (Double.isNaN(a)) {
			u = ((2 * s) / t) - v;
		}
		else if (Double.isNaN(t)) {
			u = Math.sqrt((v*v) - (2 * a * s));
		}
		else {
			u = v - (a * t);
		}
		return true;
	}
	
	public void setU(double u) {
		this.u = u;
	}
	
	
	public double getV() {
		return v;
	}
	
	public boolean calculateV() {
		if (Double.isNaN(s)) {
			v = u + (a * t);
		}
		else if (Double.isNaN(u)) {
			v = (s + (0.5 * a * t * t)) / t;
		}
		else if (Double.isNaN(a)) {
			v = ((2 * s) / t) - u;
		}
		else if (Double.isNaN(t)) {
			v = Math.sqrt((u * u) + (2 * a * s));
		}
		else {
			v = u + (a * t);
		}
		return true;
	}
	
	public void setV(double v) {
		this.v = v;
	}
	
	
	public double getA() {
		return a;
	}
	
	public boolean calculateA() {
		if (Double.isNaN(s)) {
			a = (v - u) / t;
		}
		else if (Double.isNaN(u)) {
			a = (2 / (t * t)) * ((v * t) - s);
		}
		else if (Double.isNaN(v)) {
			a = (2 / (t * t)) * (s - (u * t));
		}
		else if (Double.isNaN(t)) {
			a = ((v * v) - (u * u)) / (2 * s);
		}
		else {
			a = (v - u) / t;
		}
		return true;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	
	public double getT() {
		return t;
	}
	
	public boolean calculateT() {
		if (Double.isNaN(s)) {
			t = (v - u) / a;
		}
		else if (Double.isNaN(u)) {
			t = (v + Math.sqrt((v * v) - (2 * a * s)) / a);
		}
		else if (Double.isNaN(v)) {
			t = (-u + Math.sqrt((u * u) + (2 * a * s)) / a);
		}
		else if (Double.isNaN(a)) {
			t = (2 * s) / (u + v);
		}
		else {
			t = (v - u) / a;
		}
		return true;
	}
	
	public void setT(double t) {
		this.t = t;
	}
}
