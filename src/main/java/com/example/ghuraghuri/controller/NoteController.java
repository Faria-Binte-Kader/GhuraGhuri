package com.example.ghuraghuri.controller;


import com.example.ghuraghuri.model.Note;
import com.example.ghuraghuri.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
@CrossOrigin
public class NoteController {

    @Autowired
    NoteService noteService;

    @PostMapping("/add")
    public String addNote(@RequestBody Note note){
        noteService.newNote(note);
        return "New Note added" + note.getPlanId();
    }

    @GetMapping("getByPlanId/planid")
    public ResponseEntity<List<Note>> getByPlanId(@RequestParam Long planid){
        return new ResponseEntity<List<Note>>(noteService.findNoteByPlanId(planid), HttpStatus.OK);
    }

    /*@PostMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Note> updateNote(@RequestBody Note note){
        List<Note> notes = noteService.findByPlanId(note.getId());
        notes.get(0).setDescription(note.getDescription());
        final Note updatedNote = noteService.updateNote(notes.get(0));
        return ResponseEntity.ok(updatedNote);
    }

    @PostMapping("/delete")
    public String deleteNote(@RequestBody Note note){
        noteService.deleteNote(note);
        return "Note deleted";
    }*/
}
