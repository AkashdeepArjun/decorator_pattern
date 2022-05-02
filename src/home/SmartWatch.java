package home;

public class SmartWatch extends AndroidEnhancer {

    public SmartWatch(Android a){
        super(a);
    }
    @Override
    public void smartFeatures() {
        super.smartFeatures();

        MyUtils.log("SMART WATCH", "CAN display notifications about calls");
    }
    
}
