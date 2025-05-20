import java.util.HashSet;
import java.util.Set;

public class OTP {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean areUnique(int[] otps) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int otp : otps) {
            uniqueSet.add(otp);
        }
        return uniqueSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
		
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs = ");
        for (int otp : otps) {
            System.out.println(otp);
        }

        if (areUnique(otps)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
}
