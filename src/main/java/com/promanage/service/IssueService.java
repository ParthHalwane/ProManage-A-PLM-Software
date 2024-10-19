package com.promanage.service;

import java.util.List;
import java.util.Optional;

import com.promanage.modal.Issue;
import com.promanage.modal.User;
import com.promanage.request.IssueRequest;

public interface IssueService {

	Issue getIssueById(Long issueId) throws Exception;

	List<Issue> getIssueProjectId(Long projectId) throws Exception;

	Issue createIssue(IssueRequest issue, User user) throws Exception;

	void deleteIssue(Long issueId, Long userId) throws Exception;

	Issue addUserToIssue(Long issueId, Long userId) throws Exception;

	Issue updateStatus(Long issueId, String status) throws Exception;
}
