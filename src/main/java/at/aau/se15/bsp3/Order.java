//01561035 Königstorfer

package at.aau.se15.bsp3;

import java.util.List;

public class Order {

    private Long id;
    private Customer customer;
    private List<Item> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    void addShippingCost(double cost){
        this.getItems().add(new Item((long)99,cost,"Porto und Versand"));
    }
}
