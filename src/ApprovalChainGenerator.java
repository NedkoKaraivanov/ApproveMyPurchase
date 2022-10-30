import handlers.*;

/**
 * Used to generate chain of approval.
 * DO NOT MODIFY.
 */
public class ApprovalChainGenerator {

    public static Approver generate(Approver manager) {
        Approver director = new Director(500, 1000, 1500, 3500, 6000);
        Approver vicePresident = new VicePresident(700, 1500, 2000, 4500, 6500);
        Approver president = new President(1000, 2000, 3000, 5000, 8000);

        return manager
                .registerNext(director)
                .registerNext(vicePresident)
                .registerNext(president)
                .registerNext(ExecutiveMeeting.getInstance());
    }
}
