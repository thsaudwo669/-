package Week2;

public class ThreeDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale[][][] = new int[][][] {{{10,20,30,40},{11,22,33,44}},{{60,70,80,90},{66,77,88,99}}};
		
		for(int i=0; i<2; i++)
			for(int j=0; j<2; j++)
				for(int k=0; k<4; k++)
					System.out.print(sale[i][j][k]);
					//System.out.printf("%d/4ºÐ±â : sale[%d][%d][%d] = %d %n", k+1, i, j, k, sale[i][j][k]);

	}

}
