public class Medication{
  private String type;
  private String name;
  private double costPerGram;
  private int quantity;
  private String description;
  private boolean restrictionStatus;
  private int lowStockThreshold;

  public Medication (String medType, String medName, double medCost, int medQuantity, String medDesc, boolean restriction){
    type = medType;
    name = medName;
    costPerGram = medCost; 
    quantity = medQuantity;
    description = medDesc; 
    restrictionStatus = restriction; 
    lowStockThreshold = 15;   
  }
  
  public void setType(String type){
    this.type=type;
  }

  public String getType(){
    return type;
  }

  public void setName(String name){
    this.name=name;
  }

  public String getName(){
    return name;
  }

  public void setCostPerGram(double cost){
    this.costPerGram=cost;
  }

  public double getCostPerGram(){
    return costPerGram;
  }

  public void setQuantity(int quantity){
    this.quantity=quantity;
  }

  public int getQuantity(){
    return quantity;
  }

  public void setDescription(String description){
    this.description=description;
  }

  public String getDescription(){
    return description;
  }

  public void setStatus(boolean status){
    this.restrictionStatus=status;
  }

  public boolean getStatus(){
    return restrictionStatus;
  }

  public void setLowStockThreshold(int threshold){
    this.lowStockThreshold=threshold;
  }

  public int getLowStockThreshold(){
    return lowStockThreshold;
  }


  public boolean checkLowStock(){
    return quantity<lowStockThreshold;
  }
  
}
