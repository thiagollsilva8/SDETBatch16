package class29;

/*
 * This exception is thrown when there are not enough balances in the user's account,
 *  and he tries to withdraw more money.
 */

public class InsufficientBalance extends RuntimeException {

    public InsufficientBalance(String errorMsg) {
        super(errorMsg);
    }

}
