package com.freeflux;

/** ��ü �Խñ� ������ ��� Ŭ���� 
 * @param boardList : ��ü �Խñ� ������ ��� �迭
 * **/
public class DataClass {

	BoardClass[] boardList = new BoardClass[18];

	public DataClass() { // �⺻������
	} // ������ END

	/** �ʱⵥ���͸� ����迭�� �����ϴ� �޼��� **/
	public void initBoards() {
		boardList[0] = new BoardClass(11968, "2020 07 08 Ŭ��������������7 (student, takes)", "�豤��", 25);
		boardList[1] = new BoardClass(11967, "2020 07 08 Ŭ��������������5 (�а�/�л�)", "������", 62);
		boardList[2] = new BoardClass(11965, "2020 07 07 Ŭ���� ���� ������ 4 (�μ�/���)", "������", 60);
		boardList[3] = new BoardClass(11966, "2020 07 07 Ŭ���� ���� ������ 4 ", "�����", 34);
		boardList[4] = new BoardClass(11964, "2020 07 07 Ŭ���� ���� ������ 3 (����) ", "�����", 65);
		boardList[5] = new BoardClass(11963, "2020 07 06 Ŭ���� ���� ������ 2 (�л�) ", "������", 44);
		boardList[6] = new BoardClass(11962, "2020 07 06 Ŭ���� ���� ������ (����) ", "���¼�", 48);
		boardList[7] = new BoardClass(11961, "2020 07 03 3���� ������ �޼��� ó�� ", "�豤��", 58);
		boardList[8] = new BoardClass(11960, "2020 07 03 split() �� Ŭ���� ���� ������", "������", 54);
		boardList[9] = new BoardClass(11959, "2020 07 02 ������ 3���� ���� ", "�ڱ���", 92);
		boardList[10] = new BoardClass(11958, "2020 07 02 split test ", "������", 53);
		boardList[11] = new BoardClass(11957, "2020 07 02 ��� ���������� ", "������", 64);
		boardList[12] = new BoardClass(11956, "�ڵ带 �������� �ۼ��ϴ� �� ", "�ڱ���", 43);
		boardList[13] = new BoardClass(11955, "���� ���� ��ư� �ڵ��ϴ� ��� ", "�豤��", 59);
		boardList[14] = new BoardClass(11954, "2020 07 01 Java Platform Standard Edition 8 Documentation ", "Amor vincit omnia", 29);
		boardList[15] = new BoardClass(11640, "2019 01 30 ����, �迭, ��ü, Ŭ���� (���� ���� ���� ���) ", "�ڱ���", 91);
		boardList[16] = new BoardClass(11640, "2019 01 30 ����, �迭, ��ü, Ŭ���� (���� ���� ���� ���) ", "�����", 95);
		boardList[17] = new BoardClass(11639, "2019 01 30 �⺻ ���� ���� ", "�����", 70);
	}
} // DataClass END