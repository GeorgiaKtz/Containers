
public class refridgeratorcontainer extends container {
	private int power;
	 
	  public refridgeratorcontainer(String code, String port, int power){
	    super(code,port);
	    this.power = power;
	  }
	  public int calculateCharge(){
	    return power * 2000;
	  }

}
