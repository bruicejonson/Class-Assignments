package note.note.Repository;

import note.note.Model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
    List<Note> findAllByOrderByCreatedAtDesc();
}
