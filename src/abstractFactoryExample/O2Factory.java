package abstractFactoryExample;

import factoryExample.Atom;
import singletonExample.Universe;

public class O2Factory extends MoleculeFactory {
    @Override
    public Molecule createMolecule(Universe universe) {
        if (universe.containsKey("oxygen")) {
            Molecule o2 = new Molecule();
            Atom oxygen = (Atom) universe.get("oxygen");

            o2.name = "air";
            o2.empiricalFormula = "O2";
            o2.mass = 2 * oxygen.mass;

            return o2;
        }

        return null;
    }
}
