public class Main {

    public static void main(String[] args) {
        NetworkConnection connection = NetworkConnection.getConnection();
        connection.setAdressType("DHCP");
        connection.setIpAdress("192.168.1.101");
        connection.setDefaultGateWay("192.168.1.1");
        connection.Connect();
    }
}
