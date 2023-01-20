public class Main {
    public static void main(String[] args) {
        System.out.println(InstanceRootUser.getInstance());
        System.out.println(LazyRootUser.getInstance());
        System.out.println(EnumRootUser.INSTANCE);
    }
}
