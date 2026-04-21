class OTPGenerator {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }
    public static int[] generateOTPArray(int size) {
        int[] otpArray = new int[size];
        for (int i = 0; i < size; i++) {
            otpArray[i] = generateOTP();
        }
        return otpArray;
    }
    public static boolean areAllUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] otpArray = generateOTPArray(10);

        for (int otp : otpArray) {
            System.out.println(otp);
        }

        System.out.println(areAllUnique(otpArray));
    }
}