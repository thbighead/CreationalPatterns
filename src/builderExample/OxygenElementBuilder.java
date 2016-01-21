package builderExample;

/* Concrete Builder */
public class OxygenElementBuilder extends ElementBuilder {
    @Override
    public void buildAtomicNumber() {
        element.setAtomicNumber(8);
    }

    @Override
    public void buildGroup() {
        element.setGroup("Nonmetal");
    }

    @Override
    public void buildSymbol() {
        element.setSymbol(")");
    }

    @Override
    public void buildName() {
        element.setName("oxygen");
    }

    @Override
    public void buildAtomicMass() {
        element.setAtomicMass(15.9994);
    }
}
