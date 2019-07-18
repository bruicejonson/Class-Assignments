package note.note.Controller;
import note.note.Model.Note;
import note.note.Model.NoteDisplay;
import note.note.Service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping(value={"/notes","/"})
    public String getNotes(Model model){
        List<NoteDisplay> notes;
        notes = noteService.findAll();
        model.addAttribute("noteList",notes);
        return "Note";
    }
    @GetMapping(value="/notes/new")
    public String getNewNote(Model model){
        model.addAttribute("note", new Note());
        return "newNote";
    }
    @GetMapping(value = "/notes/{id}")
    public String getNote(@PathVariable Long id, Model model){
        model.addAttribute("note", noteService.findById(id));
        return "editNote";
    }
    @PostMapping(value = "/notes")
    public String submitNewNote(@Valid Note note, BindingResult bindingResult,Model model){
        if (!bindingResult.hasErrors()){
            noteService.save(note);
            model.addAttribute("successMessage","Note Successfully Created !");
            model.addAttribute("note",new Note());
            return getNotes(model);
        }
        return "newNote";
    }
    @PutMapping(value = "/notes")
    public String saveResource(Note note){
        note.setCreatedAt(new Date());
        noteService.save(note);
        return "redirect:/notes";
    }
    @DeleteMapping(value = "/notes")
    public String deleteResource(@RequestParam Long id){
        noteService.deleteNote(id);
        return "redirect:/notes";
    }
}