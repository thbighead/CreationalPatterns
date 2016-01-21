package singletonExample;

import java.util.HashMap;

public class Universe extends HashMap<String, Object> {
    private static final long serialVersionUID = 761935335496048659L;

    // Private constructor prevents instantiation from other classes
    private Universe() {}

    /**
     * UniverseHolder is loaded on the first execution of Universe.getInstance() or the first access
     * to UniverseHolder.INSTANCE, not before.
     */
    private static class UniverseHolder {
        private static final Universe INSTANCE = new Universe();
    }

    public static Universe getInstance() {
        return UniverseHolder.INSTANCE;
    }

    @Override
    public String toString() {
        String universe = "";

        for (String thing : this.keySet()) {
            universe += thing + " ";
        }

        return "{ " + universe + "}";
    }
}
