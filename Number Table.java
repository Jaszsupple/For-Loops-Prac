public class numberTable {

	public static void main(String[] args) {
  
    for (int rows = 1; rows <= 9; rows++) {
			for (int column = 1; column <= 9; column++) {
				System.out.print(column * rows + ("\t"));
				
			}
			System.out.println();
		}
	}

}
