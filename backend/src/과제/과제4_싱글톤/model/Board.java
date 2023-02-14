package 과제.과제4_싱글톤.model;

/*
 	model 관계
 		1. 한명의 회원이 글을 작성함.
 		2. 회원은 여러개의 글을 작성함.
 		
 */
public class Board {
	//필드
	private String title;
	private String content;
	private int view;
	private Member member;
	
	
	
	//생성자
	public Board() {super();}
	
	public Board(String title, String content, int view, Member member) {
		super();
		this.title = title;
		this.content = content;
		this.view = view;
		this.member = member;
	}
	

	//메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", view=" + view + ", member=" + member + "]";
	}
	
	
}


 