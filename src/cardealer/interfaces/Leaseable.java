package cardealer.interfaces;

// Interfaces normally follow a naming convention similar to classes BUT they typically end in '-ible' or '-able'
// Usually adjective because we usually interfaces to provide additional capabilities
public interface Leaseable {
    boolean isLeaseable();
    int getLeaseTerm();
    int getMaxMilesPerYear();

    // add default method
    default float getMileablePenalty() {
        return 500.0f;
    }
}
