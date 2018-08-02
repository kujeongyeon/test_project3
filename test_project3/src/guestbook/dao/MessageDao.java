package guestbook.dao;

import java.sql.*;
import java.util.*;

import guestbook.model.Message;
import jdbc.JdbcUtil;

public class MessageDao {

	private static MessageDao messageDao = new MessageDao();
	public static MessageDao getInstance() {
		return messageDao;
	}
	
}
