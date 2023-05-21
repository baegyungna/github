package github;

public class gugudan {

	public static void main(String[]args) {
		int[][]subject=new int[10][10];
		
		for (int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				subject[i][j]=i*j;
			}
		}
		for(int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.printf("%d*%d=%d ", i, j, subject[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int x=1;x<subject.length;x++) {
			for(int y=1;y<subject.length;y++) {
				subject[x][y]=x*y;
			}
		}
		for (int x=1;x<subject.length;x++) {
			for(int y=1;y<subject.length;y++) {
			System.out.println(x+"*"+y+"="+subject[x][y]+"\t");
			}
			System.out.println();
		}
			}
		}
