package State.VendingMachine;

import java.util.ArrayList;
import java.util.List;
import State.VendingMachine.States.VendingState;
import State.VendingMachine.States.impl.IdleVendingState;

public class VendingMachine {
    private VendingState vendingMachineVendingState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine(){
        vendingMachineVendingState = new IdleVendingState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public VendingState getVendingMachineState() {
        return vendingMachineVendingState;
    }

    public void setVendingMachineState(VendingState vendingMachineVendingState) {
        this.vendingMachineVendingState = vendingMachineVendingState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if(i<3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i<5){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            }else if(i<7){
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            }else if(i<10){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    public static void displayInventory(VendingMachine vendingMachine){

        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }

}