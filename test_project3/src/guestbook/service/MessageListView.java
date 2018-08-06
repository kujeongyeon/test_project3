package guestbook.service;

import java.util.List;
import guestbook.model.Message;

public class MessageListView {
	
	private int messageTotalCount; //메시지의 전체 개수
	private int currentPageNumber; //요청 페이지의 번호
	private List<Message> messageList; // 메시지 목록
	private int pageTotalCount; // 전체 페이지 개수
	private int messageCountPerPage; //페이지당 메시지 출력 개수 
	private int firstRow; //시작행
	private int endRow; //끝행
	
	public MessageListView(List<Message> messageList, int messageTotalCount,
			int currentPageNumber, int messageCountPerPage) {
		this.messageList = messageList;
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageCountPerPage = messageCountPerPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		
		calculatePageTotalCount();
	}

	private void calculatePageTotalCount() {
		if (messageTotalCount == 0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = messageTotalCount / messageCountPerPage;
			if (messageTotalCount % messageCountPerPage > 0) {
				pageTotalCount ++;
			}
		}
	}
	
	
	

}
