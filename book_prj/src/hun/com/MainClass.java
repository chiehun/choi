package hun.com;

public class MainClass {

	public static void main(String[] args) {
		DateClass dc = new DateClass(); // BookClass[] books

		String name = "고경희";
		// 고경희 책만 구매할 경우 /책 제목과 /최종 구매가격을/ 출력...//할인 가격

		// System.out.println(dc.books[0].rPrice);
	
		for (int i = 0; i < dc.books.length; i++) {
			// System.out.print("도서 가격 : "+dc.books[i].price +"원"+" ");
			// System.out.println("판매가격"+ dc.books[i].rPrice+"원");
		}
		//저자 책 장바구니 담기
		for (int idx = 0; idx < dc.books.length; idx++) {
			if (dc.books[idx].author.equals(name)) {
				dc.books[idx].cart = true;// 장바구니 담기
			}
		}// 장바구니 담기 끝
		String titles="";
		int sumPrice=0;
		for (int idx = 0; idx< dc.books.length; idx++) {
			if (dc.books[idx].cart == true) {
				titles=titles+dc.books[idx].title+",";// 제목들 저장
				sumPrice=sumPrice+dc.books[idx].rPrice;
			}
		}// 장바구니에 담긴 책 제목과 가격 합 구하기
		System.out.println(titles);
		String[] titleArray=titles.split(",");
		System.out.println("구매 도서명");
		System.out.println("---------------------");
				for (int idx = 0; idx <titleArray.length; idx++) {
					System.out.println(titleArray[idx]);
			
			}
				System.out.println("-------------------");
				System.out.println("총 구매 가격 :"+sumPrice+"원");
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
