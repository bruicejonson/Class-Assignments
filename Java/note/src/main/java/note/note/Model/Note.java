package note.note.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "note_id")
    private Long id;

    @NotEmpty(message = "Title cannot be empty")
    @Length(max = 30, message = "Title cannot have more than 30 characters")
    private String Title;

    @NotEmpty(message = "Note cannot be empty")
    @Length(max = 140, message = "Note cannot have more than 140 characters")
    private String message;

    @CreationTimestamp
    private Date createdAt;
}
