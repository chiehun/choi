package hun.com;

public class GePanClass {
	// 11968, "2020 07 08 Ŭ��������������7 (student, takes)" , "�豤��", 25
	int writenumber = 0;
	String topic = "";
	String name = "";
	int seachnumber = 0;

	// 0#��ȸ���� ����� ���ϴ� �޼ҵ�
	// 11968, "2020 07 08 Ŭ��������������7 (student, takes)" , "�豤��", 25
	// #1 ����ȸ���� ���ϴ� �޼ҵ�
	// ���� : ��ȸ���� �����ϴ� ���� ��ü �ο����� �����ϴ� ���� ��ȸ�� , ��ü �ο���
	// for�� ����ϰ� (������ȯ)�� float�� ���� ��ȯ�����ش�.
	public GePanClass(int wrtnum, String tp, String nm, int seach) {
		this.writenumber = wrtnum;
		this.topic = tp;
		this.name = nm;
		this.seachnumber = seach;

	}

	// ��ü ��ȸ���� ���ϴ� �޼ҵ�
	public  void seachsum(String a) {
			String seachsum=this.seachnumber+",";	// ���ڿ��� �������
			String sum[]=seachsum.split(",");		//["23"],["25"]
			String avg="";
			
			for(int idx=0; idx<topic.length(); idx++);{
				seachsum=((sum[0])+seachsum);
					}
			String avg=seachesum/topic.length();
	}
	public void avg() {
		int avg
		
	}
	}
