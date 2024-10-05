package lk.ijse.ncv2.service;



import lk.ijse.ncv2.dto.NoteStatus;
import lk.ijse.ncv2.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    void saveNote(NoteDTO noteDTO);
    List<NoteDTO> getAllNotes();
    NoteStatus getNote(String noteId);
    void deleteNote(String noteId);
    void updateNote(String noteId, NoteDTO noteDTO);
}
