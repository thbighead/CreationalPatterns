package abstractFactoryExample;

import singletonExample.Universe;

public abstract class MoleculeFactory {
    private static final H2OFactory h2oFactory = new H2OFactory();
    private static final O2Factory o2Factory = new O2Factory();

    public static final int H20 = 1;
    public static final int O2 = 2;

    public static final MoleculeFactory getFactory(int molecule_id) {
        switch (molecule_id) {
            case H20:
                return h2oFactory;
            case O2:
                return o2Factory;
            default:
                return null;
        }
    }

    public abstract Molecule createMolecule(Universe universe);
}
