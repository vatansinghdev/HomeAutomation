public class Fan  extends Device implements switchable,adjustable{
    private int speed;
    public Fan(String name){
        super(name);
        this.speed=5;
    }
    @Override
    public void turnon(){
        ison=true;

        
        System.out.println( deviceName+"is on");
    }
    public void turnoff(){
        ison=false;
        System.out.println(deviceName+"is off");
    }
    @Override
    public void increaselevel(){
        if(!ison){
            System.out.println(deviceName+"tur on first ");
        }
        if(speed<10){
            speed++;
            System.out.println(deviceName+"speed increased to " + speed);
        }
    }
    @Override
    public void decreaselevel(){
        if (!ison){
            System.out.println(deviceName+"is off , trun on first");

        }
        if (speed >0){
            speed--;
            System.out.println(deviceName+"speed decreased to "+ speed);
        }
    }
    public void showStatus(){
        System.out.println("device"+deviceName+"|status" +(ison?"on":"off")+ speed+"speed " );
    }
    
    
}
