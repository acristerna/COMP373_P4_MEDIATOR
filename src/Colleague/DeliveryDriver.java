package Colleague;

import Mediator.FoodDeliveryService;

public class DeliveryDriver implements Customer{

	    private FoodDeliveryService foodDeliveryService;
	    public DeliveryDriver(FoodDeliveryService foodDeliveryService){
	        this.foodDeliveryService = foodDeliveryService;
	    }
	    @Override
	    public void order()
	    {
	      if(foodDeliveryService.canAcceptOrder())
	      {
	          System.out.println("Delivery Driver: Accepting Order.....");
	          foodDeliveryService.setAcceptOrderStatus(false);
	      }
	       else{
	          System.out.println("Delivery Driver: Cannot accept orders now. Other orders are going out....");
	      }
	    }
	    @Override
	    public void  cancelOrder(){
	        System.out.println("Delivery Driver: Cancelling Order.....");
	        foodDeliveryService.setAcceptOrderStatus(true);
	    }
	
}
