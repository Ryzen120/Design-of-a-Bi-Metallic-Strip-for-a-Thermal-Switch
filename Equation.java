import java.math.*;

/**
 * This class contains the needed method to perform calculations for solving for the curvature equation.
 * 
 * @author Robert Lenko
 * @date April 11, 2019
 * @version 1.0.1
 *
 */
public class Equation 
{

	//Delta T temperature held constant.
	private final double T = 10.0;
    
    //Final Curvature Result.
    private double k = 0.0;
	
    private double ymax = 0.0;
	
	//Constructor.
	public Equation(double E1, double E2, double H1, double H2, double Alpha1, double Alpha2)
	{
		
	}
	
	//Method call to perform the curvature calculation, taking on variables E1, E2, H1, H2, Alpha1, and Alpha2.
	public double curvatureSolver(double E1, double E2, double H1, double H2, double Alpha1, double Alpha2)
	{
		
		//Curvature Equation.
		k = (6 * E1 * E2 * (H1 + H1) * H1 * H2 * (Alpha1 - Alpha2) * T) / (Math.pow(E1, 2) * Math.pow(H1, 4) + 4 * E1 * E2 * Math.pow(H1, 3) * H2 + 6 * E1 * E2 * Math.pow(H1, 2) * Math.pow(H2, 2) + 4 * E1 * E2 * Math.pow(H2, 3) * H1 + Math.pow(E2, 2) * Math.pow(H2, 4));
		
		//Return our result.
		return k;
	}
	
	//Method call to perform the calculation for yMax based off of the previous method call for calculating k.
	public double yMax()
	{
		//Ymax equation.
		ymax = (k * Math.pow(3, 2)) / 2;
		
		//Return our result.
		return ymax;
	}
	
}
