package demo.onlineshop.repo;

import demo.onlineshop.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository <TestModel, Integer>{
}
