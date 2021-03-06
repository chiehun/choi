package com.freeflux;

import java.util.ArrayList;

/** 전체 News 데이터 보유 하는 클래스 **/
public class DataClass {
	
	/** 전체 News 데이터 보유 하는 ArrayList **/
	ArrayList<NewsClass> news=new ArrayList<NewsClass>();
	
	public DataClass() {  // 기본 생성자
	} // 생성자 END
	
	
	/** news(ArrayList<NewsClass>)에  초기 데이터 삽입하는 메서드 **/
	public void initInsertNewsData() {
		news.add(new NewsClass("경향신문", "nsd16500796.gif", "newsstand.naver.com/032",  "종합지"));
		news.add(new NewsClass("국민일보", "nsd113224489.gif", "newsstand.naver.com/005",  "종합지"));
		news.add(new NewsClass("동아일보", "nsd162737318.gif", "newsstand.naver.com/020",  "종합지"));
		news.add(new NewsClass("서울신문", "nsd165611664.gif", "newsstand.naver.com/081",  "종합지"));
		news.add(new NewsClass("석간내일신문", "nsd162522149.gif", "newsstand.naver.com/086",  "종합지"));
		news.add(new NewsClass("석간문화일보", "nsd11502601.gif", "newsstand.naver.com/021",  "종합지"));
		news.add(new NewsClass("세계일보", "nsd104440320.gif", "newsstand.naver.com/022",  "종합지"));
		news.add(new NewsClass("조선일보", "nsd14948476.gif", "newsstand.naver.com/023",  "종합지"));
		news.add(new NewsClass("중앙일보", "nsd111948440.gif", "newsstand.naver.com/025",  "종합지"));
		news.add(new NewsClass("한겨례", "nsd185116392.gif", "newsstand.naver.com/028",  "종합지"));
		news.add(new NewsClass("한국일보", "nsd141114194.gif", "newsstand.naver.com/038",  "종합지"));
		news.add(new NewsClass("NEWis", "nsd165223437.gif", "newsstand.naver.com/003",  "방송통신"));
		news.add(new NewsClass("jijicom", "nsd112912516.gif", "newsstand.naver.com/376",  "방송통신"));
		news.add(new NewsClass("한국경제", "nsd10118864.gif", "newsstand.naver.com/215",  "방송통신"));
		news.add(new NewsClass("KBS", "nsd164033826.gif", "newsstand.naver.com/056",  "방송통신"));
		news.add(new NewsClass("MBC", "nsd1453778.gif", "newsstand.naver.com/214",  "방송통신"));
		news.add(new NewsClass("MBN", "nsd163758547.gif", "newsstand.naver.com/057",  "방송통신"));
		news.add(new NewsClass("SBS", "nsd183257911.gif", "newsstand.naver.com/055",  "방송통신"));
		news.add(new NewsClass("YTN", "nsd17425192.gif", "newsstand.naver.com/052",  "방송통신"));
		news.add(new NewsClass("매일경제", "nsd113526120.gif", "newsstand.naver.com/009",  "경제지"));
		news.add(new NewsClass("머니투데이", "nsd113754824.gif", "newsstand.naver.com/008",  "경제지"));
		news.add(new NewsClass("서울경제", "nsd15338959.gif", "newsstand.naver.com/011",  "경제지"));
		news.add(new NewsClass("아시아경제", "nsd165753754.gif", "newsstand.naver.com/277",  "경제지"));
		news.add(new NewsClass("이데일리", "nsd111247840.gif", "newsstand.naver.com/018",  "경제지"));
		news.add(new NewsClass("ChosunBiz", "nsd19334215.gif", "newsstand.naver.com/366",  "경제지"));
		news.add(new NewsClass("파이낸셜뉴스", "nsd141641302.gif", "newsstand.naver.com/014",  "경제지"));
		news.add(new NewsClass("한국경제", "nsd162034351.gif", "newsstand.naver.com/015",  "경제지"));
		news.add(new NewsClass("해럴드경제", "nsd182749494.gif", "newsstand.naver.com/016",  "경제지"));
		news.add(new NewsClass("노컷뉴스", "nsd101424267.gif", "newsstand.naver.com/079",  "인터넷"));
		news.add(new NewsClass("NEWDAILY", "nsd102245777.gif", "newsstand.naver.com/327",  "인터넷"));
		news.add(new NewsClass("데일리안", "nsd184410246.gif", "newsstand.naver.com/368",  "인터넷"));
		news.add(new NewsClass("미디어오늘", "nsd124110953.gif", "newsstand.naver.com/006",  "인터넷"));
		news.add(new NewsClass("OhmyNews", "nsd102039590.gif", "newsstand.naver.com/047",  "인터넷"));
		news.add(new NewsClass("PRESSian", "nsd184630885.gif", "newsstand.naver.com/002",  "인터넷"));
		news.add(new NewsClass("디지털타임스", "nsd144911195.gif", "newsstand.naver.com/029",  "IT영자지"));
		news.add(new NewsClass("블로터닷넷", "nsd16353971.gif", "newsstand.naver.com/293",  "IT영자지"));
		news.add(new NewsClass("아이뉴스24", "nsd113110902.gif", "newsstand.naver.com/031",  "IT영자지"));
		news.add(new NewsClass("월스트리트저널", "nsd16110689.gif", "newsstand.naver.com/372",  "IT영자지"));
		news.add(new NewsClass("전자신문", "nsd11405830.gif", "newsstand.naver.com/030",  "IT영자지"));
		news.add(new NewsClass("JOONGANG DAILY", "nsd113635939.gif", "newsstand.naver.com/330",  "IT영자지"));
		news.add(new NewsClass("Net Korea", "nsd18341092.gif", "newsstand.naver.com/092",  "IT영자지"));
		news.add(new NewsClass("THE KOREA TIMES", "nsd92244365.gif", "newsstand.naver.com/040",  "IT영자지"));
		news.add(new NewsClass("The Korea Herald", "nsd183039979.gif", "newsstand.naver.com/044",  "IT영자지"));
		news.add(new NewsClass("KBS WORLD", "nsd14465916.gif", "newsstand.naver.com/326",  "IT영자지"));
		news.add(new NewsClass("마이데일리", "nsd113852954.gif", "newsstand.naver.com/117",  "스포츠연예"));
		news.add(new NewsClass("스포츠동아", "nsd16247594.gif", "newsstand.naver.com/314",  "스포츠연예"));
		news.add(new NewsClass("스포츠서울", "nsd184854466.gif", "newsstand.naver.com/073",  "스포츠연예"));
		news.add(new NewsClass("스포츠조선", "nsd184717404.gif", "newsstand.naver.com/076",  "스포츠연예"));
		news.add(new NewsClass("sportalkorea", "nsd16579942.gif", "newsstand.naver.com/139",  "스포츠연예"));
		news.add(new NewsClass("일간스포츠", "nsd113052387.gif", "newsstand.naver.com/241",  "스포츠연예"));
		news.add(new NewsClass("OSEN", "nsd102852391.gif", "newsstand.naver.com/109",  "스포츠연예"));
		news.add(new NewsClass("GameMeca", "nsd183724.gif", "newsstand.naver.com/356",  "매거진전문지"));
		news.add(new NewsClass("과학동아", "nsd165049622.gif", "newsstand.naver.com/363",  "매거진전문지"));
		news.add(new NewsClass("jungle", "nsd165310840.gif", "newsstand.naver.com/345",  "매거진전문지"));
		news.add(new NewsClass("Software", "nsd113744707.gif", "newsstand.naver.com/357",  "매거진전문지"));
		news.add(new NewsClass("법률신문", "nsd165524289.gif", "newsstand.naver.com/122",  "매거진전문지"));
		news.add(new NewsClass("ScienceTimes", "nsd113446808.gif", "newsstand.naver.com/355",  "매거진전문지"));
		news.add(new NewsClass("소년한국일보", "nsd102746161.gif", "newsstand.naver.com/329",  "매거진전문지"));
		news.add(new NewsClass("STYLECOM", "nsd18366175.gif", "newsstand.naver.com/367",  "매거진전문지"));
		news.add(new NewsClass("시사IN Live", "nsd182936757.gif", "newsstand.naver.com/308",  "매거진전문지"));
		news.add(new NewsClass("씨네21", "nsd185025147.gif", "newsstand.naver.com/140",  "매거진전문지"));
		news.add(new NewsClass("Ablenews", "nsd184148949.gif", "newsstand.naver.com/328",  "매거진전문지"));
		news.add(new NewsClass("ELLE", "nsd16411268.gif", "newsstand.naver.com/354",  "매거진전문지"));
		news.add(new NewsClass("여성신문", "nsd164815489.gif", "newsstand.naver.com/310",  "매거진전문지"));
		news.add(new NewsClass("CARLIFE", "nsd135857948.gif", "newsstand.naver.com/362",  "매거진전문지"));
		news.add(new NewsClass("조세신문", "nsd101830214.gif", "newsstand.naver.com/123",  "매거진전문지"));
		news.add(new NewsClass("채널예스", "nsd14034411.gif", "newsstand.naver.com/361",  "매거진전문지"));
		news.add(new NewsClass("코메디닷컴", "nsd14156354.gif", "newsstand.naver.com/296",  "매거진전문지"));
		news.add(new NewsClass("한경BUSINESS", "nsd114627265.gif", "newsstand.naver.com/050",  "매거진전문지"));
		news.add(new NewsClass("한국대학신문", "nsd18493839.gif", "newsstand.naver.com/384",  "매거진전문지"));
		news.add(new NewsClass("헬스조선", "nsd17329660.gif", "newsstand.naver.com/346",  "매거진전문지"));
		news.add(new NewsClass("EBS", "nsd145514832.gif", "newsstand.naver.com/344",  "매거진전문지"));
		news.add(new NewsClass("PC사랑", "nsd15129878.gif", "newsstand.naver.com/364",  "매거진전문지"));
		news.add(new NewsClass("강원도민일보", "nsd16493440.gif", "newsstand.naver.com/335",  "지역지"));
		news.add(new NewsClass("강원일보", "nsd18354817.gif", "newsstand.naver.com/087",  "지역지"));
		news.add(new NewsClass("경기일보", "nsd142922938.gif", "newsstand.naver.com/339",  "지역지"));
		news.add(new NewsClass("경남일보", "nsd11120405.gif", "newsstand.naver.com/333",  "지역지"));
		news.add(new NewsClass("경북일보", "nsd103125356.gif", "newsstand.naver.com/337",  "지역지"));
		news.add(new NewsClass("경인일보", "nsd75053515.gif", "newsstand.naver.com/338",  "지역지"));
		news.add(new NewsClass("광주일보", "nsd113635473.gif", "newsstand.naver.com/083",  "지역지"));
		news.add(new NewsClass("국제신문", "nsd11332053.gif", "newsstand.naver.com/332",  "지역지"));
		news.add(new NewsClass("대전일보", "nsd11342450.gif", "newsstand.naver.com/089",  "지역지"));
		news.add(new NewsClass("매일신문", "nsd184317799.gif", "newsstand.naver.com/088",  "지역지"));
		news.add(new NewsClass("부산일보", "nsd8215253.gif", "newsstand.naver.com/082",  "지역지"));
		news.add(new NewsClass("영남일보", "nsd165845221.gif", "newsstand.naver.com/385",  "지역지"));
		news.add(new NewsClass("울산메일", "nsd14643703.gif", "newsstand.naver.com/386",  "지역지"));
		news.add(new NewsClass("인천일보", "nsd14814726.gif", "newsstand.naver.com/387",  "지역지"));
		news.add(new NewsClass("전남일보", "nsd14941869.gif", "newsstand.naver.com/388",  "지역지"));
		news.add(new NewsClass("전북일보", "nsd183759971.gif", "newsstand.naver.com/336",  "지역지"));
		news.add(new NewsClass("제주도민일보", "nsd19513821.gif", "newsstand.naver.com/389",  "지역지"));
		news.add(new NewsClass("제주의소리", "nsd115524760.gif", "newsstand.naver.com/334",  "지역지"));
		news.add(new NewsClass("중도일보", "nsd17122649.gif", "newsstand.naver.com/390",  "지역지"));
		news.add(new NewsClass("충청일보", "nsd162144955.gif", "newsstand.naver.com/391",  "지역지"));
		news.add(new NewsClass("충청투데이", "nsd14118621.gif", "newsstand.naver.com/331",  "지역지"));
		news.add(new NewsClass("OBS", "nsd101932455.gif", "newsstand.naver.com/340",  "지역지"));

	} // initInsertNewsData() END

} // class END






