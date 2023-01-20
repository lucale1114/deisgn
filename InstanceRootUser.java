public class InstanceRootUser {
    private int UID = 0;
    private int GID = 0;
    private String userName = "instanceroot";
    private String name = "Super user";
    private String home = "/root";
    private String shell = "/bin/sh";
    
    private static InstanceRootUser instance = new InstanceRootUser();

    public static InstanceRootUser getInstance() {
        return instance;
    }

    private InstanceRootUser() {
    }

    public String toString() {
        return new StringBuilder(userName)
                .append("(").append(name).append(")")
                .append(" ").append(UID).append(":").append(GID)
                .append(" home: ").append(home).append(" ")
                .append("shell: ").append(shell)
                .toString();
    }
}
