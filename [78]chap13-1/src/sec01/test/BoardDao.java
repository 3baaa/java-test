package sec01.test;

import java.util.*;

public class BoardDao {
	List<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
	}
	public List<Board> getBoardList(){
		return list;
	}
}
