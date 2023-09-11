package com.example.baraotome.service;

import com.example.baraotome.model.entity.Reaction;
import com.example.baraotome.model.entity.User;

import java.util.List;

public interface ReactionService {
    Reaction createReaction(Reaction reaction);
    List<Reaction> getAllReactions();
    List<Reaction> getByPost(Integer post);
    Reaction findById(Integer reaction);
    void delete(Integer reaction);
}
