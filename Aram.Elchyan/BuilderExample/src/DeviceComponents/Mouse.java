package DeviceComponents;

/**
 * Created by Aram on 11/3/2014.
 */
public class Mouse extends ExternalDevice {
    private boolean isWireless;

    private String company;

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public String getCompany() {
        return company;
    }
}
