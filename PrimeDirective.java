// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number){
    //checking if numbers are more or equal to 2
    if (number >= 2) {
      for (int i = 2; i< number; i++) {
        //dividing the numbers between 2 and number -1
        if (number % i == 0) {
          return false;
        }else if (number == 2) {
          //2 is the smallest prime number
          return true;
        }
      }
      return true;
    }
    //if numbers are less than 2, they are not prime numbers
    else {
      return false;
    }
  }
  // creating a method to return a list of prime numbers
  public ArrayList<Integer> onlyPrimes(int[] numbers){
    // creating an empty list so as to apped the prime numbers to
    ArrayList<Integer> primes = new ArrayList<Integer>();
    //looping through each item of the input list
    for(int number : numbers){
      // using the method isPrime() to check if the number in numbers array list is prime or not
      if (isPrime(number) == true){
        primes.add(number);
      }
    }
    //returning the array list of prime numbers
    return primes;
  }
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));
    System.out.println(pd.onlyPrimes(numbers));

  }  

}
