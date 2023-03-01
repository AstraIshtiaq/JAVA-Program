public class Various {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int [] num={1,2,3,4,5,6};

        num[0]=num[1]+num[2];
        for(int i=0;i<num.length;i++)
        {
            //System.out.println("The value of I is:"+i+1);
            System.out.println(i+1+"<-The value of I ");
        }
       System.out.println("Length is:"+num.length);
    } 
}
