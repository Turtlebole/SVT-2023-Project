package com.example.baraotome.service.implementation;

import com.example.baraotome.model.entity.Reaction;
import com.example.baraotome.repository.PostRepository;
import com.example.baraotome.repository.ReactionRepository;
import com.example.baraotome.repository.UserRepository;
import com.example.baraotome.service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Service
public class ReactionServiceImpl implements ReactionService {
    @Autowired
    private ReactionRepository reactionRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;
    @Override
    public Reaction createReaction(Reaction reaction) {
        reaction.setTimestamp(LocalDateTime.now());
        Reaction createdReaction = reactionRepository.save(reaction);
        return createdReaction;
    }

    @Override
    public List<Reaction> getByPost(Integer post) {
        List<Reaction> reactions = new ArrayList<>();
        List<Reaction> allReactions = reactionRepository.findAll();
        for (Reaction reaction : allReactions) {
            if (reaction.getPost().getId() == post) {
                reactions.add(reaction);
            }
        }
        return reactions;
    }

    @Override
    public List<Reaction> getAllReactions() {
        return reactionRepository.findAll();
    }

    @Override
    public Reaction findById(Integer reaction) {
        return reactionRepository.findById(reaction).orElse(null);
    }

    @Override
    public void delete(Integer reaction) {
        reactionRepository.deleteById(reaction);
    }

}
