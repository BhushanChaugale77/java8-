package com.prowings.BuilderDesignPattern;

public class House {

	/* walls and roof: These are mandatory fields that represent the material or type of walls and roof 
	 * the house will have.garden and garage: These are optional fields representing whether the house 
	 * has a garden or garage.These fields are private, meaning they cannot be directly accessed or 
	 * modified outside the House class. This encapsulation is a key principle of object-oriented design.
	 */
	
	private String walls;
    private String roof;
    private boolean garden;
    private boolean garage;
	
  /*              private constructor to enforce the use of builder 
   *  The constructor is private, which is crucial because it forces the creation of House objects 
   *  through the HouseBuilder class. This ensures that the construction process is controlled and 
   *  that the House object is properly initialized.The constructor takes a HouseBuilder object as 
   *  an argument and initializes the fields of the House object using the values provided by the 
   *  HouseBuilder.
   */
    private House(HouseBuilder builder) {
    	this.walls = builder.walls;
    	this.roof = builder.roof;
    	this.garden = builder.garden;
    	this.garage = builder.garage;
    	
    }
    
    @Override
	public String toString() {
		return "House [walls=" + walls + ", roof=" + roof + ", garden=" + garden + ", garage=" + garage + "]";
	}


    // Static inner Builder Class
	public static class HouseBuilder{
    	
	/*	These fields in the HouseBuilder class are similar to those in the House class. 
	 *  They store the values that will be used to create a House object.The HouseBuilder 
	 *  class serves as a container for these fields during the construction process.
	 */
		
    	private String walls;
    	private String roof;
    	private boolean garden;
    	private boolean garage;
    	
    	
    /*   The constructor takes two mandatory parameters: walls and roof.These are required fields that 
     *   must be provided when creating a HouseBuilder object. The HouseBuilder cannot be created without
     *   specifying the type of walls and roof.
     */
    	public HouseBuilder(String walls,String roof) {
    		this.walls = walls;
    		this.roof = roof;
    	}
    	
    	
    /*  These methods are used to set the optional fields (garden and garage).Each method sets the 
     *  corresponding field and then returns the HouseBuilder object itself (this). 
     *  This allows for method chaining, where you can call multiple methods on the builder in a 
     *  single line of code.
     */
    	public HouseBuilder setGarden(boolean garden) {
    		
    		this.garden = garden;
    		return this;
    	}
    	
    	public HouseBuilder setGarage(boolean garage) {
    		
    		this.garage = garage;
    		return this;
    	}
    	
    	
    	
    /* The build() method constructs the final House object. It does this by passing the
     *  current HouseBuilder object (this) to the House constructor.The build() method returns 
     *  the constructed House object.	
     */
    	public House build() {
    		return new House(this);
    	}	
	
    }
}
