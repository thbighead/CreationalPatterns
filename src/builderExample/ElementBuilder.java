package builderExample;

/* "Abstract Builder" */
public abstract class ElementBuilder {
    protected Element element;

    public Element getElement() {
        return element;
    }

    public void createNewElement() {
        element = new Element();
    }

    public abstract void buildAtomicNumber();

    public abstract void buildGroup();

    public abstract void buildSymbol();

    public abstract void buildName();

    public abstract void buildAtomicMass();
}
