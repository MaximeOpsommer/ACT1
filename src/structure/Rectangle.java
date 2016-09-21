package structure;

public class Rectangle {

	/**
	 * x1 = South-West
	 * x2 = South-East
	 * y1 = North-West
	 * y2 = North-East
	 * */
	private Point x1, x2, y1, y2;
	private int height, width;
	
	public Rectangle(Point x1, Point x2, Point y1, Point y2) throws Exception {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.height = y1.getY() - x1.getY();
		if(this.height != (y2.getY() - x2.getY()))
			throw new Exception("The rectangle cannot be created : Invalid coordonates");
		this.width = x2.getX() - x1.getX();
		if(this.width != (y2.getX() - y1.getX()))
			throw new Exception("The rectangle cannot be created : Invalid coordonates");
	}
	
	public Point getX1() {
		return x1;
	}
	
	public Point getX2() {
		return x2;
	}
	
	public Point getY1() {
		return y1;
	}
	
	public Point getY2() {
		return y2;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getSurface() {
		return height*width;
	}
	
}
