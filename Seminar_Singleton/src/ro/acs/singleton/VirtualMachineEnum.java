package ro.acs.singleton;

public enum VirtualMachineEnum {
    INSTANCE;

    private int connectionPort;
    private String ipAdrees;
    private String virtualMachineName;
    private String userName;

    private VirtualMachineEnum() {
        this.connectionPort = 8090;
        this.ipAdrees = "10.01.01.01";
        this.virtualMachineName = "Machine-Learning";
        this.userName = "admin";
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
    public void doSomething(){
        System.out.println("This is a singleton");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VirtualMachineEnum{");
        sb.append("connectionPort=").append(connectionPort);
        sb.append(", ipAdrees='").append(ipAdrees).append('\'');
        sb.append(", virtualMachineName='").append(virtualMachineName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
