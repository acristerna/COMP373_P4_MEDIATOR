package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import Colleague.Customer;
import Colleague.DeliveryDriver;
import Colleague.Restaurant;
import ConcreteMediator.FoodDeliveryServiceImpl;
import Mediator.FoodDeliveryService;

class MediatorPatternTest {

	// Test to see if Mediator / Food Delivery Service can accept the logic between classes.  
	@Test
	    public void testMediator() throws Exception {
	        FoodDeliveryService foodDeliveryService = new FoodDeliveryServiceImpl();
	        Customer deliveryDriver = new DeliveryDriver(foodDeliveryService);
	        Customer restaurant = new Restaurant(foodDeliveryService);
	        foodDeliveryService.registerCustomer(deliveryDriver, restaurant);
	        foodDeliveryService.order(deliveryDriver);
	        foodDeliveryService.order(restaurant);
	        foodDeliveryService.cancelOrder(deliveryDriver);
	        foodDeliveryService.order(restaurant);
	        
	    }
	
	//successful
}
