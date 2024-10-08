class Plant {
    
    // Usually only static final members are public
    public static final int ID = 7;
    
    // Instance variables should be declared private, 
    // or at least protected.
    private String name;
    
    // Only methods intended for use outside the class
    // should be public. These methods should be documented
    // carefully if you distribute your code.
    public String getData() {
        String data = "Calculated Data: " + calculateGrowthForecast();
        
        return data;
    }
    
    // Methods only used the the class itself should
    // be private or protected.
    private int calculateGrowthForecast() {
        return 9;
    }

    public static int getId() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
}


public class Encapsulation1 {

    public static void main(String[] args) {
        Plant plant1=new Plant();
        System.out.println( plant1.getData());
    }

}