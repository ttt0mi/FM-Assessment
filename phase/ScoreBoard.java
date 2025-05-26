import java.util.Arrays;

public class ScoreBoard{

	public static int[] calculateTotal(int[][] scoreboard){

		int sum1 = 0;
		int sum1Counter = 0;
		int sum2 = 0;
		int sum2Counter = 0;

		for(int i2 = 0; i2 < scoreboard[0].length; i2++){
				sum1 += scoreboard[0][i2];
				sum1Counter++;
				sum2 += scoreboard[1][i2];
				sum2Counter++;
		}

		return new int[] {sum1, sum2};

	}


	public static float[] calculateAvg(int[][] scoreboard){

		int sum1 = 0;
		int sum1Counter = 0;
		int sum2 = 0;
		int sum2Counter = 0;

		for(int i2 = 0; i2 < scoreboard[0].length; i2++){
				sum1 += scoreboard[0][i2];
				sum1Counter++;
				sum2 += scoreboard[1][i2];
				sum2Counter++;
		}

		float avg1 = (float) sum1/sum1Counter;
		float avg2 = (float) sum2/sum2Counter;


		return new float[] {avg1, avg2};
		//return new float[] {Math.round(avg1), Math.round(avg2)};

	}


	public static int[] calculatePos(int[][] scoreboard){

		int sum1 = 0;
		int sum1Counter = 0;
		int sum2 = 0;
		int sum2Counter = 0;

		for(int i2 = 0; i2 < scoreboard[0].length; i2++){
				sum1 += scoreboard[0][i2];
				sum1Counter++;
				sum2 += scoreboard[1][i2];
				sum2Counter++;
		}
				
		int position1 = 0;
		int position2 = 0;

		if(sum1 > sum2){
			position1 = 1;
			position2 = 2;
		}
		else if(sum1 < sum2){
			position1 = 2;
			position2 = 1;
		}
		else if(sum1 == sum2){
			position1 = 1;
			position2 = 1;
		}

		return new int[] {position1, position2};


	}


	public static void main(String... args){

	int [][] scoreboard = {{3, 3, 4}, {9, 1, 3}};

	System.out.println(Arrays.toString(calculateTotal(scoreboard)));
	System.out.println(Arrays.toString(calculateAvg(scoreboard)));
	System.out.println(Arrays.toString(calculatePos(scoreboard)));

}}