package inheritanceExersize2;

public class plasticBox extends Box {
    private double leangth;
    private double width;
    private double height;
	public plasticBox(String name, double leangth, double width, double height) {
		super(name);
		this.leangth = leangth;
		this.width = width;
		this.height = height;
	}
	


public void calcVolume() {
	   double volume1 = leangth*width*height;
	   setVolume(volume1);
   }
}
