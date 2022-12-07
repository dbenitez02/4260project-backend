package cpp.edu.backend.entity;

import lombok.Data;
import javax.persistence.*;
import cpp.edu.backend.entity.Course;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Entity
@Table(name="section")
@Getter
@Setter

public class Section {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private  Long id;

    private  Long number;

    private Long year;

    private String semester;

    @Column(name="course_id")
    private Long courseId;

}
