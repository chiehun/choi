package hun.com;

public class MainClass {

	public static void main(String[] args) {
		DateClass dc = new DateClass(); // BookClass[] books

		String name = "�����";
		// ����� å�� ������ ��� /å ����� /���� ���Ű�����/ ���...//���� ����

		// System.out.println(dc.books[0].rPrice);
	
		for (int i = 0; i < dc.books.length; i++) {
			// System.out.print("���� ���� : "+dc.books[i].price +"��"+" ");
			// System.out.println("�ǸŰ���"+ dc.books[i].rPrice+"��");
		}
		//���� å ��ٱ��� ���
		for (int idx = 0; idx < dc.books.length; idx++) {
			if (dc.books[idx].author.equals(name)) {
				dc.books[idx].cart = true;// ��ٱ��� ���
			}
		}// ��ٱ��� ��� ��
		String titles="";
		int sumPrice=0;
		for (int idx = 0; idx< dc.books.length; idx++) {
			if (dc.books[idx].cart == true) {
				titles=titles+dc.books[idx].title+",";// ����� ����
				sumPrice=sumPrice+dc.books[idx].rPrice;
			}
		}// ��ٱ��Ͽ� ��� å ����� ���� �� ���ϱ�
		System.out.println(titles);
		String[] titleArray=titles.split(",");
		System.out.println("���� ������");
		System.out.println("---------------------");
				for (int idx = 0; idx <titleArray.length; idx++) {
					System.out.println(titleArray[idx]);
			
			}
				System.out.println("-------------------");
				System.out.println("�� ���� ���� :"+sumPrice+"��");
		}
	}

/*
 * for(int idx =0; idx < dc.books.length; idx--) {
 * if(dc.books[idx].author.endsWith(name)) {
 * System.out.println(dc.books[idx].title.length());
 * 
 * 
 * }
 */

/*
 * String test="         ddd             dddd";
 * System.out.println("___"+test+"___");
 * System.out.println("___"+test.trim()+"____");
 */
