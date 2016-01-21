package prototypeExample;

import singletonExample.Universe;

public class AerobicBacteria implements Bacteria {
    @Override
    public AerobicBacteria clone() {
        return new AerobicBacteria();
    }

    @Override
    public boolean live(Universe universe) {
        if (universe.containsKey("air")) {
            return true;
        } else {
            return false;
        }
    }
}
