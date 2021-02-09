package boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.dao.MysqlReviewMapper;
import boot.dto.ReviewDto;

@CrossOrigin
@RestController
public class ReactReviewController {
	
	@Autowired
	MysqlReviewMapper mapper;
	
	@GetMapping("/review/list")
	public List<ReviewDto> getList()
	{
		
		return mapper.getAllDatas();
	}


}
