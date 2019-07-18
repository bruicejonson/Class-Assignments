package note.note.Service;

import note.note.Model.Note;
import note.note.Model.NoteDisplay;
import note.note.Repository.NoteRepository;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    private List<NoteDisplay> formatNotes( List<Note> notes){
        List<NoteDisplay> displayNotes = formatTimestamps(notes);
        return displayNotes;
    }
    private List<NoteDisplay> formatTimestamps(List<Note> notes){
        List<NoteDisplay> response = new ArrayList<>();
        PrettyTime prettyTime = new PrettyTime();
        SimpleDateFormat simpleDate = new SimpleDateFormat("M/d/yy");
        Date now = new Date();
        for(Note note : notes) {
            NoteDisplay noteDisplay = new NoteDisplay();
            noteDisplay.setId(note.getId());
            noteDisplay.setTitle(note.getTitle());
            noteDisplay.setMessage(note.getMessage());
            long diffInMillies = Math.abs(now.getTime() - note.getCreatedAt().getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            if (diff > 3) {
                noteDisplay.setDate(simpleDate.format(note.getCreatedAt()));
            }else {
                noteDisplay.setDate(prettyTime.format(note.getCreatedAt()));
            }        response.add(noteDisplay);
        }
        return response;
    }

    public List<NoteDisplay> findAll(){
        List<Note> notes = noteRepository.findAllByOrderByCreatedAtDesc();
        return formatNotes(notes);
    }
    public void save(Note note){
        noteRepository.save(note);
    }

    public void deleteNote(long id){
        noteRepository.deleteById(id);
    }

    public Note findById(long id){
        return noteRepository.findById(id).get();
    }
}