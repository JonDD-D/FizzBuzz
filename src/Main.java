public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        /* For the main thing, we can access it through a different way, by claiming the main(args)
        as shown in following
         */
        fizzBuzz.main(args);
        // THIS is for showing calling the function outside FizzBuzz.java class as mentioned inside
        // README.md file
        int i = 100;
        while (i<120){
            i = fizzBuzz.doFizzBuzz(i);
        }
    }
}
