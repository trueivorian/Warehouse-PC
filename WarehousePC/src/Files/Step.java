package Files;

import java.awt.geom.Point2D;

public class Step {

	private Point2D coordinate;

	private String command;

	private int quantity;

	public Step(String command, Point2D coordinate) {
		this.command = command;
		this.coordinate = coordinate;
	}

	public Step(String command, int quantity, Point2D coordinate) {
		this.command = command;
		this.coordinate = coordinate;
		this.quantity = quantity;
		this.quantity = 0;
	}

	public Point2D getCoordinate() {
		return coordinate;
	}

	public String getCommand() {
		return command;
	}

	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return coordinate.getX() + coordinate.getY() + command + quantity;
	}

	@Override
	public boolean equals(Object s) {
		Step step = (Step)s;
		return coordinate.equals(step.getCoordinate()) && command.equals(step.getCommand())
				&& quantity == step.getQuantity();
		//return true;
	}
}
