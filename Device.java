public abstract class Device {
    protected boolean ison;
    protected String deviceName;
    public Device(String deviceName){
        this.deviceName=deviceName;
        this.ison=false;
    }
    public boolean ison(){
        return ison;
    }
    public String getDeviceName(){
        return deviceName;

    }
    public abstract void showStatus();
}
