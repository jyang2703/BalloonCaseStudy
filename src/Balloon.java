
/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class Balloon {
	private int xCenter, yCenter, radius;
	private Color color;
	
	Balloon b = new Balloon(100, 100, 20, Color.RED);
	System.out.println(b);

	public Balloon() {
		xCenter = 0;
		yCenter = 0;
		radius = 50;
		color = Color.BLUE;
	}

	public Balloon(int x, int y, int r, Color c) {
		xCenter = x;
		yCenter = y;
		radius = r;
		color = c;
	}

	public int getX() {
		return xCenter;
	}

	public int getY() {
		return yCenter;
	}

	public int getRadius() {
		return radius;
	}

	public Color getColor() {
		return color;
	}

	public double distance(int x, int y) {
		double dx = x - xCenter;
		double dy = y - yCenter;
		return Math.sqrt(dx * dx + dy * dy);
	}

	public void move(int x, int y) {
		xCenter = x;
		yCenter = y;
	}

	public void setRadius(int r) {
		radius = r;
	}

	public boolean isInside(int x, int y) {
		return distance(x, y) < 0.9 * radius;
	}

	public boolean isOnBorder(int x, int y) {
		double d = distance(x, y);
		return d >= 0.9 * radius && d <= 1.1 * radius;
	}

	public void draw(Graphics g, boolean makeItFilled) {

	}
}
