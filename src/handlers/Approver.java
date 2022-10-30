package handlers;

import common.Type;

import java.util.EnumMap;

public abstract class Approver {

    protected Approver next;
    private final EnumMap<Type, Integer> checkLimitMap = new EnumMap<>(Type.class);

    public Approver(Integer consumableLimit, Integer clericalLimit, Integer gadgetsLimit, Integer gamingLimit, Integer pcLimit) {
        this.checkLimitMap.put(Type.CONSUMABLES, consumableLimit);
        this.checkLimitMap.put(Type.CLERICAL, clericalLimit);
        this.checkLimitMap.put(Type.GADGETS, gadgetsLimit);
        this.checkLimitMap.put(Type.GAMING, gamingLimit);
        this.checkLimitMap.put(Type.PC, pcLimit);
    }

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(int id, double cost, Type type);
    protected boolean canApprove(double cost, Type type) {
            return cost <= this.checkLimitMap.get(type);
    }


    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
