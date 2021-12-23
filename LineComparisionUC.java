public class LineComparisionUC {
	public static void main(String[] args) {
	int x1, x2, x3, x4, y1, y2, y3, y4;
	double answer;
	double answer2;
	x1=2;
	x2=4;
	x3=3;
	x4=10;
	y1=4;
	y2=6;
	y3=5;
	y4=7;
	answer= Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	answer2= Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
	if(answer==answer2){
		System.out.println("Lines are equall");
	}
	else {
		System.out.println("Lines are not equall");
	}

	}
}


