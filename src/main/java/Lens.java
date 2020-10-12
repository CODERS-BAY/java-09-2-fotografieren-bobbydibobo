import java.util.Scanner;

public class Lens {

    Scanner scan = new Scanner(System.in);

    // variables
    private Double minFocalLength;
    private Double maxFocalLength;

    public static int amountLenses = 0;

    //Getter & Setter
    public Double getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(Double minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public Double getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(Double maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    //Constructor
    public Lens(Double minFocalLength, Double maxFocalLength) {
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;


        if (minFocalLength > maxFocalLength) {
            System.out.println("Your max focal length needs to be bigger than your min! Determine max again!");
            Double maxNew = scan.nextDouble();
            while (minFocalLength > maxNew) {
                System.out.println("Stop trolling dumbfuck! And again:");
                maxNew = scan.nextDouble();
            }
            maxFocalLength = maxNew;
            amountLenses++;
        } else{
            amountLenses++;
        }

    }

    //methods

    public void printAmountLenses(){
        System.out.println("The amount of lenses you got is: " +  amountLenses);
    }


    @Override
    public String toString() {
        return "Lens{" +
                "minFocalLength=" + minFocalLength +
                ", maxFocalLength=" + maxFocalLength +
                '}';
    }
}
