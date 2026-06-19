package chapter17.practice02.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter17.practice02.model.StudentVo;

public class StudentController {
//	private final int SUBJECT_NUM = 3;
	private List<StudentVo> sl;
	private List<StudentVo> csl;


	public StudentController() {
		this.sl = new ArrayList<StudentVo>();
//		this.csl = new ArrayList<StudentVo>();
	}

	public int addStudent(StudentVo svo) {
		try { 
			if(svo != null) {
				sl.add(svo); 
				return 1; 
			} else 
				return 0;
			} // end if
		catch (Exception e) { return 0; } // end try
	}
	
//	public void calcSumAvg(StudentVo student) {
//		//calculate the Sum
//		student.setTotal(student.getKor() + student.getMath() + student.getEng());
//		//calculate the Average
//		student.setAvg((double)(student.getKor() + student.getMath() + student.getEng()) / (double)SUBJECT_NUM);
//	}
	
	public List<StudentVo> printAll() {
		return sl;
	}
	
	public List<StudentVo> copyPrintAll() {
		return csl;
	}
	
	public StudentVo searchStudent(String name, int no){
		for (StudentVo svo : sl) {
			if(svo.getId() == no && svo.getName().equals(name)) {
				return svo;
			} // end if
		} // end for
		return null;
	}
	
	public StudentVo removeStudent(String name, int no){
		for (StudentVo svo : sl) {
			if(svo.getId() == no && svo.getName().equals(name)) {
				sl.remove(svo);
				return svo;
			} // end if
		} // end for
		return null;
	}

	public StudentVo updateStudent(int id, String name, StudentVo student){
		for (int i = 0; i < sl.size(); i++) {
			if(sl.get(i).getId() == id && sl.get(i).getName().equals(name)) {
				sl.set(i, student);
				return student;
			} // end if
		}  // end for
		return null;
	}

	public List<StudentVo> sortByTotalDesc() {
		try {
			csl = new ArrayList<StudentVo>(sl);
			
			Collections.sort(csl);
			
			for (int i = 0; i < csl.size(); i++) {
				if(i==0) { 
					csl.get(i).setRank(1); 
					continue;
				}
				if(csl.get(i).getTotal() == csl.get(i-1).getTotal())
					csl.get(i).setRank(csl.get(i-1).getRank());
				else csl.get(i).setRank(i+1);
			}
			return csl;
		} catch (Exception e) {
			return null;
		}

//		for (int i = 0; i < sl.size(); i++) {
//			System.out.println(sl.get(i));
//			System.out.println(csl.get(i));
//		}
	} // end func
	
	public List<StudentVo> sortByNameAsc() {
		try {
			csl = new ArrayList<StudentVo>(sl);
			
			Collections.sort(csl, new AscendName());
				
			return csl;
		} catch (Exception e) {
			return null;
		}
	} // end func
	
	public void setRank(List<StudentVo> sL) {
		int rankCount = 1;
		
		for (int i = 0; i < sL.size(); i++) {
			if(i == 0) sL.get(i).setRank(rankCount);
			
			if(i !=0 && sL.get(i).getTotal() == sL.get(i-1).getTotal())
				sL.get(i).setRank(sL.get(i-1).getRank());
			else sL.get(i).setRank(rankCount);
			
			rankCount++;
		} //end for
	}// end func
}
