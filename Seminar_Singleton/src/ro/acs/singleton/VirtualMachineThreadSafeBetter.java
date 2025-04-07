package ro.acs.singleton;

public class VirtualMachineThreadSafeBetter {
    private int connectionPort;
    private String ipAdrees;
    private String virtualMachineName;
    private String userName;

    private static VirtualMachineThreadSafeBetter instance=null;

    private VirtualMachineThreadSafeBetter(){
        this.connectionPort = 8080;
        this.ipAdrees = "10.09.10";
        this.virtualMachineName = "virtualMachineName";
        this.userName = "admin-lazy";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VirtualMachineThreadSafeBetter{");
        sb.append("connectionPort=").append(connectionPort);
        sb.append(", ipAdrees='").append(ipAdrees).append('\'');
        sb.append(", virtualMachineName='").append(virtualMachineName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static VirtualMachineThreadSafeBetter getInstance(){
        if(instance==null){
            synchronized (VirtualMachineThreadSafeBetter.class){
                if(instance==null){
                    instance=new VirtualMachineThreadSafeBetter();
                }

            }
        }
        return instance;
    }
}
