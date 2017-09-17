package com.abstractexample;
/*
 * This class is a example of abstract method and bit logic
 * 
 */
public class Main {// Main class
	public static void main(String[] args) { // main Method
		
		Circel circle=new Circel(); //object of circle class
		circle.findArea(); // circle class method called to print area
		circle.findPerimeter();// circle class method called to print parameter
		
		System.out.println("\n"); // just for space
		
		Rectangel rect=new Rectangel(); // object for rectangle class
		rect.findArea(); // rectangle class method called to print rectangle parameter
		rect.findPerimeter();// rectangle class method called to print rectangle parameter
		
		System.out.println("\n");// just for space
		
		Triangle triangle= new Triangle();// object for triangle
		triangle.findArea(); // triangle method to find area
		triangle.findPerimeter();// triangle to find parameter
		
	}

}

abstract class Claculation{ // abstract class 
	
	double dim1; // instance variable
	abstract void findArea(); // abstract method
	abstract void findPerimeter();// abstract method
	
}

class Circel extends Claculation{ // class circle extends calculation class 
	
	double dim1= 16; // circle diameter

	@Override
	void findArea() {
	   float halfOfDimeter=16 / 2; // diameter divided by 2 so is 8
	   float dimeterofcircle= halfOfDimeter*halfOfDimeter;// 8 * 8 = 64 
	   float resultArea= (float) (3.14 * dimeterofcircle);// 64 * 3.14
	   System.out.println(" Area of circle is : " + resultArea); // result
	   
	}

	@Override
	void findPerimeter() {
		
		float dimeterofCircle=16; // diameter is 16
		float resultDimeter=  (float) (3.14 * dimeterofCircle); // 3.14 * 16
		System.out.println(" Perimeter of Circle is : " + resultDimeter);	// result
		
	}
	
	
	
}
class Rectangel extends Claculation{// class Rectangle extends calculation class 

	@Override
	void findArea() { // method to find area
		int rectLenght= 6;// rectangle length
		int rectheight= 2;// rectangle height
		int resultArea= rectLenght*rectheight;  //  Length * height
		
		System.out.println("Rectangle area: " + resultArea);	// result	
	}

	@Override
	void findPerimeter() {// method to find area
		int rectLenght= 6; // rectangle length
		int rectheight= 2;// rectangle height
		int resultArea= rectLenght+rectheight;//  Length + height
		
		System.out.println("Rectangle perimeter: " + resultArea);// result
		
	}
	
}

class Triangle extends Claculation{// class triangle extends calculation class 

	@Override
	void findArea() {
		int triangrightleheight=10;// triangle right height is 10
		int triangleleftheight=10;// triangle left height is 10
		int triangleBase= 10;// triangle base is 10
		
		int AreaCalculation=triangrightleheight*triangleleftheight / 2; //  right height * left height / 2
	    
		System.out.println("Area of triangle: " + AreaCalculation ); // result


		
	}

	@Override
	void findPerimeter() {
		int triangrightleheight=10;// triangle right height is 10
		int triangleleftheight=10;// triangle left height is 10
		int triangleBase= 10;// triangle base is 10
		
		int AreaCalculation=triangrightleheight+triangleleftheight+triangleBase;//  right height * left height + base of triangle
	    
		System.out.println("perimeter of triangle: " + AreaCalculation );// result

		
	}
	
}