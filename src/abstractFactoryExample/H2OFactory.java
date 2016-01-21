package abstractFactoryExample;

import factoryExample.Atom;
import singletonExample.Universe;

public class H2OFactory extends MoleculeFactory {
    @Override
    public Molecule createMolecule(Universe universe) {
        if (universe.containsKey("hydrogen") && universe.containsKey("oxygen")) {
            Molecule h2o = new Molecule();
            Atom hydrogen = (Atom) universe.get("hydrogen");
            Atom oxygen = (Atom) universe.get("oxygen");

            h2o.name = "water";
            h2o.empiricalFormula = "H2O";
            h2o.mass = (2 * hydrogen.mass) + oxygen.mass;

            return h2o;
        }

        return null;
    }
}
