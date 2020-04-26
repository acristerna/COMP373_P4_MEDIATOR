package Mediator;

import Colleague.Customer;

public interface FoodDeliveryService {

	   void registerCustomer(Customer deliveryDriver, Customer restaurant);
	    void setAcceptOrderStatus(boolean acceptOrderStatus);
	    boolean canAcceptOrder();
	    void order(Customer customer);
	    void cancelOrder(Customer customer);
}