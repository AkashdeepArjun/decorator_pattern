package home;

public class AndroidEnhancer implements Android{
    protected Android android;

    public AndroidEnhancer(Android android){
        this.android=android;
    }

    @Override
    public void smartFeatures() {
        
        this.android.smartFeatures();
        
    }


}
