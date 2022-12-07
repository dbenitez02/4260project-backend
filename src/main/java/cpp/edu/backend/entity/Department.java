package cpp.edu.backend.entity;

import lombok.Getter;
import lombok.Setter;
import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="department")
@Getter
@Setter

public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private  Long id;

    private  String code;

    private String name;


    @OneToMany()
    private Set<Course> course;
}
