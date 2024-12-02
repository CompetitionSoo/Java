package review;

class CheckBox {
	OnSelectListener listener;
	//내가 가지고 있는 이벤트 처리 객체의 기능을 외부로부터 전달 받겠다.
	void setOnSelectListener(OnSelectListener lister) {
		this.listener = listener;
	}
		
	// 이벤트 처리 객체를 실제로 호출할 때 호출할 메소드
	void select(){
		listener.onSelect();
	}
	
	static interface OnSelectListener {
		void onSelect();
	}
}
	public class CheckBoxExample {	
	public static void main(String[] args) {
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(
		
		new CheckBox.OnSelectListener(){
			@Override
			public	void onSelect() {
				System.out.println("배경을 변경합니다.");
			}
		}
		);
		checkBox.select();	
		}
}