package msl.Collections.enums;

/**
 * @author student
 *
 */
public enum compTshirtSize {
	S(1,2,3), M(1,2,3), L(1,2,3), XL(1,2,3);
	private int chestWidth;
	public int getChestWidth() {
		return chestWidth;
	}
	public int getNeckSize() {
		return neckSize;
	}
	public int getSleeveLength() {
		return SleeveLength;
	}
	private int neckSize;
	private int SleeveLength;
	private compTshirtSize(int chestWidth, int neckSize, int sleeveLength) {
		this.chestWidth = chestWidth;
		this.neckSize = neckSize;
		SleeveLength = sleeveLength;
	}	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
