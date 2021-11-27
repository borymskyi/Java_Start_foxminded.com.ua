package ua.com.second;

public class DrumHarvester extends Harvester {

    public DrumHarvester(String name) {
        super(name);
    }

    @Override
    public boolean isReadyToService() {
        if(distanceOnService > 1000) {
            return true;
        } else {
            return false;
        }
    }
}
