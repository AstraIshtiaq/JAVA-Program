public class BoxClass {
    public static void main(String[] args)  {
        Box ob2=new Box();
        ob2.setDimension(100, 200, 200);
        ob2.printInfo();
       }
   }
   
    class Box{
    int x,y,z;
    String color;
    String metarial;
    public void setDimension(int x,int y,int z)
    {
       this.x= x;
       this.y= y;
       this.z=z;
    }
    public void printInfo()
    {
        System.out.println("X="+this.x+" ,Y="+this.y+" ,Z="+this.z);
    }
}
