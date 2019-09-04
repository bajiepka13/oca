package Introduction.question14;

import java.util.ArrayList;
import java.util.List;

public class FindAllTadPole {

    public static void main(String[] args) {

        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
           CanSwim tadpole1 = amphibian;
           Object tadpole2 = amphibian;
           Amphibian tadpole3 = amphibian;
//           Long tadpole4 = amphibian;
//           Tadpole tadpole5 = amphibian;
        }
    }
}

class Tadpole extends Amphibian {
}

interface CanSwim {
}

class Amphibian implements CanSwim {
}