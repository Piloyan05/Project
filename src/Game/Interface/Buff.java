package Game.Interface;

import Game.Core.PurchaseException;

public interface Buff  {
    public void increaseHealth() throws PurchaseException.FullHealthException;
    public void speedDown() throws PurchaseException.SlowDownException;
    public void speedUp() throws PurchaseException.InvalidUseException;
}
