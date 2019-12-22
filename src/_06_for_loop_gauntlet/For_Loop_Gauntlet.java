package _06_for_loop_gauntlet;

public class For_Loop_Gauntlet {
public static void main(String[] args) {
	for (int i=0; i<101; i++) {
		System.out.println(i);
	}
	for (int j=100; j>-1; j--) {
		System.out.println(j);
	}
	for (int k=0; k<101; k++) {
		if (k % 2 == 0) {
			System.out.println(k);
		}
	}
	for (int l=1; l<101; l++) {
		if (l % 2 == 1) {
			System.out.println(l);
		}
	}
	for (int m=1; m<501; m++) {
		if (m % 2 == 0) {
			System.out.println(m+" is even");
		}
		else if (m % 2 == 1) {
			System.out.println(m+" is odd");
		}
	}
	for (int n=0; n<784; n++) {
		if (n % 7 == 0) {
			System.out.println(n);
		}
	}
	for (int o=2007; o<2020; o++) {
		System.out.println(o+",I was "+(o-2007)+" years old.");
	}
	for(int p=0; p<3; p++)
	for (int q = 0; q<3; q++) {
		System.out.println(p + "  " + q);
	}
	for(int r=0; r<3; r++) {
		for(int s=0; s<3; s++) {
			System.out.print((r*3)+(s+1));


		}
			System.out.println("");
		
	}
	for (int t=0; t<10; t++) {
		for(int u=0; u<10; u++) {
			System.out.print((t*10)+(u+1));
		}
		System.out.println("");
	}
}
}
