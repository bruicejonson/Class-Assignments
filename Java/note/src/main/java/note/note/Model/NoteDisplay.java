package note.note.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class NoteDisplay {
    private Long id;
    private String title;
    private String message;
    private String date;
}