public class AlertSystem {

    public enum AlertLevel {
        LOW("No action needed"),
        MEDIUM("Look after the matter"),
        HIGH("Action needed"),
        CRITICAL("Immediate action needed");

        private String message;

        AlertLevel(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {
        // Example usage
        AlertLevel level = AlertLevel.HIGH;
        System.out.println("Alert Level: " + level);
        System.out.println("Message: " + level.getMessage());

        // You can loop through all levels
        for (AlertLevel alert : AlertLevel.values()) {
            System.out.println(alert + ": " + alert.getMessage());
        }
    }
}