package cardealer.interfaces;

// In interfaces, methods are by default public and abstract so those keywords aren't needed
public interface Discountable {
    public abstract float getMaximumDiscountPct();
    float getPersonDiscount();
    float getCorporateDiscount();
}