package kr.ac.kopo.day14.homework;

import java.util.Random;

public class Myrandom extends Random {
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return super.nextInt(bound) + 1;
	}
}
