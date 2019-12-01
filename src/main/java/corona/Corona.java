package corona;

import java.util.Arrays;
import java.util.Random;

import ammo.Ammo;
import type.BType;

public class Corona {
	
	/**
	 * 随机获取一个数
	 * @param array 随机生成的抽取数组
	 * @return
	 */
	public static int bullet(int[] array){
		Random random = new Random();
		int number = random.nextInt(array.length) + 1;
		return array[number - 1];
	}
	
	/**
	 * 获取一个区的数组
	 * @param index 
	 * @param num 区的id
	 */
	public static int[] rotate(String type, String qid){
		int index, num; // 游标长度，数量
		
		if(type.equals(BType.DLT)){
			if(qid.equals(BType.HEAD)){
				index = BType.DLT_H;
				num = BType.DLT_H_I;
			}else{
				index = BType.DLT_T;
				num = BType.DLT_T_I;
			}
		}else{
			if(qid.equals(BType.HEAD)){
				index = BType.SSQ_H;
				num = BType.SSQ_H_I;
			}else{
				index = BType.SSQ_T;
				num = BType.SSQ_T_I;
			}
		}
		
		int[] array = new int[num];
		int number = 0;
		
		for(int i = 0; i < num; i++){
			int[] ammo = Ammo.ammo(index);
			
			while(true){
				boolean flag = false;
				number = bullet(ammo);
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
		
		Arrays.sort(array);
		return array;
	}
	
	public static void main(String[] args) {
		Corona c = new Corona();
		int i[] = c.rotate(BType.DLT, BType.HEAD);
		System.out.println(Arrays.toString(i));
	}
	
}
