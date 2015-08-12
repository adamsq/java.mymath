import java.util.Random;

public class Vector {

	public static int x1;
	public static int x2;
	public static int y1;
	public static int y2;

	public static void main(String[] args) {
		
		InitAB();
		
		Mframe myframe = new Mframe();
		Mpanel mypanel = new Mpanel();
		myframe.add(mypanel);
	}

	public static void InitAB() {

		Random random = new Random();
		x1 = random.nextInt(10);
		x2 = random.nextInt(10);
		y1 = random.nextInt(10);
		y2 = random.nextInt(10);
		
	}

	public static String StringCoorA() {
		return "A = (" + x1 + "," + y1 + ")";
	}

	public static String StringCoorB() {
		return "B = (" + x2 + "," + y2 + ")";
	}

	public static String StringCoorAB() {
		return "AB = (" + (x2-x1) + "," + (y2-y1) + ")";
	}

	public static String StringCosAB() {
		return "COS(AB) = " + String.format("%.2f",CosAB());
	}

	public static int MultiplyAB() {
		return x1 * x2 + y1 * y2;
	}

	public static double CosAB() {
		double cosab =	 (x1 * x2 + y1 * y2) / (Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2)) 
				* Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2)));
		return cosab;
	}

}
