package pckg_VJ_Z1;

import pckg_VJ_Z1.Customer;
import pckg_VJ_Z1.Item;
import pckg_VJ_Z1.ObservableInt;

import java.util.ArrayList;
import java.util.Observer;
import java.util.concurrent.ThreadLocalRandom;




public class OnlineStore implements ObservableInt{
    private String storeName;
    private int storeId;
    private ArrayList<Customer> customers;
    private Item item;

    public OnlineStore(String name) {
        customers = new ArrayList<Customer>();
        this.storeName = name;
        this.storeId = ThreadLocalRandom.current().nextInt(100000);
    }

    public void setItemAvailability(Item itm) {
        this.item = itm;
    }

    @Override
    public void add2AvailList(Customer cst) {
        customers.add(cst);
    }

    @Override
    public void remove4AvailList(Customer cst) {
        if(!customers.contains(cst)) {
            System.out.println("There is no such customer on our list");
        } else {
            customers.remove(cst);
        }
    }

    @Override
    public void notifyCst() {
        for(Customer cst : customers) {
            cst.update(item, storeName);
        }
    }
}