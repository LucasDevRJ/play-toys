package play.toys.api.brinquedo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {

    Page<Brinquedo> findAllByAtivoTrue(Pageable paginacao);
}
