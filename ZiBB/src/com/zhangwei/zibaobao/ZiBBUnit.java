package com.zhangwei.zibaobao;

import java.util.ArrayList;
import java.util.List;

public class ZiBBUnit {
	public String A;
	public String B;
	public int N;
	public ZiBBUnit(String A, String B, int N){
		this.A = A;
		this.B = B;
		this.N = N;
	}
	public String search(String input) {
		// TODO Auto-generated method stub
		boolean found = false;
		if(A!=null && A.contains(input)){
			found = true;
		}
		
		if(B!=null && B.contains(input)){
			found = true;
		}
		
		if(found){
			return toString();
		}else{
			return null;
		}
	}
	
	@Override
	public String toString(){
		return "A面是" + A + ", B面是" + B + ", 在第" + N + "单元";
	}

}
