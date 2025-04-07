package ro.acs.singleton;

import java.util.HashMap;

public class VirtualMachineRegistryVAR1 {
    private int connectionPort;
    private String ipAdrees;
    private String virtualMachineName;
    private String userName;

    private static HashMap<String, VirtualMachineRegistryVAR1> registryHashMap=null;

    //Constructorul cu toti parametri la Registry
    private VirtualMachineRegistryVAR1(int connectionPort, String ipAdrees, String virtualMachineName, String userName) {
        this.connectionPort = connectionPort;
        this.ipAdrees = ipAdrees;
        this.virtualMachineName = virtualMachineName;
        this.userName = userName;
    }

    public static synchronized VirtualMachineRegistryVAR1 getInstance(int connectionPort, String ipAdrees, String virtualMachineName, String userName){
        VirtualMachineRegistryVAR1 virtualMachineConnection=registryHashMap.get(ipAdrees);
        if(virtualMachineConnection==null){
            virtualMachineConnection=new VirtualMachineRegistryVAR1(connectionPort,ipAdrees,virtualMachineName,userName);
            registryHashMap.put(ipAdrees,virtualMachineConnection);
        }
        return virtualMachineConnection;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VirtualMachineRegistry{");
        sb.append("connectionPort=").append(connectionPort);
        sb.append(", ipAdrees='").append(ipAdrees).append('\'');
        sb.append(", virtualMachineName='").append(virtualMachineName).append('\'');
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
