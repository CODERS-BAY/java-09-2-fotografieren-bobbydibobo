import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<CamWithLens> cameraArrayList = new ArrayList<>();


        Lens lens1 = new Lens(2.8, 800.0);
        Lens lens2 = new Lens(4.8, 400.0);
        Lens lens3 = new Lens(8.8, 600.0);


        Camera cam1 = new Camera("Nikon", 22.5, 5.4, true);
        Camera cam2 = new Camera("Sony", 18.2, 7.4, false);
        Camera cam3 = new Camera("Canon", 28.8, 8.4, true);

       CamWithLens cam1xLens1 = new CamWithLens(cam1, lens1);
       CamWithLens cam2xLens2 = new CamWithLens(cam2, lens2);
       CamWithLens cam3xLens3 = new CamWithLens(cam3, lens3);

       cam1xLens1.addToArraylist(cameraArrayList, cam1xLens1);
       cam2xLens2.addToArraylist(cameraArrayList, cam2xLens2);
       cam3xLens3.addToArraylist(cameraArrayList, cam3xLens3);

        for (int i = 0; i < cameraArrayList.size(); i++){
            System.out.println(cameraArrayList.get(i));
        }

        cam3xLens3 = new CamWithLens(cam3, lens1);

        System.out.println(cam3xLens3); //change lens

        cam3.printAmountCameras();
        lens3.printAmountLenses();
    }

}
