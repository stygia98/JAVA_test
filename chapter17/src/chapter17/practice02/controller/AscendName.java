package chapter17.practice02.controller;

import java.util.Comparator;
import chapter17.practice02.model.StudentVo;

public class AscendName implements Comparator<Object>{
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof StudentVo && o2 instanceof StudentVo) {
			StudentVo s1 = (StudentVo) o1;
			StudentVo s2 = (StudentVo) o2;
			int compareCheck = s1.getName().compareTo(s2.getName());
			
			if(compareCheck == 0)
				compareCheck = s1.getTotal()-s2.getTotal();
			return compareCheck;
		}
		return 0;		
	}

}
