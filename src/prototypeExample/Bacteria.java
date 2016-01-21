package prototypeExample;

import singletonExample.Universe;

public interface Bacteria {
    public Object clone();

    public boolean live(Universe universe);
}
