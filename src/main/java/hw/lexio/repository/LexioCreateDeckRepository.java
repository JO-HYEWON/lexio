package hw.lexio.repository;

import hw.lexio.entity.CreateDeck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LexioCreateDeckRepository extends JpaRepository<CreateDeck, Long> {

}
