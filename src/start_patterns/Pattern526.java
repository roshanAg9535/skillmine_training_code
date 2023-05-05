package start_patterns;

public class Pattern526 {

	public static void main(String[] args) {
		
		int a = 5; int b=3;
		for(int i=1; i<=7; i++) {
			if(i<=4) { a--; b++; } else { a++; b--;} int num = 1;
			for(int j =1; j<=7; j++) {
				if(j>=a && j<=b)
				{
					System.out.print(num);
					num++;
				}
				else {
					System.out.print(" ");
					num++;
				}
			}
			System.out.println();
		}

	}

}
