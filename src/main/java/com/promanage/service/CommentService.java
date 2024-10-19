package com.promanage.service;

import java.util.List;

import com.promanage.modal.Comment;

public interface CommentService {
	Comment createComment(Long issueId, Long userId, String comment);
	
	void deleteComment(Long commentId, Long userId);
	
	List<Comment> findCommentByIssueId(Long issueId);
}
