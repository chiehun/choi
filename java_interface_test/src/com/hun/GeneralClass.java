package com.hun;


// Interface�� �Ϲ� Ŭ�������� ��ӵ� �� ����..
// public class GeneralClass extends InterfaceClass{

// Interface�� �Ϲ� Ŭ�������� ���� ����
// Interface�� ����� ���� �޼������ �ݵ�� �����ؾ� �Ѵ�.
// ���� ���� ��ɵ��� ������ �ؾ� �Ѵ�
// �ϴ� Ŭ������ ��ӵ� �ް� �������̽��� ������ �ִ�
public class GeneralClass extends AbstractClass implements InterfaceClass, InterfaceClass2{
	// �ɹ�(�ν��Ͻ�) ���� ���� // �޼��� ����

	
	// ������ ����
	public GeneralClass() {
	
}

	@Override
	public void avg() { // �߻� Ŭ����(AbstractClass) ������ �߻� �޼��� ���� ������!!
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sum(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int avg(float f1, float f2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void avg(int n1, int n2) {
		// TODO Auto-generated method stub
		
	}
}