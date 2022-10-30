package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    public Director(Integer consumableLimit, Integer clericalLimit, Integer gadgetsLimit, Integer gamingLimit, Integer pcLimit) {
        super(consumableLimit, clericalLimit, gadgetsLimit, gamingLimit, pcLimit);
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
        next.approve(id, cost, type);
    }
}
