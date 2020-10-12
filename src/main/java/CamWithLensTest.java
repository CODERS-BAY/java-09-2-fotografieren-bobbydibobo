import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class CamWithLensTest {

    @Test
    void testAddToArraylist(){

        ArrayList<CamWithLens> camarray= new ArrayList<>();

        Lens lens1 = new Lens(2.8, 800.0);
        Camera cam3 = new Camera("Canon", 28.8, 8.4, true);

        CamWithLens cam3Xlens1 = new CamWithLens(cam3, lens1);

        camarray.add(cam3Xlens1);

        assertEquals(1, camarray.size());

    }

}