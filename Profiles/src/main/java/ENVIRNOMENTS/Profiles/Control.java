package ENVIRNOMENTS.Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	
	@Autowired
	StudentRepo sr;
	
	@GetMapping("student/{id}")
	public Student std(@PathVariable("id")int id)
	{
		Student st=sr.findById(id).orElse(null);
		return st;
	}
	

}
