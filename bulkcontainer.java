
public class bulkcontainer extends container {
	private int weight;
	 
	  public bulkcontainer(String code, String port, int weight){
	    super(code, port);
	    this.weight = weight;
	  }
	  public int calculateCharge(){
	    return weight * 10;
	  }

}
