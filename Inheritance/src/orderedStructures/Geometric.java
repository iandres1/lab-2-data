package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		current = current * commonFactor; 
		return current;
	}

	@Override
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = firstValue(); 
		for (int i=1; i<n; i++) 
			value = nextValue(); 
		return value; 
	}
	
	@Override
	public String toString() {
		return "Geom(" + (int) firstValue() + ", " + (int) commonFactor + ")";	
	}
	
	
}
