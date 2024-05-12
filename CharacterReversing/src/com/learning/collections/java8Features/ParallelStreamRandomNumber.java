package com.learning.collections.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamRandomNumber {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int number=1000000;
		List<Integer> list=getRandomNumber(number);
		long startTime = System.currentTimeMillis();
		long sumSequential=calculateSumSequential(list);
		long endTime = System.currentTimeMillis();
		long tottime = endTime - startTime;
		long seconds = (tottime / 1000) % 60;
		System.out.println(seconds);
		
		long startTime1 = System.currentTimeMillis();
		long endSequential=calculateParallerStream(list);
		long endTime1 = System.currentTimeMillis();
		long tottime1 = endTime1 - startTime1;
		long seconds1 = (tottime1 / 1000) % 60;
		System.out.println(seconds1);
		
		System.out.println("Sum using sequential stream "+sumSequential);
		System.out.println("Time taken (sequential):"+tottime);
		System.out.println("Sum using parallel stream:"+endSequential);
		System.out.println("Time taken (sequential):"+tottime1);
	}
	public static List<Integer> getRandomNumber(int values) {
		List<Integer> num = new ArrayList();
		Random ran = new Random();
		for (int i = 0; i < values; i++) {
			num.add(ran.nextInt(100));
		}
		return num;
	}

	public static long calculateSumSequential(List<Integer> num) {
		return num.stream().mapToLong(Integer::intValue).sum();
	}
	
	public static long calculateParallerStream(List<Integer> num) {
		return num.parallelStream().mapToLong(Integer::intValue).sum();
	}
}
