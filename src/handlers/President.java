package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver {

    public President(Integer consumableLimit, Integer clericalLimit, Integer gadgetsLimit, Integer gamingLimit, Integer pcLimit) {
        super(consumableLimit, clericalLimit, gadgetsLimit, gamingLimit, pcLimit);
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than President.");

        next.approve(id, cost, type);
    }
}
