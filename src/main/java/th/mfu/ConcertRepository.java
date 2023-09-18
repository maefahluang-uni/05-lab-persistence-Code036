package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Concert;

//TODO: add extends CrudRepository<Concert, Long> to get CRUD operations
public interface ConcertRepository extends CrudRepository<Concert, Long>{
    
}