package builderExample;

public class PeriodicTable {
    /* who serves the elements */
    private ElementBuilder elementBuilder;

    public void setElementBuilder(ElementBuilder element_builder) {
        elementBuilder = element_builder;
    }

    public Element getElement() {
        return elementBuilder.getElement();
    }

    public void constructElement() {
        elementBuilder.createNewElement();
        elementBuilder.buildAtomicMass();
        elementBuilder.buildAtomicNumber();
        elementBuilder.buildGroup();
        elementBuilder.buildName();
        elementBuilder.buildSymbol();
    }
}
