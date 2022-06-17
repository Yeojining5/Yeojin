package oracle.vo;

// private - 외부 위변조를 막기 위해 사용
//  그대신 public한 get set 메소드로 접근할 수 있음
// 원칙적으로는 빈문자열""이 아닌 null을 써야함

public class MemberVO {
	private int mem_no = 0; // 
	private String mem_id = null;    
	private String mem_pw = null;    
	private String mem_name = null;
	private String mem_zipcode = null;
	private String mem_address = null;	
	private String command = null;	

	
	public MemberVO() {
		
	}
	public MemberVO(int mem_no, String mem_id, String mem_pw, String mem_name) {
		this.mem_no = mem_no;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_zipcode = mem_zipcode;
		this.mem_address = mem_address;
		
	}
	// 파라미터가 없는 대신 리턴타입이 있음
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_zipcode() {
		return mem_zipcode;
	}
	public void setMem_zipcode(String mem_zipcode) {
		this.mem_zipcode = mem_zipcode;
	}
	public String getMem_address() {
		return mem_address;
	}
	public void setMem_address(String mem_address) {
		this.mem_address = mem_address;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
}
/*
1,apple,123,애플
2,tomato,123,토마토
3,banana,123,바나나
*/