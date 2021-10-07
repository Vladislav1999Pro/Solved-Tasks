public class BankAccount {
  protected double amount = 0;

  public double getAmount() {
    //TODO: реализуйте метод и удалите todo
    return amount;
  }

  public void put(double amountToPut) {
    //TODO: реализуйте метод и удалите todo
    if (amountToPut > 0){
      amount += amountToPut;
    }
  }

  public double take(double amountToTake) {
    //TODO: реализуйте метод и удалите todo
    if (amountToTake > 0 && amountToTake < amount) {
      amount -= amountToTake;
    }
    return amount;
  }
  public boolean send(BankAccount receiver, double amount){
    this.take(amount);
    receiver.put(amount);
    return receiver.getAmount() > 0;
  }
}