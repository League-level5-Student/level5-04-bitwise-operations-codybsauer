package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public void printByteBinary(byte b) {
		
		for(int j= 7; j >= 0; j-- ) {
			byte mask = (byte) (b >> j);

			if((mask & 1) > 0){
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
			
			if(j==7) {
				System.out.print("b");
			}
		}
		
		System.out.println();
	}
	
	public void printShortBinary(short s) {
		for(int j= 15; j >= 0; j-- ) {
			short mask = (short) (s >> j);
			
			if((mask & 1) > 0){
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		
			if(j==15) {
				System.out.print("b");
			}
		}
		System.out.println();
	}
	
	public void printIntBinary(int i) {
		for(int j= 31; j >= 0; j-- ) {
			int mask = i >> j;
			
			if((mask & 1) > 0){
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		
			if(j==31) {
				System.out.print("b");
			}
		}
		
		System.out.println();
	}
	
	public void printLongBinary(long l) {
		for(int j= 63; j >= 0; j-- ) {
			long mask = l >> j;
			
			if((mask & 1) > 0){
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
		
			if(j==63) {
				System.out.print("b");
			}
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		bp.printByteBinary(Byte.MAX_VALUE);
		bp.printShortBinary(Short.MAX_VALUE);
		bp.printIntBinary(Integer.MAX_VALUE);
		bp.printLongBinary(Long.MAX_VALUE);
	}
}
