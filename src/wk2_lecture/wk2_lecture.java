package wk2_lecture;

public class wk2_lecture {
	//members
	private static Helper helper = new Helper();
	
	public static void main(String[] args) {
		//30n^3 + 15n^2 + 10 = , n = 1
		helper.printPolyDemo(1);
		//30n^3 + 15n^2 + 10 = , n = 10
		helper.printPolyDemo(10);
		//30n^3 + 15n^2 + 10 = , n = 100
		helper.printPolyDemo(100);

	}

}
