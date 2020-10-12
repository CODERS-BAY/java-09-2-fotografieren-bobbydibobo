import java.util.ArrayList;

public class CamWithLens {

   public Camera camera;
   public Lens lens;
   public ArrayList stock;

    public CamWithLens(Camera camera, Lens lens) {
        this.camera = camera;
        this.lens = lens;
    }

    public void addToArraylist (ArrayList list, CamWithLens camWLens){
        list.add(camWLens);
    }

    @Override
    public String toString() {
        return "CamWithLens{" +
                "camera=" + camera +
                ", lens=" + lens +
                '}';
    }
}
