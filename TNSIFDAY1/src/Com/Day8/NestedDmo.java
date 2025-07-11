package Com.Day8;

public class NestedDmo implements OuterInterface , OuterInterface.InnerInterface{
	
	@Override
	public void calArea() {
		System.out.println("Outer Interface");
		
	}

	@Override
	public void print() {
		System.out.println("Inner Interface");		
	}


}
