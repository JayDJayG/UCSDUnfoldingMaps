package guimodule;

import processing.core.PApplet; 
import processing.core.PImage;


public class MyDisplay extends PApplet{

	PImage img;
	
	public void setup() {
		
		size(800, 800);
		img = loadImage("https://images.unsplash.com/photo-1564053489984-317bbd824340?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2014&q=80", "jpg");
		img.resize(0, height);
		image(img, 0, 0);
	}
	
	public void draw() {
		  
	}
	
}
