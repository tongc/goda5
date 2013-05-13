package com.goda5.hagendaz.common.util;

import java.util.ArrayList;
import java.util.List;

public class CovariantTest {
	abstract class A {
		public abstract List<String> test();
		public abstract ArrayList<String> test1();
	}
	
	class B extends A {
		@Override
		public ArrayList<String> test() {
			return null;
		}

		@Override
		public ArrayList<String> test1() {
			// TODO Auto-generated method stub
			return null;
		}
		
		//@Override
		//Won't compile, as java doesn't support contravariance.
		//public List<String> test1() {
		//	return null;
		//}
	}
}
