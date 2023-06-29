/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P2;

/**
 *
 * @author THANG
 */
public class PowerFunction {

  public static int power(int x, int n) {
    /*
     * Calculates the power of x to the nth power.
     *
     * Args:
     *   x: The base number.
     *   n: The exponent.
     *
     * Returns:
     *   The value of x^n.
     */

    if (n == 0) {
      return 1;
    } else if (n == 1) {
      return x;
    } else {
      return x * power(x, n - 1);
    }
  }

  public static void main(String[] args) {
    int x = 2;
    int n = 3;
    int result = power(x, n);
    System.out.println("2^3 = " + result);
  }
}