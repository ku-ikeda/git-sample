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
	
	public Car() {}
	
	public Car(Integer speed, String bodyColor) {
		super();
		this.speed = speed;
		this.bodyColor = bodyColor;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", bodyColor=" + bodyColor + "]";
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
}
