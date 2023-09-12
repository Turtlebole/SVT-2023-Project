package com.example.baraotome.controller;

import com.example.baraotome.model.dto.PostDTO;
import com.example.baraotome.security.TokenUtils;
import com.example.baraotome.service.GroupService;
import com.example.baraotome.service.PostService;
import com.example.baraotome.service.ReactionService;
import com.example.baraotome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.baraotome.model.entity.Group;
import com.example.baraotome.model.entity.Post;
import com.example.baraotome.model.entity.Reaction;
import com.example.baraotome.model.entity.User;
import com.example.baraotome.model.dto.GroupDTO;
import com.example.baraotome.security.TokenUtils;
import com.example.baraotome.service.GroupService;
import com.example.baraotome.service.PostService;
import com.example.baraotome.service.ReactionService;
import com.example.baraotome.service.UserService;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/posts")
@CrossOrigin(origins = "http://localhost:4200")
public class PostController {

    @Autowired
    GroupService groupService;

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @Autowired
    ReactionService reactionService;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    TokenUtils tokenUtils;

    @GetMapping()
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        List<Post> posts = postService.getAllPosts();
        List<PostDTO> postDTOs = new ArrayList<>();

        for (Post post : posts) {
            PostDTO postDTO = new PostDTO();
            postDTO.setContent(post.getContent());
            postDTO.setUserName(post.getUser().getUsername());
            postDTO.setId(post.getId());
            postDTO.setGroupId(post.getGroup().getId());
            postDTOs.add(postDTO);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("SMOSMIIIIIIM");
        }

        return ResponseEntity.ok(postDTOs);
    }


}
