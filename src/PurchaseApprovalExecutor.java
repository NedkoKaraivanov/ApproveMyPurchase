import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager(300, 500, 1000, 3000, 5000);
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, 15000, Type.CONSUMABLES);
        manager.approve(2, 5000, Type.PC);
        manager.approve(3, 5000, Type.PC);
        manager.approve(4, 3000, Type.CLERICAL);
    }
}
