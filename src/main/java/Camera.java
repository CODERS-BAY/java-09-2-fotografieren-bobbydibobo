import java.util.ArrayList;
import java.util.Scanner;

public class Camera {

    Scanner scan = new Scanner(System.in);

    //variables
    private String brand;
    private Double megapixel;
    private Double displaySize;
    private Boolean colored;
    private Lens lens;

    public static int amountCameras = 0;

    //Getter & Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(Double megapixel) {
        this.megapixel = megapixel;
    }

    public Double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(Double displaySize) {
        this.displaySize = displaySize;
    }

    public Boolean getColored() {
        return colored;
    }

    public void setColored(Boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    //Constructor
    public Camera(String brand, Double megapixel, Double displaySize, Boolean colored) {
        this.brand = brand;
        this.megapixel = megapixel;
        this.displaySize = displaySize;
        this.colored = colored;

        amountCameras++;
    }

    public Camera(String brand, Double megapixel, Double displaySize, Boolean colored, Lens lens) {
        this.brand = brand;
        this.megapixel = megapixel;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;
    }

    //methods
    public void printAmountCameras(){
        System.out.println("The amount of cameras you got is: " +  amountCameras);
    }



    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megapixel=" + megapixel +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                '}';
    }
}
