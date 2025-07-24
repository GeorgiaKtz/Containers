
abstract public class container {
	protected String code;
	  protected String port;
	 
	  public container(String code, String port){
	    this.code = code;
	    this.port = port;
	  }
	 
	  public abstract int  calculateCharge();
   
}
