class VehicleService {
    public static void main(String[] args) {
        System.out.println("Vehicle service running...");
        int totalVehicles = 25;
        System.out.println("Available vehicles: " + totalVehicles);
        
        throw new RuntimeException("Vehicle Service failed due to configuration error!");
    }
}
