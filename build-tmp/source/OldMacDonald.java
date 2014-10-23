import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OldMacDonald extends PApplet {

//your variable declarations here
public void setup()
{
	Farm bubs = new Farm();
	bubs.animalSounds();
	//Cow c = new Cow("cow", "moo");
	//System.out.println(c.getType() + " goes " + c.getSound());//your java code here
}
interface Animal{
	public String getSound();
	public String getType();
}
class Cow implements Animal
{
	protected String mySound;
	protected String myType;
	public Cow(String type, String sound){
		mySound = sound;
		myType = type;
	}
	public Cow()    
  	{         
     myType = "unknown";         
     mySound = "unknown";     
  	}      
  	public String getSound(){return mySound;}     
  	public String getType(){return myType;} 

};

class NamedCow extends Cow{
	private String myName;
	public NamedCow(String type, String name, String sound){	
		myName = name;
		myType = type;
		mySound = sound;
	}
	public NamedCow(){
		myName = "unknown";
		
	}
	public String getName(){return myName;}
};


class Chick implements Animal
{
	private String mySound;
	private String myType;
	public Chick(String type, String sound1, String sound2){
		
		if (Math.random() < .5f){
			mySound = sound1;
		} else {
			mySound = sound2;
		}
		myType = type;
	}
	public Chick(String type, String sound){
		
		mySound = sound;
		myType = type;
	}
	
	public Chick()    
  	{         
     myType = "unknown";         
     mySound = "unknown";     
  	}      
  	public String getSound(){return mySound;}     
  	public String getType(){return myType;} 

};
class Pig implements Animal
{
	private String mySound;
	private String myType;
	public Pig(String type, String sound){
		mySound = sound;
		myType = type;
	}
	public Pig()    
  	{         
     myType = "unknown";         
     mySound = "unknown";     
  	}      
  	public String getSound(){return mySound;}     
  	public String getType(){return myType;} 

};
class Farm{
	private Animal[] aBunchOfAnimals = new Animal [3];
	public Farm(){
		aBunchOfAnimals[0] = new NamedCow("cow", "Elsie", "moo");
		aBunchOfAnimals[1] = new Chick("chick", "cheep", "cluck" );
		aBunchOfAnimals[2] = new Pig("pig","oink");

	}
	public void animalSounds()    
  	{        
    for (int nI=0; nI < aBunchOfAnimals.length; nI++)      
    {          
     System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
    }
    System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );      
  } 
};



//declare classes and the interface below
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OldMacDonald" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
