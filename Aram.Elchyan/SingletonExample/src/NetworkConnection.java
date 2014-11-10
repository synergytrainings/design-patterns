/**
 * Created by Aram on 11/8/2014.
 */
public class NetworkConnection {
    protected static NetworkConnection connection;

    private String ipAdress;

    private String adressType;

    private String defaultGateWay;

    public static NetworkConnection getConnection() {
        if(connection == null) {
            connection = new NetworkConnection();
        }
        return connection;
    }

    private NetworkConnection() { }

    public void setAdressType(String adressType) {
        this.adressType = adressType;
    }

    public void setDefaultGateWay(String defaultGateWay) {
        this.defaultGateWay = defaultGateWay;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getAdressType() {
        return adressType;
    }

    public String getDefaultGateWay() {
        return defaultGateWay;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void Connect() {
        //connecting to network
    }

    public void Disconnect() {
        //disconnecting
    }
}
