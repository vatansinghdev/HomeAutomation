public class Ac extends Device implements switchable,adjustable{
   private int temprature;
     public Ac(String name){
    super(name);
    this.temprature=16;
   }
   @Override
   public void turnon(){
    ison=true;
    System.out.println(deviceName+"is on");
   }
   @Override
   public void turnoff(){
    ison=false;
    System.out.println(deviceName+"is off");
   }
   @Override
   public void increaselevel(){
    if(!ison){
        System.out.println(deviceName+"is off turn on first");
    }
    if(temprature<32){
        temprature++;
        System.out.println(deviceName+"temprature increased to"+temprature);
    }
   }
   @Override
   public void decreaselevel(){
    if(!ison){
        System.out.println(deviceName+"is off turnon first");
    }
    if (temprature>16){
        temprature++;
        System.out.println(deviceName+"temprature decreased to"+ temprature);
    }
   }
   public void showStatus(){
    System.out.println(deviceName+"status" +(ison? "on":"off")+temprature+"temprature");
   }
}

