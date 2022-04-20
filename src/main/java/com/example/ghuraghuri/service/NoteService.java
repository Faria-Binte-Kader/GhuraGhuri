package com.example.ghuraghuri.service;

import com.example.ghuraghuri.model.Note;

import java.util.List;

public interface NoteService {
    public Note newNote(Note note);
    public List<Note> findNoteByPlanId(Long planid);
    public Note updateNote(Note note);
    public void deleteNote(Note note);
}
