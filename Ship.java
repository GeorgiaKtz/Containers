import java.util.ArrayList;
public class Ship {
	private String name;
	  private int capacity;
	  private ArrayList<container> containers = new ArrayList<container>();
	 
	  public Ship(String name, int capacity){
	    this.name = name;
	    this.capacity = capacity; 
	  }
	 
	  public void addContainer(container container){
	     if(containers.size()< capacity) {
	       containers.add(container);
	       capacity--;
	       System.out.println("Το container προστέθηκε επιτυχως.");
	     }else {
	    	 System.out.println("Το container είναι full");
	     }
	  }
	 
	  public int calculateTotalCharge(){
	    int totalCharge = 0;
	    for(container container : containers){
	      totalCharge = totalCharge + container.calculateCharge();
	    }
	    return totalCharge;
	  }

}
