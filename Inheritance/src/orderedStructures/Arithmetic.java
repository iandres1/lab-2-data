package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() {
		current = current + commonDifference; 
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
		return "Arith(" + (int) firstValue() + ", " + (int) commonDifference + ")";
	}

}
