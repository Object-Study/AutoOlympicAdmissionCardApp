package object.olympic.domain.Games.repository;

import object.olympic.domain.Games.entity.GameForTicketing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameForTicketing, Long> {
}
