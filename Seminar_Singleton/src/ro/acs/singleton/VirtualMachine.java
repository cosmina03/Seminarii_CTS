package ro.acs.singleton;

public class VirtualMachine {
    private int connectionPort;
    private String ipAdrees;
    private String virtualMachineName;
    private String userName;

    public VirtualMachine(int connectionPort, String ipAdrees, String virtualMachineName, String userName) {
        this.connectionPort = connectionPort;
        this.ipAdrees = ipAdrees;
        this.virtualMachineName = virtualMachineName;
        this.userName = userName;
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

    public String virtualMachineName() {
        return virtualMachineName;
    }

    public void setVirtualMachineName(String virtualMachineName) {
        this.virtualMachineName = virtualMachineName;
    }

    public String userName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VirtualMachine{");
        sb.append("connectionPort=").append(connectionPort);
        sb.append(", ipAdrees='").append(ipAdrees).append('\'');
        sb.append(", virtualMachineName='").append(virtualMachineName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
