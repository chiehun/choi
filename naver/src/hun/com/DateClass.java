package hun.com;

public  class DateClass {
	
	GePanClass gp[] = new GePanClass[18];

	public DateClass() {
		// 11968, "2020 07 08 Ŭ��������������7 (student, takes)" , "�豤��", 25
	}

	public void initGePanClass() {
		gp[0] = new GePanClass(11968, "2020 07 08 Ŭ��������������7 (student, takes)", "�豤��", 25);
		gp[1] = new GePanClass(11967, "2020 07 08 Ŭ��������������5 (�а�/�л�)", "������", 62);
		gp[2] = new GePanClass(11965, "2020 07 07 Ŭ���� ���� ������ 4 (�μ�/���)", "������", 60);
		gp[3] = new GePanClass(11966, "2020 07 07 Ŭ���� ���� ������ 4 ", "�����", 34);
		gp[4] = new GePanClass(11964, "2020 07 07 Ŭ���� ���� ������ 3 (����) ", "�����", 65);
		gp[5] = new GePanClass(11963, "2020 07 06 Ŭ���� ���� ������ 2 (�л�) ", "������", 44);
		gp[6] = new GePanClass(11962, "2020 07 06 Ŭ���� ���� ������ (����) ", "���¼�", 48);
		gp[7] = new GePanClass(11961, "2020 07 03 3���� ������ �޼��� ó�� ", "�豤��", 58);
		gp[8] = new GePanClass(11960, "2020 07 03 split() �� Ŭ���� ���� ������", "������", 54);
		gp[9] = new GePanClass(11959, "2020 07 02 ������ 3���� ���� ", "�ڱ���", 92);
		gp[10] = new GePanClass(11958, "2020 07 02 split test ", "������", 53);
		gp[11] = new GePanClass(11957, "2020 07 02 ��� ���������� ", "������", 64);
		gp[12] = new GePanClass(11956, "�ڵ带 �������� �ۼ��ϴ� �� ", "�ڱ���", 43);
		gp[13] = new GePanClass(11955, "���� ���� ��ư� �ڵ��ϴ� ��� ", "�豤��", 59);
		gp[14] = new GePanClass(11954, "2020 07 01 Java Platform Standard Edition 8 Documentation ",	"Amor vincit omnia", 29);
		gp[15] = new GePanClass(11640, "2019 01 30 ����, �迭, ��ü, Ŭ���� (���� ���� ���� ���) ", "�ڱ���", 91);
		gp[16] = new GePanClass(11640, "2019 01 30 ����, �迭, ��ü, Ŭ���� (���� ���� ���� ���) ", "�����", 95);
		gp[17] = new GePanClass(11639, "2019 01 30 �⺻ ���� ���� ", "�����", 70);

	}
}
