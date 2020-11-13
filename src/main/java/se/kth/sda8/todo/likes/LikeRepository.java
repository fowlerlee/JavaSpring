package se.kth.sda8.todo.likes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository <Like, Long> {
    List<Like> findAllByArticleId(Long articleId);
}
