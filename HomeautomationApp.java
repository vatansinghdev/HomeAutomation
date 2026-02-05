import java.util.Scanner;1

public class HomeautomationApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Homeautomation home =new Homeautomation();
        while (true){
            System.out.println("welcome to homeautomated smart home");
            System.out.println("1.show all devices");
            System.out.println("2.control light");
            System.out.println("3.control fan");
            System.out.println("4.control ac");
            System.out.println("5.emergency poweroff");
            System.out.println("0.exit");
            System.out.println("enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                home.showallstatus();
                break;
                case 2:
                lightMenu(sc,home);
                break;
                case 3:
                fanMenu(sc,home);
                break;
                case 4:
                acMenu(sc,home);
                break;
                case 5:
                 home.emergencypoweroff();
                 break;
                 case 0:
                 System.out.println("thankuou for existing");
                 return;
                 default:
                 System.out.println("invalid");
            }
        }
    }
    

private static void lightMenu(Scanner sc,Homeautomation home){
    while(true){
        System.out.println("welcome to light menu");
        System.out.println("1.turnon");
        System.out.println("2.turnoff");
        System.out.println("3.increase brightness");
        System.out.println("4.decrease brightness");
        System.out.println("5.show status");
        System.out.println("0.back");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        Light light=home.getlivingroomLight();
        switch (ch) {
            case 1:
            light.turnon();
                
                break;
                case 2:
                light.turnoff();
                break;
                case 3:
                light.increaselevel();
                break;
                case 4:
                light.decreaselevel();
                break;
                case 5:
                light.showStatus();
                break;
                case 0:
                return;
        
            default:
                System.out.println("invalid");
        }
    }
}
private static void fanMenu(Scanner sc,Homeautomation home){
    while(true){
        System.out.println("welcome to fan menu");
        System.out.println("1.turnon");
        System.out.println("2.turnoff");
        System.out.println("3.increase speed");
        System.out.println("4.decrease speed");
        System.out.println("5.show status");
        System.out.println("0.back");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        Fan fan= home.getbedroomFan();
        switch (ch) {
            case 1:
            fan.turnon();
                
                break;
                case 2:
                fan.turnoff();
                break;
                case 3:
                fan.increaselevel();
                break;
                case 4:
                fan.decreaselevel();
                break;
                case 5:
                fan.showStatus();
                break;
                case 0:
                return;
        
            default:
                System.out.println("invalid");
        }
    }
}
private static void acMenu(Scanner sc,Homeautomation home){
    while(true){
        System.out.println("welcome to ac menu");
        System.out.println("1.turnon");
        System.out.println("2.turnoff");
        System.out.println("3.increase temprature");
        System.out.println("4.decrease temprature");
        System.out.println("5.show status");
        System.out.println("0.back");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        Ac ac=home.gethallAc();
        switch (ch) {
            case 1:
            ac.turnon();
                
                break;
                case 2:
                ac.turnoff();
                break;
                case 3:
                ac.increaselevel();
                break;
                case 4:
                ac.decreaselevel();
                break;
                case 5:
                ac.showStatus();
                break;
                case 0:
                return;
        
            default:
                System.out.println("invalid");
        }
    }
}
}