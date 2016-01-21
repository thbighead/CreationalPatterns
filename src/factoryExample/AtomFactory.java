package factoryExample;

import builderExample.Element;

public class AtomFactory {
    public Atom makeAtom(Element element) {
        Atom atom = new Atom();

        if (element != null) {
            atom.name = element.getName();
            atom.numberOfEletrons = atom.numberOfProtons = element.getAtomicNumber();
            atom.numberOfNeutrons = (element.getAtomicMass().intValue()) - atom.numberOfProtons;
            atom.mass = element.getAtomicMass();

            return atom;
        }

        return null;
    }
}
