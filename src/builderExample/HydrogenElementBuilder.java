package builderExample;

/* Concrete Builder */
public class HydrogenElementBuilder extends ElementBuilder {
    @Override
    public void buildAtomicNumber() {
        element.setAtomicNumber(1);
    }

    @Override
    public void buildGroup() {
        element.setGroup("Nonmetal");
    }

    @Override
    public void buildSymbol() {
        element.setSymbol("H");
    }

    @Override
    public void buildName() {
        element.setName("hydrogen");
    }

    @Override
    public void buildAtomicMass() {
        element.setAtomicMass(1.0079);
    }
}
