package jp.co.sample.Class;

/**
 * 車に関するドメイン
 * 
 * @author yu.terauchi
 *
 */
public class Car {
	/**スピード*/
	private Integer speed;
	/**車体の色*/
	private String bodyColor;
	
	private int price;

	public Car() {}
	
	public Car(Integer speed, String bodyColor, int price) {
		super();
		this.speed = speed;
		this.bodyColor = bodyColor;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", bodyColor=" + bodyColor + ", price=" + price + "]";
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
