package ajdbc.member;

import oracle.vo.MemberVO;

public class MemberSimulation {
// 단위테스트용 클래스
	public static void main(String[] args) {
		MemberShip ms = new MemberShip();
		//boolean isOk = ms.idCheck("tomato");
		//System.out.println(isOk);
		MemberVO pmVO = new MemberVO();
		pmVO.setMem_id("test");
		pmVO.setMem_pw("123");
		pmVO.setMem_name("강감찬");
		pmVO.setMem_zipcode("12345");
		pmVO.setMem_address("서울시 마포구 공덕동");
		int result = ms.memberInsert(pmVO);
		System.out.println("result ==> "+result); // 1이면 입력 성공
	}

}
