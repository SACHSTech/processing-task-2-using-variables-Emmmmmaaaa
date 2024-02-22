import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  public void setup() {
    background(138, 181, 237);
  }
  public void draw() {
	  // verible 
    int length = 400; 
    int width = 400;  

    // background
      fill(21, 153, 51);
      rect(0,(float)(width *0.625),length, width);
  
    // roof
      fill(150,58,38);
      triangle((float)(length * 0.25), (float)(width * 0.5), (float)(length * 0.5), (float)(width*0.2),(float)(length*0.75),(float)(width*0.5));  
  
    //main part of house
      fill(255,77,207);
      rect((float)(length*0.25),(float)(width*0.5),(float)(length*0.5),(float)(width*0.5));
  
    // window 
      fill (247, 188, 224);
      rect((float)(length*0.325), (float)(width*0.6), (float)(length*0.175), (float)(width*0.175));
  
    //door 
      fill (211, 188, 247);
      rect((float)(length*0.575), (float)(width*0.775), (float)(length*0.15), (float)(width*0.25));
  
    //door knob
      fill(205, 219, 96);
      ellipse((float)(length*0.625), (float)(width*0.9), (float)(width*0.025), (float)(length*0.025));
  }
  
  // define other methods down here.
}