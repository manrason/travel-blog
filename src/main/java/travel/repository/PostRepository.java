package travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import travel.model.Post;
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}