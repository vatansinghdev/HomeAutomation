public class Homeautomation {
    private  Light livingroomLight;
    private Fan bedroomFan;
    private Ac hallAc;
    public Homeautomation(){
        livingroomLight=new Light("livingroomlight");
        bedroomFan=new Fan("bedroomFan");
        hallAc=new Ac("hallAc");
    }
    public  Light getlivingroomLight(){
        return livingroomLight;
    }
    public  Fan getbedroomFan(){
        return bedroomFan;
    }
    public Ac  gethallAc(){
        return hallAc;
    }
    public void showanydevicestatus(Device device){
        device.showStatus();

    }
    public void showallstatus(){
        System.out.println("\n===== all Device Status");
        showanydevicestatus(livingroomLight);
        showanydevicestatus(bedroomFan);
        showanydevicestatus(hallAc);
    }
    
    public void emergencypoweroff(){
        System.out.println("emergency poweroff activated ");
        livingroomLight.turnoff();
        bedroomFan.turnoff();
        hallAc.turnoff();
        System.out.println("All devices are turned off");
    }
}
