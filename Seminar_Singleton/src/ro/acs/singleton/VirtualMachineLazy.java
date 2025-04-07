package ro.acs.singleton;

public class VirtualMachineLazy {
    private int connectionPort;
    private String ipAdrees;
    private String virtualMachineName;
    private String userName;

    private static VirtualMachineLazy instance = null;

    private VirtualMachineLazy() {
        this.connectionPort = 8080;
        this.ipAdrees = "10.09.10";
        this.virtualMachineName = "virtualMachineName";
        this.userName = "admin-lazy";
    }

    public static VirtualMachineLazy getInstance() {
        if (instance == null) {
            instance = new VirtualMachineLazy();
        }
        return instance;
    }

    public int connectionPort() {
        return connectionPort;
    }

    public void setConnectionPort(int connectionPort) {
        this.connectionPort = connectionPort;
    }

    public String ipAdrees() {
        return ipAdrees;
    }

    public void setIpAdrees(String ipAdrees) {
        this.ipAdrees = ipAdrees;
    }

    public String userName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String virtualMachineName() {
        return virtualMachineName;
    }

    public void setVirtualMachineName(String virtualMachineName) {
        this.virtualMachineName = virtualMachineName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VirtualMachineLazy{");
        sb.append("connectionPort=").append(connectionPort);
        sb.append(", ipAdrees='").append(ipAdrees).append('\'');
        sb.append(", virtualMachineName='").append(virtualMachineName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
