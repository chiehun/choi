package com.freeflux;

public class MainClass {

	public static void main(String[] args) {
		
		DataClass d=TextClass.creatObject();
		//System.out.println(d.depts[2].dept_id);
		// 0. �˻� ���� ����
		char searchGender='F';
		/** �л� ���� �迭(students)�κ��� ���л� �˻� �޼��� ȣ��**/
		
		
		String[] result=TextClass.searchinfo(searchGender, d.students);
		for(int idx=0; idx<result.length; idx++) {
			
		}
		
		/**2. �л��������ڿ� �и� �޼���**/
		String[] names=TextClass.StringSplit(result[0]);
		String[] dept_id=TextClass.StringSplit(result[1]);		
		
		/**�а���ȣ�� �̿��ؼ� �а��� ���� �޼���**/
		
	String[] deptNames=TextClass.convertDept(dept_id, d.depts); //�а� ��ȣ ��
	
	/**����� ���ϴ� �޼���*/
	 double avg=TextClass.avg(result[2], result[3]);
	 
	/**5. ��ü ����� ����ϴ� �޼���**/
	 
	 TextClass.answer( names, deptNames, avg);
	 
	}//main
	
} // class END



