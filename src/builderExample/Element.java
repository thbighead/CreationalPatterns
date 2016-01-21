package builderExample;

/* Product */
public class Element {
    private Integer atomicNumber = null;
    private String group = null;
    private String symbol = null;
    private String name = null;
    private Double atomicMass = null;

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public Double getAtomicMass() {
        return atomicMass;
    }

    public String getGroup() {
        return group;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public void setAtomicNumber(int atomicNumber) {
        if (atomicNumber < 0) {
            atomicNumber *= -1;
        } else if (atomicNumber == 0) {
            atomicNumber++;
        }

        this.atomicNumber = atomicNumber;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtomicMass(double atomicMass) {
        if (atomicMass < 0) {
            atomicMass *= -1;
        } else if (atomicMass == 0) {
            atomicMass++;
        }

        this.atomicMass = atomicMass;
    }
}
