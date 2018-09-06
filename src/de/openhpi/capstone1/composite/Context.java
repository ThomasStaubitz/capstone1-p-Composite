package de.openhpi.capstone1.composite;
public class Context {

	public static void main(String[] args) {
		Composite frame = new Composite("Frame");
		Composite layoutTop = new Composite("TopLayout");
		Composite layoutBottom = new Composite("BottomLayout");
		
		Leaf textInput = new Leaf("textInput");
		Leaf button = new Leaf("Button");
		Leaf map = new Leaf("Map");
		
		layoutTop.add(textInput);
		layoutTop.add(button);
		layoutBottom.add(map);
		
		frame.add(layoutTop);
		frame.add(layoutBottom);
		
		System.out.println(frame);
		
	}

}