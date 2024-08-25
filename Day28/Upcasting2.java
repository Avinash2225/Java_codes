package Day28;

class Parent {
	static void google () 
	{
		
	}
static void Facebook () 
{
}  
	void Mobile () 
	{
		
	}
    void Charger () 
    {
	
		
	}
}

public class Upcasting2 extends Parent {
	static void Pen () 
	{
		
	}
static void Paper () 
{
		
	}
 void laptop () 
 {
	
}
 void Keyboard () 
 {
	
 }

	public static void main(String[] args) {

		Parent p1 = new Upcasting2();  // upcasting implicitely
		    p1.google();  
	        p1.Facebook(); 
	        p1.Mobile();  
	        p1.Charger();
		Parent p2 = (Parent) new Upcasting2();  // up casting explicitely
		    p2.google();  
	        p2.Facebook(); 
	        p2.Mobile();   
	        p2.Charger(); 
		
		Upcasting2 d1 = new Upcasting2();     // downcasting explicitely
		d1.Pen();       
        d1.Paper();     
        d1.laptop();    
        d1.Keyboard();
		
		
	}

}
