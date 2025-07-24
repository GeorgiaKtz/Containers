

public class Main {

	public static void main(String[] args) {
		
		
		Ship ship1 = new Ship("Eugene", 450);
		Ship ship2 = new Ship("Georgia", 550);
		 
	    container container1 = new bulkcontainer("G675F", "Barcelona", 200);
	    container container2 = new bulkcontainer("H789F", "Peiraias", 300);
	    container container3 = new refridgeratorcontainer("D645H", "Thermaikos", 1000);
	    container container4 = new refridgeratorcontainer("R789P", "New York", 2467);
	 
	    ship1.addContainer(container1);
	    ship1.addContainer(container2);
	    ship1.addContainer(container3);
	    ship1.addContainer(container4);
	    
	    new ChargeCalculator(ship1);

	}

}
