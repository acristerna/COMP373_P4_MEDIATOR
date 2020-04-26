package ConcreteMediator;

import Colleague.Customer;
import Mediator.FoodDeliveryService;

public class FoodDeliveryServiceImpl implements FoodDeliveryService {
	
	    Customer deliveryDriver, restaurant;
	    boolean acceptOrderStatus = true;
	    
	    @Override
	    public void registerCustomer(Customer deliveryDriver, Customer restaurant) {
	        this.deliveryDriver = deliveryDriver;
	        this.restaurant = restaurant;
	    }
	    @Override
	    public void setAcceptOrderStatus(boolean acceptOrderStatus) {
	        this.acceptOrderStatus = acceptOrderStatus;
	    }
	    @Override
	    public boolean canAcceptOrder() {
	        return acceptOrderStatus;
	    }
	    @Override
	    public void order(Customer customer) {
	        customer.order();
	    }
	    @Override
	    public void cancelOrder(Customer customer) {
	        customer.cancelOrder();
	    }
		
		
}