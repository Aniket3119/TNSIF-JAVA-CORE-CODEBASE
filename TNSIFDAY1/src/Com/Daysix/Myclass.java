package Com.Daysix;

public class Myclass {
	
	private int section;
	
	private static int srNo;
	
	static
	
	{
		System.out.println("-------Within Static block-------");
		srNo=1000;
		//section=101;
		
	}

	public Myclass() {

		System.out.println("-----Within  Default Constructor-----");
		srNo++;
		section++;
		
		
	}

	@Override
	public String toString() {
		return "Myclass [serial No "+srNo+",section=" + section + "]";
	}
	static void display() {
	
		//System.out.println("Section :"+ section);
		
		System.out.println("serial No :"+ srNo );
	}

}
