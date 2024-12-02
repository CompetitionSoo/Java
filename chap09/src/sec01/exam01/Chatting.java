package sec01.exam01;

public class Chatting {
	void startChat(String chatId) {
		
		/*
		nickName 은 로컬 클래스 Chat 입장에서 final 특성을 가져야 하기 때문에
		nickName 의 값이 변경된다면 이는 에러 유발한다
		값을 변경하지 말아야한다...

		결론
		5~6번줄을
		String nickName = chatid;
		*/
				
		String nickName = null;
		nickName =chatId;
				
		class Chat {
			public void start() {
				while(true){
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}
