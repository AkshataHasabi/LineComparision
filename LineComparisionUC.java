public class LineComparisionUC {
	public static void main(String[] args) {
	int x1, x2, x3, x4, y1, y2, y3, y4;
	
	x1=2;
	x2=4;
	x3=3;
	x4=10;
	y1=4;
	y2=6;
	y3=5;
	y4=7;
	int Line1 = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	int Line2= (int) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
	int result = Integer.compare(Line1,Line2);
	
	if(result > 0){
		System.out.println("Line1 is greater than Line2");
	}
	else if(result < 0){
		System.out.println("Line1 is less than Line2");
	}
	else{
		System.out.println("Line1 is equall to Line2");
	}

	}
}


