package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import structure.Point;


public class CoordReader {

	private BufferedReader buffer;
	private String file;

	public CoordReader (String file){
		this.file = file;
	}
	
	public int getL() throws NumberFormatException, IOException{
		buffer = new BufferedReader(new FileReader(this.file));
		return Integer.parseInt(buffer.readLine().split(" ")[0]);
	}
	
	public int getH() throws NumberFormatException, IOException{
		buffer = new BufferedReader(new FileReader(this.file));
		return Integer.parseInt(buffer.readLine().split(" ")[1]);
	}
	
	public int getN() throws NumberFormatException, IOException{
		buffer = new BufferedReader(new FileReader(this.file));
		buffer.readLine();
		return Integer.parseInt(buffer.readLine().split(" ")[0]);
	}
	
	public List<Point> getListPoint() throws IOException{
//	public void getListPoint() throws IOException{
		int n = getN(), x, y;
		String currentLine;
		String[] split = new String[2];
		List<Point> list = new ArrayList<Point>();
		buffer = new BufferedReader(new FileReader(this.file));
		buffer.readLine();
		buffer.readLine();
		for(int i = 0; i<n;i++){
			currentLine = buffer.readLine();
			split = currentLine.split(" ");
			x = Integer.parseInt(split[0]);
			y = Integer.parseInt(split[1]);
			list.add(new Point(x,y));
		}
		return list;
	}
	
	public static void main(String args[]){
		CoordReader cr = new CoordReader("data/ex10_24400144");
		List<Point> list = new ArrayList<Point>();
		try {
			list = cr.getListPoint();
			for(Point p : list){
				System.out.println(p);
			}
		} catch (IOException e) {
			System.out.println("IO FAILED");
		}
	}
	
}
