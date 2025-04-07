package ro.acs.singleton;

public class VirtualMachineStaticBlock {
    private int connectionPort;
    private String ipAdrees;
    private String virtualMachineName;
    private String userName;
    private static VirtualMachineStaticBlock instance=null;

    private VirtualMachineStaticBlock(){
        this.connectionPort = 8080;
        this.ipAdrees = "10.09.10";
        this.virtualMachineName = "virtualMachineName";
        this.userName = "admin-lazy";
    }
    //instance is created when the app loads
    static{
        try{
        instance=new VirtualMachineStaticBlock();
        }catch(Exception e){
            throw new RuntimeException("Error while creating singleton instance");
        }
    }

    public static VirtualMachineStaticBlock instance() {
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VirtualMachineStatic{");
        sb.append("connectionPort=").append(connectionPort);
        sb.append(", ipAdrees='").append(ipAdrees).append('\'');
        sb.append(", virtualMachineName='").append(virtualMachineName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
