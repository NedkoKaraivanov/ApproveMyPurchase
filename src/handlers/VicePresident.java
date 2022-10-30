package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver{

    public VicePresident(Integer consumableLimit, Integer clericalLimit, Integer gadgetsLimit, Integer gamingLimit, Integer pcLimit) {
        super(consumableLimit, clericalLimit, gadgetsLimit, gamingLimit, pcLimit);
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("VicePresident approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than VicePresident.");

        next.approve(id, cost, type);
    }
}
