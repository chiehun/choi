package com.hun;

public abstract class AbstractClass {

	// �߻� Ŭ���� = �Ϲ� Ŭ���� + interface
	// �߻�Ŭ������ ����� ���� �����ڸ� ����
	// ��, new �����ڷ� ��ü ���� �Ұ���...\
	// �߻� Ŭ���� ���� : abstract class Ŭ������
	public  AbstractClass() {		
		// ��� ����  / ��� ��� ���� ���ɤ���
	}
	// �Ϲ� �޼��� ���� ����
	public void max() {
		System.out.println("�׽�Ʈ");
	}
	// �߻� �޼��� ���� ���� ( �޼���� ����)
	public abstract void avg();  // ��ӹ޴� Ŭ�������� �ݵ�� ���� ������!!!(interface �� ����)
	
}
