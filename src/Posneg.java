
public class Posneg {
	
		public boolean posNeg(int a, int b, boolean negative) 
		{
			  if (negative && a < 0 && b < 0)
			  {
			    System.out.println("true");
			  }
			  else if (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0)))
			  {
				  System.out.println("true");
		      }
			  return false;
	     }
	}

