package thread;

public class Phonepe {

	public static void main(String[] args) {
		Transaction t=new Transaction();
		t.start();

		OTP otp=new OTP();
		otp.start();
	}

}
