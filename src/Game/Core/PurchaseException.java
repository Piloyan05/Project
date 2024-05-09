package Game.Core;

public class PurchaseException extends Exception{

    public PurchaseException(){
        super("The item is already used");
    }
    public PurchaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public class NotEnoughMoneyException extends Exception{
        public NotEnoughMoneyException() {
            super("You do not have enough suns to make the purchase");
        }

        public NotEnoughMoneyException(String message) {
            super(message);
        }
    }
    public class FullHealthException extends Exception{
        public FullHealthException() {
            super("The health of the plant is full");
        }
    }

    public class InvalidUseException extends Exception{
        public InvalidUseException() {
            super("The item can be used only to SunFlower");
        }
    }
    public class SlowDownException extends Exception{
        public SlowDownException() {
            super("The item can be use only to Zombies");
        }
    }
}
