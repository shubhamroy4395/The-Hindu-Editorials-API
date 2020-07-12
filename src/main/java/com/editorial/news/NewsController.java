package com.editorial.news;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.editorial.news.dao.NewsDao;
import com.editorial.news.model.News;

@RestController
public class NewsController {

	@Autowired
	private NewsDao newsDao;
	
	@GetMapping(path = "/hindu")
	public Map<String, List<News>> getAllNews() throws IOException {
		return newsDao.getAllNews();
	}
}
