public class RNG {
    public static void main(String[] args) {
        int range = (100-1)+1;
        int[] numbers = new int[10];

        for(int i=0; i<10; i++)
            numbers[i] = (int)(Math.random() * range) + 1;

        for(int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        calcAvg(numbers);
    }

    private static void calcAvg(int[] numbers){
        double total=0;

        for(int i=0; i<numbers.length; i++){
            total+=numbers[i];
        }

        System.out.println("\nTotal is " +total+ "\n\nAverage is " + String.format("%.0f",(total/numbers.length)));
    }
}
