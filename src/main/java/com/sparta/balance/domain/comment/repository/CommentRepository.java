package com.sparta.balance.domain.comment.repository;

import com.sparta.balance.domain.comment.entity.Comment;
import com.sparta.balance.domain.game.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByGame(Game game);
}