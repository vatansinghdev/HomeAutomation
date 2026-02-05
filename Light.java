public class Light extends Device 
implements switchable ,adjustable{
  private int brightness;
  public Light(String name){
    super(name);
    this.brightness=5;

  }
  @Override
  public void turnon(){
    ison=true;
    System.out.println(deviceName+"is on");
  }
  @Override
  public void turnoff(){
    ison=false;
    System.out.println(deviceName + "is off");
  } 
  @Override
  public void increaselevel(){
    if(!ison){
        System.out.println(deviceName + "is off turn on first");
        if(brightness<10){
            brightness++;
            System.out.println(deviceName + "brightness is increased to"+ brightness);
        }
    }
  }
  @Override
  public void decreaselevel(){
    if(!ison){
        System.out.println(deviceName+"is off turnon first");
    }
    if (brightness>0)
    {
        brightness--;
        System.out.println(deviceName+ "brightness decreased to"+ brightness);
  }
    
}
@Override
public  void showStatus(){
    System.out.println(deviceName+"|status"+(ison ? "on" :"off" ) +"brightness"+brightness);
}
}
