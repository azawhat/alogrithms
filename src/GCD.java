/*

  findGCD - definition of function
  a, b - numbers to find GCD
  return  - returning gcd of b and modulus of a and b

*/

public class GCD {
    public static int findGCD(int a,int b){
        if (b==0)
            return a;
        else
            return findGCD(b, a%b);
    }
}
