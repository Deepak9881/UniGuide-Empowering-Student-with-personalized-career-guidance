package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.AppFeedback;

public interface AppFeedbackService {

	void giveFeedback(AppFeedback fb);

	List<AppFeedback> getfeedback();



}
