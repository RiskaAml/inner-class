class Device{
    int year = 2025;
    public void display(){
        System.out.println("Displaying device info...");
    }
    static class Configuration{
        public void setup(){
            System.out.println("Setting up device configuration...");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Device obj = new Device();
        obj.display();
        
        Device.Configuration obj1 = new Device.Configuration();
        // Karena Configuration adalah static inner class, bisa dibuat langsung lewat nama outer class
        // Device.Configuraion obj1 = obj.new Configuration();  ini kalau Configuration non static
        obj1.setup();
    }
    
}
