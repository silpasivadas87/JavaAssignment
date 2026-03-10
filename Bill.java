package com.store;

public class Bill {

	    int[] itemIds;
	    int[] quantities;

	    Bill(int[] itemIds, int[] quantities){
	        this.itemIds = itemIds;
	        this.quantities = quantities;
	    }

	    double calculateTotal(Item[] items){

	        double total = 0;

	        for(int i=0;i<itemIds.length;i++){

	            for(Item item : items){

	                if(item.id == itemIds[i]){
	                    total += item.unitPrice * quantities[i];
	                }

	            }
	        }

	        return total;
	    }

	}


