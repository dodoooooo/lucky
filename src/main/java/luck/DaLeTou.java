package luck;

import java.util.Arrays;

import corona.Corona;                              
import type.BType;

public class DaLeTou {

	
	public void roll(int num){
		for(int i = 0; i < num; i++){
			int head_num[] = Corona.rotate(BType.DLT, BType.HEAD);
			int tail_num[] = Corona.rotate(BType.DLT, BType.TAIL);
			System.out.println(Arrays.toString(head_num) + Arrays.toString(tail_num));
		}
	}
	
	public void roll2(int num){
		for(int i = 0; i < num; i++){
			int head_num[] = Corona.rotate(BType.SSQ, BType.HEAD);
			int tail_num[] = Corona.rotate(BType.SSQ, BType.TAIL);
			System.err.println(Arrays.toString(head_num) + Arrays.toString(tail_num));
		}
	}
	
	public static void main(String[] args) {
		DaLeTou d = new DaLeTou();
		d.roll2(5);
	}
	
}
