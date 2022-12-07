package cpp.edu.backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    // @Column(name = "sku")
    private String number;

    private String title;

    private String description;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;
}