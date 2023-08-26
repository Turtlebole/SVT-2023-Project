package com.example.backend.Repository;

import com.example.backend.Models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    Optional<Comment> findFirstById(int id);
    @Query(value = "select c from Comment c where c.user.id = :user")
    Set<Comment> findUserComment(@Param("user") Integer user);
    @Query(value = "select c from Comment c where c.user.id = :post")
    Set<Comment> findPostComment(@Param("post") Integer post);
}
