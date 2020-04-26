package Colleague;

import Mediator.FoodDeliveryService;

public class Restaurant implements Customer{

	private FoodDeliveryService foodDeliveryService;
	    public Restaurant(FoodDeliveryService foodDeliveryService){
	        this.foodDeliveryService = foodDeliveryService;
	    }
	    @Override
	    public void  order()
	    {
	        if(foodDeliveryService.canAcceptOrder())
	        {
	            System.out.println("Restaurant: Accepting Order.....");
	            foodDeliveryService.setAcceptOrderStatus(false);
	        }
	        else{
	            System.out.println("Restaurant: Cannot accept orders now. Other orders are going out....");
	        }
	    }
	    @Override
	    public void  cancelOrder(){
	        System.out.println("Restaurant: Cancelling Order.....");
	        foodDeliveryService.setAcceptOrderStatus(true);
	    }
	
	
	
}
