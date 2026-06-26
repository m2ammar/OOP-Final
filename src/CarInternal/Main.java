package CarInternal;

public class Main {
    public static void main(String[] args) {
        Car testCar = new Car();
        int score = 0;

        System.out.println("=== RUNNING SAFETY LOGIC TESTS ===\n");

        // Test 1: Try starting cold
        if (!testCar.startCar() && !testCar.isEngineRunning()) {
            System.out.println("[PASS] Test 1: Car safely refused to start without prep.");
            score++;
        } else {
            System.out.println("[FAIL] Test 1: Car started without brakes or button pushed!");
        }

        // Test 2: Proper startup sequence
        testCar.getBrakes().apply();
        testCar.getPushStart().push();
        if (testCar.startCar() && testCar.isEngineRunning()) {
            System.out.println("[PASS] Test 2: Car started successfully with all prerequisites.");
            score++;
        } else {
            System.out.println("[FAIL] Test 2: Car failed to start even with conditions met.");
        }

        // Test 3: Try stopping while driving
        testCar.getPushStart().release();
        testCar.getBrakes().release();
        testCar.setGears(Gears.Drive); // Shift to drive

        testCar.getPushStart().push(); // Try pushing stop button while moving
        if (!testCar.stopCar() && testCar.isEngineRunning()) {
            System.out.println("[PASS] Test 3: Engine safe. Refused to stop while gear is in Drive.");
            score++;
        } else {
            System.out.println("[FAIL] Test 3: Safety hazard! Engine cut off while in Drive.");
        }

        // Test 4: Proper shutdown sequence
        testCar.setGears(Gears.Park); // Shift to park
        if (testCar.stopCar() && !testCar.isEngineRunning()) {
            System.out.println("[PASS] Test 4: Car shut down successfully in Park.");
            score++;
        } else {
            System.out.println("[FAIL] Test 4: Car failed to shut down in Park.");
        }

        System.out.println("\n=================================");
        System.out.println("Final Score: " + score + "/4 Tasks Correct.");
        System.out.println("=================================");
    }
}
