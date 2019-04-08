
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N= 50;
		int [][] array = new int[N][N];
		for (int i=0; i<N; i++){
			for (int j=0; j<N; j++)
				{
				array[i][j]=(int) (Math.random()*10); 
				}
			// random 은 0<x<1.. so times 100 and +1 then change to int
		}
		for (int i=0; i<N; i++) {

			for (int j=0; j<N; j++)
			{
				System.out.print(array[i][j]+"");
			}
			System.out.println();
		}
		}
	}


