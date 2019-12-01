package ammo;

import java.util.Arrays;
import java.util.Random;

public class Ammo {
	
	public static int[] ammo(int num){
		int[] array = new int[num];
		
		Random random = new Random();
		for(int i = 0; i < num; i++){
			int number = 0;
			while(true){
				boolean flag = false;
				number = random.nextInt(num) + 1;
				for(int j = 0; j < i; j++){
					if(number == array[j]){
						flag = true;
						break;
					}
				}
				if(!flag){
					break;
				}
			}
			array[i] = number;
		}
		return array;
	}
	
}
