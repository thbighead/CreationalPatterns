package prototypeExample;

import singletonExample.Universe;

public class AnaerobicBacteria implements Bacteria {
    @Override
    public AnaerobicBacteria clone() {
        return new AnaerobicBacteria();
    }

    @Override
    public boolean live(Universe universe) {
        if (universe.containsKey("air")) {
            return false;
        } else {
            return true;
        }
    }
}
