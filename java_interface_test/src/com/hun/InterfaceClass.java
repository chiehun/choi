package com.hun;


// Interface�� ��ü�� ���� �Ұ��� (���(�Ϲ� Ŭ����) �� �Ұ���
// Interface ������ �ѹ��� ���� ��� ����.
//�Ϲ� Ŭ������ Interface�� ����(implements) ���� �� �ִ�.
//�Ϲ� Ŭ������ Interface���� �ѹ��� ������ ���� ���� �� �ִ�.
public interface InterfaceClass extends InterfaceClass2, InterfaceClass3{ // ������ �� ��ɿ� ���� �޼��� �� ����
	
	// Interface ���� �Ҷ� ��� �ϴ� ��� 
	// ����� ���� ����
int a=100; //(���)  // static final int a=100; ����� ������ ��
// ������ ������ �� ����
	//
	//public interfaceClass() {
//}

//�޼��� ����θ� ����( {  } ��� �Ұ���)
	public void avg();  // �̰� � �ǹ̸� ������?!
	public int avg(float f1, float f2);
	public void avg(int n1, int n2);


}
