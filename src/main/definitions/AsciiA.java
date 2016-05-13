package main.definitions;

import java.util.ArrayList;

public class AsciiA extends Letters {

	// Constructor
		public AsciiA () {
			this.realLetter ="A";
			this.height = 3;
			this.width = 5;
		
		}

		@Override
		public ArrayList<String> printAsciiPatern1(ArrayList<String> pattern) {
			ArrayList<String> res  = new ArrayList<String>();

			res.add(" # ");
			res.add("# # ");
			res.add("### ");
			res.add("# # ");
			res.add("# # ");

			return res;
		}

		@Override
		public ArrayList<String> printAsciiPatern2(ArrayList<String> pattern) {
			ArrayList<String> res = new ArrayList<String>();

			res.add("  ##   ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("###### ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");

			return res;
		}
	


			
}
