public class CarClass {
    public static void main(String[] args)  {
     Car ob1=new Car()  ;
      ob1.setModel("Supra");
      ob1.setColor("White");
      ob1.setBrand("Toyota");
      ob1.printInfo();
    }
}
    class Car{
    String model;
    String color;
    String brand;
    public void setModel(String model)
    {
        this.model=model;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public void printInfo()
    {
        System.out.println("Car Model:"+this.model);
        System.out.println("Car color:"+this.color);
        System.out.println("Car Brand:"+this.brand);
    }
}
