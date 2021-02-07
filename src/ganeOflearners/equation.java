package ganeOflearners;
import java.util.Scanner;

public class equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getting values from the user 
				//values cannot be zero because it will turn the quadratic equation into linear
				Scanner values = new Scanner (System.in);
				System.out.print("Enter the value of a: " );
				double anum=values.nextDouble();
				System.out.print("Enter the value of b: " );
				double bnum=values.nextDouble();
				System.out.print("Enter the value of c: " );
				double cnum=values.nextDouble();
				//solving the quadratic equation
				double root_part =Math.sqrt(bnum *bnum-4.0*anum*cnum);
				double denom=2*anum;
				double rootA=(-bnum+root_part)/denom;
				double rootB=(-bnum-root_part)/denom;
				//printing the results
				System.out.print("Root A  is : " +rootA);
				System.out.println("Root B is: "+rootB);
		System.out.println("The answer is :" +getx( rootA, rootB));
		        
		    }
	public static double getx(double rootA, double rootB){
        if(rootB>rootA){
            return rootB;
        }
        return rootA;
    }

	}

}
