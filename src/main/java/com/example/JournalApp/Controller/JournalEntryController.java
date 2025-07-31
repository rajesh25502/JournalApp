package com.example.JournalApp.Controller;

import com.example.JournalApp.Entity.JournalEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntryMap=new HashMap<>();
    @GetMapping("/getAllJournal")
    public ResponseEntity<List<JournalEntry>>  getAll()
    {
        return new ResponseEntity<>(new ArrayList<>(journalEntryMap.values()), HttpStatus.OK);
    }
    @GetMapping("/getJournal/{id}")
    public ResponseEntity<JournalEntry>  getJournal(@PathVariable Long id)
    {

        return new ResponseEntity<>(journalEntryMap.get(id), HttpStatus.OK);
    }
    @PostMapping("/addJournal")
    public ResponseEntity<JournalEntry>  addJournalEntry(@RequestBody JournalEntry entry)
    {
//        JournalEntry en=new JournalEntry();
//        en.setId(entry.getId());
//        en.setTitle(entry.getTitle());
//        en.setContent(entry.getContent());
        journalEntryMap.put(entry.getId(),entry);
        return new ResponseEntity<>(entry, HttpStatus.CREATED);
    }
}
