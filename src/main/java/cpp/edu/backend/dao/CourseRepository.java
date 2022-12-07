package cpp.edu.backend.dao;

import cpp.edu.backend.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
        public interface CourseRepository extends JpaRepository<Course,Long>{

}
